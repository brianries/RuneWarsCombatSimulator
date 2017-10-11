package rwcsim.basicutils.morale.checks;

import rwcsim.basicutils.morale.MoraleCheck;
import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.morale.TwoCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class CommunicationBreakdown implements MoraleCheck, TwoCost {
    MoraleType type = MoraleType.CONFUSION;
    String text = "Each of your units at range 1-2 receives 1 inspiration token.";
}
