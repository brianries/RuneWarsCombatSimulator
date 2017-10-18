package rwcsim.basicutils.abilities;

import rwcsim.basicutils.runes.RuneFaces;

public class Lethal extends NullAbility<Lethal> {
    public Lethal(int v) {
        setValue(v);
        setKey(Abilities.LETHAL);
    }
    public Lethal(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
        setKey(Abilities.LETHAL);
    }
}
