package rwcsim.basicutils.modifiers;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.concepts.Modifier;
import rwcsim.basicutils.dials.FaceColor;

public interface InitiativeAdjustment extends Modifier {
    FaceColor affectedColor();
    int changeValue();
}
