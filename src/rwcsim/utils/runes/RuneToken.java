package rwcsim.utils.runes;

/**
 * Created by dsayles on 8/19/17.
 */
public class RuneToken {
    Rune[] sides = new Rune[2];
    public RuneToken(Rune first, Rune second) {
        sides[0] = first;
        sides[1] = second;
    }
}
