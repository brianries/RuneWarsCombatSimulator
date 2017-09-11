package rwcsim.base.systems;

import rwcsim.factions.base.Unit;
import rwcsim.utils.interaction.InteractionManager;

public class AttackLoop {
    InteractionManager attacker;
    InteractionManager defender;

    Unit attackingUnit;
    Unit defendingUnit;



    public AttackLoop(InteractionManager attacker, Unit attackingUnit, InteractionManager defender, Unit defendingUnit) {
        this.attacker = attacker;
        this.attackingUnit = attackingUnit;

        this.defender = defender;
        this.defendingUnit = defendingUnit;



    }

    public void processAttack() {

    }

}
