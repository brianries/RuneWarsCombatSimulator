package rwcsim.factions.waiqar.upgrades.heraldry;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.abilities.Protector;
import rwcsim.basicutils.upgrade.Heraldry;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class ProfaneBannerBearer extends FigureUpgrade implements Cost, Waiqar,Heraldry, InfantryUpgrade, Protector {
    public ProfaneBannerBearer() {
        this.armor = 2;
    }

    @Override
    public int price() {
        return 5;
    }
}
