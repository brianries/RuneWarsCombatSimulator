package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class Immobilize extends NullAbility<Immobilize> {
    public static final String KEY = "IMMOBILIZE";
    public Immobilize(int i) {
        setValue(i);
    }

    public Immobilize(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
    }
}
