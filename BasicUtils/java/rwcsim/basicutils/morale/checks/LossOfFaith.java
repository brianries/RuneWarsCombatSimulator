package rwcsim.basicutils.morale.checks;

import rwcsim.basicutils.morale.MoraleCheck;
import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.morale.TwoCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class LossOfFaith implements MoraleCheck, TwoCost {
    MoraleType type = MoraleType.DOUBT;
    String text = "If the unit has more than 1 tray, your opponent must choose and remove 1 tray from the unit's backmost rank." +
            "All figures are removed.  This effect cannot be used to split the unit into two separate groups of trays.";
}
