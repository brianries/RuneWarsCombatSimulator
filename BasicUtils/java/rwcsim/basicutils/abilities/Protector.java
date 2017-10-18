package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class Protector extends NullAbility<Protector> {
    public static final String KEY = "PROTECTOR";
    public Protector(int v) {
        setValue(v);
    }
    public Protector(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
    }

}
