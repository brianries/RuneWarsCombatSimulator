package rwcsim.factions.neutral.upgrades.heraldry;

import rwcsim.base.dials.FaceColor;
import rwcsim.factions.base.abilities.InitiativeAdjustment;
import rwcsim.factions.base.upgrades.Heraldry;

public class RavenTabards implements Heraldry, InitiativeAdjustment {
    @Override
    public FaceColor affectedColor() {
        return FaceColor.BLUE;
    }

    @Override
    public int changeValue() {
        return -1;
    }
}
