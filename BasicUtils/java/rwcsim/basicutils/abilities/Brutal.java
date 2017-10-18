package rwcsim.basicutils.abilities;

import rwcsim.basicutils.runes.RuneFaces;

public class Brutal extends NullAbility<Brutal> {
    public Brutal(int v) {
        this.setValue(v);
        setKey(Abilities.BRUTAL);
    }

    public Brutal(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
        setKey(Abilities.BRUTAL);
    }
}


