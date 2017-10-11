package rwcsim.base.morale.checks;

import rwcsim.base.morale.MoraleCheck;
import rwcsim.base.morale.MoraleType;
import rwcsim.base.morale.TwoCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class Uncertainty implements MoraleCheck, TwoCost {
    MoraleType type = MoraleType.FEAR;
    String text = "The Unit performs reform action.  You make all of the decisions for this action.";
}
