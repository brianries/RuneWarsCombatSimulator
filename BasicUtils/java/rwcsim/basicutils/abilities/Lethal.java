package rwcsim.basicutils.abilities;

import rwcsim.basicutils.runes.RuneFaces;

public class Lethal extends NullAbility<Lethal> {
    public static final String KEY = "LETHAL";
    public Lethal(int v) {
        setValue(v);
    }
    public Lethal(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
    }
}
