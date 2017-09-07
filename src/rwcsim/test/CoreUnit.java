package rwcsim.test;

import rwcsim.base.ActionType;
import rwcsim.base.Formation;
import rwcsim.utils.dice.DiePool;
import rwcsim.utils.statistics.DieStatisticCounter;
import rwcsim.utils.dice.Roller;
import rwcsim.utils.interaction.DefaultInteractionManager;

import java.util.List;

/**
 * Created by dsayles on 8/17/17.
 */
public class CoreUnit {
    DieStatisticCounter dsc = new DieStatisticCounter();
    Formation formation;
    int[] unitStats;
    DiePool diePool;

    int unitHitCount;


    public void incrementStat(int statid) {
        dsc.increment(statid);
    }
    public void incrementStatBy(int statid, int count) {
        dsc.incrementBy(statid, count);
    }

    public CoreUnit(){}
    public CoreUnit(Formation formation, int[] unitStats, DiePool diePool) {
        this.formation = formation;
        this.unitStats = unitStats;
        this.diePool = diePool;
        unitHitCount = unitStats[CSim.UNITS_PER_TRAY] * unitStats[CSim.HITS] * formation.getTrayCount();
    }


    public List<ActionType> attack() {
        return Roller.rollPool(diePool.getAttackPool(), this, DefaultInteractionManager.instance());
    }


    public boolean applyResults(CoreUnit attacker, List<ActionType> ats) {
        int b = (int)ats.stream().filter(actionType -> actionType==ActionType.BLANK).count();
        int a = (int)ats.stream().filter(actionType -> actionType==ActionType.ACCURACY).count();
        int h = (int)ats.stream().filter(actionType -> actionType==ActionType.HIT).count();
        int m = (int)ats.stream().filter(actionType -> actionType==ActionType.MORALE).count();
        int ms = (int)ats.stream().filter(actionType -> actionType==ActionType.MORTAL_STRIKE).count();
        int s = (int)ats.stream().filter(actionType -> actionType==ActionType.SURGE).count();

        attacker.incrementStatBy(DieStatisticCounter.BLANK, b);
        attacker.incrementStatBy(DieStatisticCounter.ACCURACY, a);
        attacker.incrementStatBy(DieStatisticCounter.HIT, h);
        attacker.incrementStatBy(DieStatisticCounter.MORALE, m);
        attacker.incrementStatBy(DieStatisticCounter.MORTALSTRIKE, ms);
        attacker.incrementStatBy(DieStatisticCounter.SURGE, s);

        unitHitCount = unitHitCount - ms;
        unitHitCount = unitHitCount - ((h * attacker.calcThreat()) / unitStats[CSim.ARMOR]);

        return isAlive();
    }

    private int calcThreat() {
        int test = unitHitCount/unitStats[CSim.UNITS_PER_TRAY];
        if (test > formation.getThreat()) {
            return formation.getThreat();
        }
        return test;
    }


    public boolean isAlive() {
        return unitHitCount > 0;
    }


    public int getHealth() {
        return unitHitCount;
    }
}
