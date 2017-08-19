package rwcsim.base.morale.checks;

import rwcsim.base.morale.MoraleCheck;
import rwcsim.base.morale.MoraleType;
import rwcsim.base.morale.ThreeCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class DisciplineBreakdown implements MoraleCheck, ThreeCost {
    MoraleType type = MoraleType.CONFUSION;
    String text = "You choose and discard one upgrade card from the unit.  If it was a figure upgrade, " +
            "remove it's corresponding figure.";
}

