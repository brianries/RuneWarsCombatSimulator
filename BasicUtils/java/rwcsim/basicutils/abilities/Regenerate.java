package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class Regenerate extends NullAbility<Regenerate> {
    public Regenerate(int v) {
        setValue(v);
        setKey(Abilities.REGENERATE);
    }
    public Regenerate(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
        setKey(Abilities.REGENERATE);
    }
}
