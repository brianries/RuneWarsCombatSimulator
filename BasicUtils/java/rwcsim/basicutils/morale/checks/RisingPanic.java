package rwcsim.basicutils.morale.checks;

import rwcsim.basicutils.morale.MoraleCheck;
import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.morale.OneCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class RisingPanic implements MoraleCheck, OneCost {
    MoraleType type = MoraleType.FEAR;
    String text = "Unit receives 2 panic tokens";
}
