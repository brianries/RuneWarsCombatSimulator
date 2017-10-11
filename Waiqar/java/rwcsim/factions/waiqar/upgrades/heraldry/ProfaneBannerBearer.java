package rwcsim.factions.waiqar.upgrades.heraldry;

import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.abilities.Protector;
import rwcsim.factions.base.upgrades.Heraldry;
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
