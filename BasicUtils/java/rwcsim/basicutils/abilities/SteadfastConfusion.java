package rwcsim.basicutils.abilities;

import rwcsim.basicutils.morale.MoraleType;

public class SteadfastConfusion extends NullAbility<SteadfastConfusion> {
    public static final String KEY = "STEADFAST_CONFUSION";
    public SteadfastConfusion(int v) {
        super(v);
    }

    public MoraleType getType() {
        return MoraleType.getType(getSecondaryValue());
    }
}
