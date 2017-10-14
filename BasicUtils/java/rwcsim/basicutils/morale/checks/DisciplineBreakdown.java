package rwcsim.basicutils.morale.checks;

import rwcsim.basicutils.concepts.MoraleCheck;
import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.morale.ThreeCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class DisciplineBreakdown implements MoraleCheck, ThreeCost {
    MoraleType type = MoraleType.CONFUSION;
    String text = "You choose and discard one upgrades card from the unit.  If it was a figure upgrades, " +
            "remove it's corresponding figure.";
}

