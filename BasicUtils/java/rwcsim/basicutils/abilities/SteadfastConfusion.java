package rwcsim.basicutils.abilities;

import rwcsim.basicutils.morale.MoraleType;

public class SteadfastConfusion extends NullAbility<SteadfastConfusion> {
    public SteadfastConfusion(int v) {
        super(v);
        setKey(Abilities.STEADFAST_CONFUSION);
    }
}
