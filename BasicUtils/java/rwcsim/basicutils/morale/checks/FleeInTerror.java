package rwcsim.basicutils.morale.checks;

import rwcsim.basicutils.morale.MoraleCheck;
import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.morale.ThreeCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class FleeInTerror implements MoraleCheck, ThreeCost {
    MoraleType type = MoraleType.FEAR;
    String text = "The Unit performs reform action.  You make all of the decisions for this action." +
            "Then the Unit performs a speed-2 move action.  It can be performed even if it is engaged " +
            "with an enemy unit";
}
