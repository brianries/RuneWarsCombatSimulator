package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class Protected extends NullAbility<Protected> {
    public Protected(int v) {
        setValue(v);
        setKey(Abilities.PROTECTED);
    }
    public Protected(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
        setKey(Abilities.PROTECTED);
    }
}
