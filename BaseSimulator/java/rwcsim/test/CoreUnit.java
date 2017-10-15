package rwcsim.test;

import rwcsim.basicutils.ActionType;
import rwcsim.basicutils.Formation;
import rwcsim.basicutils.dials.CommandTool;
import rwcsim.basicutils.dice.DiePool;
import rwcsim.utils.statistics.DieStatisticCounter;

import java.util.List;

/**
 * Created by dsayles on 8/17/17.
 */
public class CoreUnit {
    public CommandTool commandTool;
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

    public CoreUnit() {
    }

    public CoreUnit(Formation formation, int[] unitStats, DiePool diePool) {
        this.formation = formation;
        this.unitStats = unitStats;
        this.diePool = diePool;
        unitHitCount = unitStats[CSim.UNITS_PER_TRAY] * unitStats[CSim.HITS] * formation.getTrayCount();
    }


//    public List<ActionType> attack() {
//        return Roller.rollPool(diePool.getAttackPool(), this, DefaultInteractionManager.instance());
//    }


    public void recordResults(List<ActionType> ats) {
        int b = (int) ats.stream().filter(actionType -> actionType == ActionType.BLANK).count();
        int a = (int) ats.stream().filter(actionType -> actionType == ActionType.ACCURACY).count();
        int h = (int) ats.stream().filter(actionType -> actionType == ActionType.HIT).count();
        int m = (int) ats.stream().filter(actionType -> actionType == ActionType.MORALE).count();
        int ms = (int) ats.stream().filter(actionType -> actionType == ActionType.MORTAL_STRIKE).count();
        int s = (int) ats.stream().filter(actionType -> actionType == ActionType.SURGE).count();

        dsc.incrementBy(DieStatisticCounter.BLANK, b);
        dsc.incrementBy(DieStatisticCounter.ACCURACY, a);
        dsc.incrementBy(DieStatisticCounter.HIT, h);
        dsc.incrementBy(DieStatisticCounter.MORALE, m);
        dsc.incrementBy(DieStatisticCounter.MORTALSTRIKE, ms);
        dsc.incrementBy(DieStatisticCounter.SURGE, s);
    }
}
