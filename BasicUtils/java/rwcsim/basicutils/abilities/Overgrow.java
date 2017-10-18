package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class Overgrow extends NullAbility<Overgrow> {
    public static final String KEY = "OVERGROW";
    public Overgrow(int v) {
        setValue(v);
    }
    public Overgrow(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
    }
}
