package rwcsim.basicutils.systems;

import org.apache.log4j.Logger;
import rwcsim.basicutils.AttackType;
import rwcsim.basicutils.dice.*;
import rwcsim.basicutils.managers.UnitFormationManager;
import rwcsim.interactions.InteractionManager;

import java.util.List;
import java.util.Map;


public class AttackLoop {

    private static final Logger log = Logger.getLogger(AttackLoop.class);
    AttackType attackType;

    InteractionManager attacker;
    InteractionManager defender;

    UnitFormationManager attackingUnit;
    UnitFormationManager defendingUnit;

    DiePool attackPool;
    int[] adjustmentPool = new int[]{0,0,0};
    Map<Die, List<DieFace>> rollResults;
    Map<Die, List<DieFace>> rerollResults;


    public AttackLoop(InteractionManager attacker, UnitFormationManager attackingUnit, InteractionManager defender, UnitFormationManager defendingUnit, AttackType type) {
        this.attackType = type;
        this.attacker = attacker;
        this.attackingUnit = attackingUnit;

        this.defender = defender;
        this.defendingUnit = defendingUnit;
    }

    public void processAttack() {
        log.info("processAttack()");
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
        log.debug("rollDice()");

        //List<State> states = attackingUnit.unitStateManager.getAllStates(new FlankingState(defendingUnit.getUnit()));
        //long flankingCount = states.stream().filter(s -> ((FlankingState)s).getFlanking() == defendingUnit.getUnit()).count();
//        int[] adjustmentPool = new int[]{0,0,0};
//        if (flankingCount > 0) {
//            adjustmentPool = attacker.defineFlankingPool();
//        }
//        int[] adjustedPool = attackPool.getAttackPool(adjustmentPool);
        rollResults = Roller.rollPool(attackPool);
    }

    private void rerollForExtraRanks() {
        log.debug("rerollForExtraRanks()");
        if (attackingUnit.canReroll()){
            rerollResults = attacker.reroll(attackingUnit.getRerollDieCount(), attackingUnit.hasPartialRank(), attackingUnit, rollResults, attackType);
        }
    }

    private void modifyDice() {
        log.debug("modifyDice()");
//        attacker.modifyAttackRoll();
//        defender.modifyAttackRoll();
    }

    private void spendSurges() {
        log.debug("spendSurges()");
        int surgeCount = DieRollResultsAnalyzer.countAllSurges(rerollResults);
        log.info("Surges: "+surgeCount);
        if (surgeCount>0) {
            attacker.applySurges(attackingUnit, defendingUnit, surgeCount);
        }
    }

    private void assignAccuracy() {
        log.debug("assignAccuracy()");
        int accuracyCount = DieRollResultsAnalyzer.countAllAccuracies(rerollResults);
        log.info("Accuracies: "+accuracyCount);
        if (accuracyCount>0) {
            attacker.assignAccuracies(defendingUnit, accuracyCount);
        }
    }

    private void spendMortalStrikes() {
        log.debug("spendMortalStrikes()");
        int mortalStrikeCount = DieRollResultsAnalyzer.countMortalStrikes(rerollResults);
        log.info("MortalStrikes: "+ mortalStrikeCount);
        if (mortalStrikeCount>0) {
            attacker.applyMortalStrikes(defendingUnit, mortalStrikeCount);
        }
    }

    private void spendHits() {
        log.debug("spendHits()");
        int hitCount = DieRollResultsAnalyzer.countAllHits(rerollResults);
        log.info("Hits: "+ hitCount);
        if (hitCount>0) {
            attacker.applyHits(defendingUnit, hitCount);
        }
    }

    private void reconfigure() {
        log.debug("reconfigure()");

    }

    private void resolveMorale() {
        log.debug("resolveMorale()");
        int moraleCount = DieRollResultsAnalyzer.countAllMorale(rerollResults);
        log.info("Morale: "+moraleCount);
        if (moraleCount>0) {
            attacker.applyMorale(defendingUnit, moraleCount);
        }
    }
}

