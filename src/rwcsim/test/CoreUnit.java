package rwcsim.test;

import rwcsim.base.ActionType;
import rwcsim.base.Formation;
import rwcsim.utils.dice.DiePool;
import rwcsim.utils.dice.Roller;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dsayles on 8/17/17.
 */
public class CoreUnit {
    public static final int ACCURACY = 0;
    public static final int HIT = 1;
    public static final int MORALE = 2;
    public static final int MORTALSTRIKE = 3;
    public static final int SURGE = 4;
    public static final int BLANK = 5;
    public static final int REROLLS = 6;

    Formation formation;
    int[] unitStats;
    DiePool diePool;

    int unitHitCount;

    int[] statistics = new int[7];

    public void incrementStat(int statid) {
        statistics[statid]++;
    }

    public CoreUnit(){}
    public CoreUnit(Formation formation, int[] unitStats, DiePool diePool) {
        this.formation = formation;
        this.unitStats = unitStats;
        this.diePool = diePool;
        unitHitCount = unitStats[CSim.UNITS_PER_TRAY] * unitStats[CSim.HITS] * formation.getTrayCount();
    }


    public List<ActionType> attack() {
        return Roller.rollPool(diePool.getAttackPool(), this);
    }


    public boolean applyResults(CoreUnit attacker, List<ActionType> ats) {
        int b = (int)ats.stream().filter(actionType -> actionType==ActionType.BLANK).count();
        int a = (int)ats.stream().filter(actionType -> actionType==ActionType.ACCURACY).count();
        int h = (int)ats.stream().filter(actionType -> actionType==ActionType.HIT).count();
        int m = (int)ats.stream().filter(actionType -> actionType==ActionType.MORALE).count();
        int ms = (int)ats.stream().filter(actionType -> actionType==ActionType.MORTAL_STRIKE).count();
        int s = (int)ats.stream().filter(actionType -> actionType==ActionType.SURGE).count();

        attacker.statistics[BLANK] += b;
        attacker.statistics[ACCURACY] += a;
        attacker.statistics[HIT] += h;
        attacker.statistics[MORALE] += m;
        attacker.statistics[MORTALSTRIKE] += ms;
        attacker.statistics[SURGE] += s;

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

    public void showStats() {
        System.out.println("A,H,M,MS,S,B,RR: "+ Arrays.toString(statistics));
    }

    public int[] getStats() {
        return statistics;
    }

    public int getHealth() {
        return unitHitCount;
    }
}
