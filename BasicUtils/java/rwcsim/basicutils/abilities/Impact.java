package rwcsim.basicutils.abilities;

import rwcsim.basicutils.runes.RuneFaces;

public class Impact extends NullAbility<Impact> {
    public Impact(int i) {
        setValue(i);
        setKey(Abilities.IMPACT);
    }

    public Impact(RuneFaces rf) {
        super(rf.ordinal());
        activateOther();
        setKey(Abilities.IMPACT);
    }
}
