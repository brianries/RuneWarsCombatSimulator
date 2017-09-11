package rwcsim.base.systems;

import rwcsim.base.AttackType;
import rwcsim.base.states.FlankingState;
import rwcsim.base.states.State;
import rwcsim.factions.base.DeployableUnit;
import rwcsim.utils.dice.Die;
import rwcsim.utils.dice.DieFace;
import rwcsim.utils.dice.DiePool;
import rwcsim.utils.dice.Roller;
import rwcsim.utils.interaction.InteractionManager;

import java.util.List;
import java.util.Map;

import static rwcsim.utils.dice.Roller.rollPool;

public class AttackLoop {
    AttackType attackType;

    InteractionManager attacker;
    InteractionManager defender;

    DeployableUnit attackingUnit;
    DeployableUnit defendingUnit;



    public AttackLoop(InteractionManager attacker, DeployableUnit attackingUnit, InteractionManager defender, DeployableUnit defendingUnit, AttackType type) {
        this.attackType = type;
        this.attacker = attacker;
        this.attackingUnit = attackingUnit;

        this.defender = defender;
        this.defendingUnit = defendingUnit;
    }

    public void processAttack() {
        rollDice();
        rerollForExtraRanks();
        modifyDice();
        spendSurges();
        assignAccuracy();
        spendMortalStrikes();
        spendHits();
        reconfigure();
        resolveMorale();
    }

    private void rollDice() {
        DiePool attackPool = attackingUnit.getDiePool(attackType);
        List<State> states = attackingUnit.unitStateManager.getAllStates(new FlankingState(defendingUnit.getUnit()));
        long flankingCount = states.stream().filter(s -> ((FlankingState)s).getFlanking() == defendingUnit.getUnit()).count();
        int[] adjustmentPool = new int[]{0,0,0};
        if (flankingCount > 0) {
            adjustmentPool = attacker.defineFlankingPool();
        }
        int[] adjustedPool = attackPool.getAttackPool(adjustmentPool);
        Map<Die, List<DieFace>> results = Roller.rollPool(adjustedPool);

        if (attackingUnit.canReroll()){
            results = attacker.reroll(attackingUnit, adjustedPool, results);
        }


    }

    private void rerollForExtraRanks() {

    }

    private void modifyDice() {

    }

    private void spendSurges() {

    }

    private void assignAccuracy() {

    }

    private void spendMortalStrikes() {

    }

    private void spendHits() {

    }

    private void reconfigure() {

    }

    private void resolveMorale() {

    }
}

