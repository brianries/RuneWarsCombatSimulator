package rwcsim.basicutils.morale.checks;

import rwcsim.basicutils.morale.MoraleCheck;
import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.morale.ThreeCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class Betrayal implements MoraleCheck, ThreeCost {
    MoraleType type = MoraleType.DOUBT;
    String text = "If the unit has more than 1 tray, it immediately performs and attack action targeting itself." +
            "  The dice for this attack cannot be rerolled, only the hits are spent (ignore all other icons).  " +
            "The unit's front edge is treated as contacted edge for this attack.";
}
