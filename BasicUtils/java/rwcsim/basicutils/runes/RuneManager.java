package rwcsim.basicutils.runes;

import rwcsim.utils.statistics.RuneStatistics;

/**
 * Created by dsayles on 8/19/17.
 */
public class RuneManager {
    private static ThreadLocal THREAD_LOCAL = ThreadLocal.withInitial(() -> new RuneManager());
    private RuneToken[] runeTokens = new RuneToken[5];

    public static RuneManager getInstance() {
        return (RuneManager)THREAD_LOCAL.get();
    }

    private RuneManager() {
        runeTokens[0] = new RuneToken(RuneFaces.BLANK, RuneFaces.UNSTABLE);
        runeTokens[1] = new RuneToken(RuneFaces.STABLE, RuneFaces.STABLE);
        runeTokens[2] = new RuneToken(RuneFaces.NATURAL, RuneFaces.STABLE);
        runeTokens[3] = new RuneToken(RuneFaces.BLANK, RuneFaces.NATURAL);
        runeTokens[4] = new RuneToken(RuneFaces.NATURAL, RuneFaces.UNSTABLE);
    }

    public void throwRunes() {
        for (RuneToken rt : runeTokens) {
            rt.setCurrentFace();
            RuneStatistics.record(rt + " " + rt.getCurrentFace());
        }
    }

    public RuneFaces getRuneToken(int index, int side) {
        return runeTokens[index].sides[side];
    }

    public int[] currentRuneState() {
        int[] res = new int[RuneFaces.values().length];
        for (int i = 0; i<res.length; i++) {
            res[runeTokens[i].getCurrentFace().ordinal()] += runeTokens[i].getCurrentFace().getCount();
        }
        return res;
    }

    public int currentRuneCount(RuneFaces rune) {
        int r = 0;
        for (RuneToken rt:runeTokens) {
            if (rt.getCurrentFace() == rune) {
                r += rt.getCurrentFace().getCount();
            }
        }
        return r;
    }



    public static void main(String[] args) {
        RuneManager rm = new RuneManager();
        rm.throwRunes();
    }
}
