package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class Protected extends NullAbility<Protected> {
    public static final String KEY = "PROTECTED";
    public Protected(int v) {
        setValue(v);
    }
    public Protected(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
    }
}
