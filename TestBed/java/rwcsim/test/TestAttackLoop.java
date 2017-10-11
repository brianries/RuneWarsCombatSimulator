package rwcsim.test;

import junit.framework.TestCase;
import rwcsim.basicutils.AttackType;
import rwcsim.basicutils.Configuration;
import rwcsim.basicutils.Formation;
import rwcsim.basicutils.systems.AttackLoop;
import rwcsim.basicutils.managers.UnitFormationManager;
import rwcsim.basicutils.unit.DeployableUnit;
import rwcsim.factions.daqan.Spearmen;
import rwcsim.factions.waiqar.Reanimates;
import rwcsim.interactions.DefaultInteractionManager;
import rwcsim.interactions.InteractionManager;

public class TestAttackLoop extends TestCase {

    AttackType attackType;

    InteractionManager attacker;
    InteractionManager defender;

    DeployableUnit attackingUnit;
    DeployableUnit defendingUnit;

    UnitFormationManager attackingFormation;
    UnitFormationManager defendingFormation;


    public void setup() {
        Configuration.getInstance().reloadProperties();
        System.out.println(Configuration.getInstance().get("test.message"));
        attackType = AttackType.MELEE_ATTACK;

        attacker = DefaultInteractionManager.instance();
        defender = DefaultInteractionManager.instance();

        attackingUnit = new DeployableUnit(new Reanimates(), Formation.THREE_BY_TWO);
        defendingUnit = new DeployableUnit(new Spearmen(), Formation.THREE_BY_TWO);

        attackingFormation = new UnitFormationManager(attackingUnit);
        defendingFormation = new UnitFormationManager(defendingUnit);

    }

    public void testAttackLoop() {
        setup();
        AttackLoop al = new AttackLoop(attacker, attackingFormation, defender, defendingFormation, attackType);

        al.processAttack();




    }
}
