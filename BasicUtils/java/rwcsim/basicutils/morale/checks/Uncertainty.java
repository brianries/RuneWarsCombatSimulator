package rwcsim.basicutils.morale.checks;

import rwcsim.basicutils.morale.MoraleCheck;
import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.morale.TwoCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class Uncertainty implements MoraleCheck, TwoCost {
    MoraleType type = MoraleType.FEAR;
    String text = "The Unit performs reform action.  You make all of the decisions for this action.";
}
