package rwcsim.test;

import org.apache.log4j.Logger;
import rwcsim.basicutils.AttackType;
import rwcsim.basicutils.Configuration;
import rwcsim.basicutils.Formation;
import rwcsim.basicutils.managers.UnitFormationManager;
import rwcsim.basicutils.systems.AttackLoop;
import rwcsim.basicutils.unit.DeployableUnit;
import rwcsim.factions.daqan.Spearmen;
import rwcsim.factions.waiqar.Reanimates;
import rwcsim.interactions.DefaultInteractionManager;
import rwcsim.interactions.InteractionManager;

public class MassAttackLoopTest {
    private static Logger log = Logger.getLogger(MassAttackLoopTest.class);

//    public static int SIM_COUNT = 1000000;
    public static int SIM_COUNT = 1;
    public static int DEMARKATION = 100000;
    public static AttackType attackType = AttackType.MELEE_ATTACK;

    InteractionManager waiqarInteraction;
    InteractionManager daqanInteraction;

    DeployableUnit waiqarUnit;
    DeployableUnit daqanUnit;

    UnitFormationManager waiqarFormation;
    UnitFormationManager daqanFormation;


    public void reset() {
        waiqarInteraction = DefaultInteractionManager.instance();
        daqanInteraction = DefaultInteractionManager.instance();

        waiqarUnit = new DeployableUnit(new Reanimates(), Formation.THREE_BY_TWO);
        daqanUnit = new DeployableUnit(new Spearmen(), Formation.THREE_BY_TWO);

        waiqarFormation = new UnitFormationManager(waiqarUnit);
        daqanFormation = new UnitFormationManager(daqanUnit);
    }


    public void simulationLoop() {
        for (int i = 0; i<SIM_COUNT; i++) {
            if (i != 0 && i % DEMARKATION == 0) {
                System.out.println("Processing: " + i);
            }

            reset();

            AttackLoop attackLoop;

            InteractionManager attackerInteraction;
            InteractionManager defenderInteraction;

            UnitFormationManager attackerFormation;
            UnitFormationManager defenderFormation;

            int rounds = 0;
            while ((waiqarFormation.isAlive() && daqanFormation.isAlive()) && rounds <= 7) {
                log.info("Round: "+ rounds);
//            System.out.println("Round: "+rounds);
                if (rounds % 2 == 0) {
                    attackerInteraction = waiqarInteraction;
                    attackerFormation = waiqarFormation;
                    defenderInteraction = daqanInteraction;
                    defenderFormation = daqanFormation;
                } else {
                    defenderInteraction = waiqarInteraction;
                    defenderFormation = waiqarFormation;
                    attackerInteraction = daqanInteraction;
                    attackerFormation = daqanFormation;
                }

                attackLoop = new AttackLoop(attackerInteraction, attackerFormation, defenderInteraction, defenderFormation, attackType);
                attackLoop.processAttack();

                if (defenderFormation.isAlive()) {
                    attackLoop = new AttackLoop(defenderInteraction, defenderFormation, attackerInteraction, attackerFormation, attackType);
                    attackLoop.processAttack();
                }
                rounds++;
            }

            String message = waiqarFormation.isAlive()?"Waiqar is Alive":"Waiqar is Dead";
            log.info(message);
            message = waiqarFormation.isAlive()?"Daqan is Alive":"Daqan is Dead";
            log.info(message);
        }
    }







    public static void main(String[] args) {
        Configuration.getInstance();
        MassAttackLoopTest malt = new MassAttackLoopTest();
        malt.simulationLoop();
    }
}
