package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class Immobilize extends NullAbility<Immobilize> {
    public Immobilize(int i) {
        setValue(i);
        setKey(Abilities.IMMOBILIZE);
    }

    public Immobilize(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
        setKey(Abilities.IMMOBILIZE);
    }
}
