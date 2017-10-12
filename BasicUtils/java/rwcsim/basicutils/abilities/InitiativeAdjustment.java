package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.dials.FaceColor;

public interface InitiativeAdjustment extends Ability {
    FaceColor affectedColor();
    int changeValue();
}
