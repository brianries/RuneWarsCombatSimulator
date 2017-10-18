package rwcsim.basicutils.abilities;

import rwcsim.basicutils.runes.RuneFaces;

public class Impact extends NullAbility<Impact> {
    public static final String KEY = "IMPACT";
    public Impact(int i) {
        setValue(i);
    }

    public Impact(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
    }
}
