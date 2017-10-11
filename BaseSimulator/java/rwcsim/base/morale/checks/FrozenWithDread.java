package rwcsim.base.morale.checks;

import rwcsim.base.morale.MoraleCheck;
import rwcsim.base.morale.MoraleType;
import rwcsim.base.morale.OneCost;

/**
 * Created by dsayles on 8/18/17.
 */
public class FrozenWithDread implements MoraleCheck, OneCost {
    MoraleType type = MoraleType.FEAR;
    String text = "Unit receives 1 immobilize token.";
}
