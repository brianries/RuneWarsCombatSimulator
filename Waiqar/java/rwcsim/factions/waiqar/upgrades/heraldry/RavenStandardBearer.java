package rwcsim.factions.waiqar.upgrades.heraldry;

import rwcsim.base.dials.FaceColor;
import rwcsim.base.systems.stages.OnActivation;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.abilities.InitiativeAdjustment;
import rwcsim.factions.base.upgrades.Heraldry;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class RavenStandardBearer extends FigureUpgrade implements Cost, Waiqar, Heraldry, InfantryUpgrade, InitiativeAdjustment {
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

    @Override
    public int price() {
        return 3;
    }
}
