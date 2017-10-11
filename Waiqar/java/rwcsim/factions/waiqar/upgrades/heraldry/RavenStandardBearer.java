package rwcsim.factions.waiqar.upgrades.heraldry;

import rwcsim.basicutils.dials.FaceColor;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.abilities.InitiativeAdjustment;
import rwcsim.basicutils.upgrade.Heraldry;
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
