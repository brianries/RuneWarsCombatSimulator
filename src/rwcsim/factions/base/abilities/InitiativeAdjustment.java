package rwcsim.factions.base.abilities;

import rwcsim.base.dials.FaceColor;

public interface InitiativeAdjustment {
    FaceColor affectedColor();
    int changeValue();
}
