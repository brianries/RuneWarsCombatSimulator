package rwcsim.test;

import junit.framework.TestCase;
import org.jmock.Mockery;
import rwcsim.base.AttackType;
import rwcsim.base.Configuration;
import rwcsim.base.Formation;
import rwcsim.base.systems.AttackLoop;
import rwcsim.factions.base.DeployableUnit;
import rwcsim.factions.daqan.Spearmen;
import rwcsim.factions.waiqar.Reanimates;
import rwcsim.utils.interaction.DefaultInteractionManager;
import rwcsim.utils.interaction.InteractionManager;

public class TestAttackLoop extends TestCase {
    Mockery context = new Mockery();

    AttackType attackType;

    InteractionManager attacker;
    InteractionManager defender;

    DeployableUnit attackingUnit;
    DeployableUnit defendingUnit;


    public void setup() {
        Configuration.getInstance().reloadProperties();
        System.out.println(Configuration.getInstance().get("test.message"));
        attackType = AttackType.MELEE_ATTACK;

        attacker = DefaultInteractionManager.instance();
        defender = DefaultInteractionManager.instance();

        attackingUnit = new DeployableUnit(new Reanimates(), Formation.THREE_BY_TWO);
        defendingUnit = new DeployableUnit(new Spearmen(), Formation.THREE_BY_TWO);

    }

    public void testAttackLoop() {
        setup();
        AttackLoop al = new AttackLoop(attacker, attackingUnit, defender, defendingUnit, attackType);

        al.processAttack();




    }
}
