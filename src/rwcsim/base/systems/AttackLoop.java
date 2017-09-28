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


public class AttackLoop {
    AttackType attackType;

    InteractionManager attacker;
    InteractionManager defender;

    DeployableUnit attackingUnit;
    DeployableUnit defendingUnit;

    DiePool attackPool;
    int[] adjustmentPool = new int[]{0,0,0};
    Map<Die, List<DieFace>> rollResults;
    Map<Die, List<DieFace>> rerollResults;


    public AttackLoop(InteractionManager attacker, DeployableUnit attackingUnit, InteractionManager defender, DeployableUnit defendingUnit, AttackType type) {
        this.attackType = type;
        this.attacker = attacker;
        this.attackingUnit = attackingUnit;

        this.defender = defender;
        this.defendingUnit = defendingUnit;
    }

    public void processAttack() {
        attackPool = attackingUnit.getDiePool(attackType);
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
        //List<State> states = attackingUnit.unitStateManager.getAllStates(new FlankingState(defendingUnit.getUnit()));
        //long flankingCount = states.stream().filter(s -> ((FlankingState)s).getFlanking() == defendingUnit.getUnit()).count();
//        int[] adjustmentPool = new int[]{0,0,0};
//        if (flankingCount > 0) {
//            adjustmentPool = attacker.defineFlankingPool();
//        }
//        int[] adjustedPool = attackPool.getAttackPool(adjustmentPool);
        rollResults = Roller.rollPool(adjustmentPool);
    }

    private void rerollForExtraRanks() {
        if (attackingUnit.canReroll()){
            rerollResults = attacker.reroll(attackingUnit.getRerollDieCount(), attackingUnit.hasPartialRank(), attackingUnit, rollResults, attackType);
        }
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

