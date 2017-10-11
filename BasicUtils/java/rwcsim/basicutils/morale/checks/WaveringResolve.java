package rwcsim.basicutils.morale.checks;

import rwcsim.basicutils.morale.MoraleCheck;
import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.morale.OneCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class WaveringResolve implements MoraleCheck, OneCost {
    MoraleType type = MoraleType.CONFUSION;
    String text = "Unit discards all boons.  If it had no boons it takes one panic token.";
}
