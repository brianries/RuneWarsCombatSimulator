package rwcsim.basicutils.runes;

import rwcsim.basicutils.managers.RuleSetManager;
import rwcsim.basicutils.concepts.Rune;

/**
 * Created by dsayles on 8/19/17.
 */
public class RuneToken implements Rune {
    private static int instance = 0;
    private int id;
    int currentFace = 0;
    RuneFaces[] sides = new RuneFaces[2];
    public RuneToken(RuneFaces first, RuneFaces second) {
        id = instance++;

        sides[0] = first;
        sides[1] = second;
    }

    public void setCurrentFace() {
        currentFace = RuleSetManager.getBoxedInt(2);
    }

    public RuneFaces getCurrentFace() {
        return sides[currentFace];
    }
}
