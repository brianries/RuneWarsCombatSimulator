package rwcsim.utils.runes;

/**
 * Created by dsayles on 8/19/17.
 */
public class RuneManager {
    private static RuneManager _instance = new RuneManager();
    private RuneToken[] runeTokens = new RuneToken[5];
    private RuneManager() {
        runeTokens[0] = new RuneToken(Rune.BLANK, Rune.UNSTABLE);
        runeTokens[1] = new RuneToken(Rune.STABLE, Rune.STABLE);
        runeTokens[2] = new RuneToken(Rune.NATURAL, Rune.STABLE);
        runeTokens[3] = new RuneToken(Rune.BLANK, Rune.NATURAL);
        runeTokens[4] = new RuneToken(Rune.NATURAL, Rune.UNSTABLE);
    }

    public Rune getRuneToken(int index, int side) {
        return runeTokens[index].sides[side];
    }


    public static RuneManager getInstance() {
        return _instance;
    }

    public static void main(String[] args) {
        RuneManager rm = RuneManager.getInstance();


    }
}
