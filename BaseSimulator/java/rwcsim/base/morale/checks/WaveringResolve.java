package rwcsim.base.morale.checks;

import rwcsim.base.morale.MoraleCheck;
import rwcsim.base.morale.MoraleType;
import rwcsim.base.morale.OneCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class WaveringResolve implements MoraleCheck, OneCost {
    MoraleType type = MoraleType.CONFUSION;
    String text = "Unit discards all boons.  If it had no boons it takes one panic token.";
}
