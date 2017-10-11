package rwcsim.basicutils.abilities;

import rwcsim.basicutils.dials.FaceColor;

public interface InitiativeAdjustment {
    FaceColor affectedColor();
    int changeValue();
}
