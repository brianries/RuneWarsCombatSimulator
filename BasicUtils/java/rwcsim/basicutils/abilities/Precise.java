package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class Precise extends NullAbility<Precise> {
    public static final String KEY = "PRECISE";
    public Precise(int v) {
        setValue(v);
    }
    public Precise(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
    }
}
