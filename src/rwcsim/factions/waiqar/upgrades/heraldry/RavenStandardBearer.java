package rwcsim.factions.waiqar.upgrades.heraldry;

import rwcsim.base.dials.FaceColor;
import rwcsim.base.systems.stages.OnActivation;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.abilities.InitiativeAdjustment;
import rwcsim.factions.base.upgrades.Heraldry;

public class RavenStandardBearer extends FigureUpgrade implements Heraldry, InfantryUpgrade, InitiativeAdjustment {
    public RavenStandardBearer() {
        this.armor = 4;
    }

    @Override
    public FaceColor affectedColor() {
        return FaceColor.RED;
    }

    @Override
    public int changeValue() {
        return -1;
    }
}
