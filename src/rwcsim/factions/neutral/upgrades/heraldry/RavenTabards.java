package rwcsim.factions.neutral.upgrades.heraldry;

import rwcsim.base.dials.FaceColor;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.abilities.InitiativeAdjustment;
import rwcsim.factions.base.upgrades.Heraldry;

public class RavenTabards implements Cost, Heraldry, InitiativeAdjustment {
    @Override
    public FaceColor affectedColor() {
        return FaceColor.BLUE;
    }

    @Override
    public int changeValue() {
        return -1;
    }

    @Override
    public int price() {
        return 2;
    }
}
