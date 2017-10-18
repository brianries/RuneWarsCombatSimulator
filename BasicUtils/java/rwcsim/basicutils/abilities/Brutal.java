package rwcsim.basicutils.abilities;

import rwcsim.basicutils.runes.RuneFaces;

public class Brutal extends NullAbility<Brutal> {
    public static final String KEY = "BRUTAL";
    public Brutal(int v) {
        this.setValue(v);
    }

    public Brutal(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
    }
}


