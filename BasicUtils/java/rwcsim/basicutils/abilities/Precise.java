package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class Precise extends NullAbility<Precise> {
    public Precise(int v) {
        setValue(v);
        setKey(Abilities.PRECISE);
    }
    public Precise(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
        setKey(Abilities.PRECISE);
    }
}
