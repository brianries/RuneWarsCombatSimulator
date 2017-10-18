package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class Overgrow extends NullAbility<Overgrow> {
    public Overgrow(int v) {
        setValue(v);
        setKey(Abilities.OVERGROW);
    }
    public Overgrow(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
        setKey(Abilities.OVERGROW);
    }
}
