package rwcsim.utils.runes;

/**
 * Created by dsayles on 8/19/17.
 */
public class RuneManager {
    private static RuneManager _instance = new RuneManager();
    private static RuneToken[] runeTokens = new RuneToken[5];
    private RuneManager() {
        runeTokens[0] = new RuneToken(Rune.BLANK, Rune.UNSTABLE);
        runeTokens[1] = new RuneToken(Rune.STABLE, Rune.STABLE);
        runeTokens[2] = new RuneToken(Rune.NATURAL, Rune.STABLE);
        runeTokens[3] = new RuneToken(Rune.BLANK, Rune.NATURAL);
        runeTokens[4] = new RuneToken(Rune.NATURAL, Rune.UNSTABLE);
    }

    public void throwRunes() {
        for (RuneToken rt : runeTokens) {
            rt.setCurrentFace();
        }
    }

    public Rune getRuneToken(int index, int side) {
        return runeTokens[index].sides[side];
    }

    public static int[] currentRuneState() {
        int[] res = new int[Rune.values().length];
        for (int i = 0; i<res.length; i++) {
            res[runeTokens[i].getCurrentFace().ordinal()] += runeTokens[i].getCurrentFace().getCount();
        }
        return res;
    }

    public static int currentRuneCount(Rune rune) {
        int r = 0;
        for (RuneToken rt:runeTokens) {
            if (rt.getCurrentFace() == rune) {
                r += rt.getCurrentFace().getCount();
            }
        }
        return r;
    }

    public static RuneManager getInstance() {
        return _instance;
    }

    public static void main(String[] args) {
        RuneManager rm = RuneManager.getInstance();
        rm.throwRunes();
    }
}
