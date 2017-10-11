package rwcsim.base.morale.checks;

import rwcsim.base.morale.MoraleCheck;
import rwcsim.base.morale.MoraleType;
import rwcsim.base.morale.TwoCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class CommunicationBreakdown implements MoraleCheck, TwoCost {
    MoraleType type = MoraleType.CONFUSION;
    String text = "Each of your units at range 1-2 receives 1 inspiration token.";
}
