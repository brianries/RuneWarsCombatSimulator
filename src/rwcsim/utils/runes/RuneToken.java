package rwcsim.utils.runes;

import rwcsim.base.RuleSetManager;

/**
 * Created by dsayles on 8/19/17.
 */
public class RuneToken {

    int currentFace = 0;
    Rune[] sides = new Rune[2];
    public RuneToken(Rune first, Rune second) {
        sides[0] = first;
        sides[1] = second;
    }

    public void setCurrentFace() {
        currentFace = RuleSetManager.getBoxedInt(2);
    }

    public Rune getCurrentFace() {
        return sides[currentFace];
    }
}
