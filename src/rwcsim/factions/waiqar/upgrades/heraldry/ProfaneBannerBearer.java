package rwcsim.factions.waiqar.upgrades.heraldry;

import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.abilities.Protector;
import rwcsim.factions.base.upgrades.Heraldry;

public class ProfaneBannerBearer extends FigureUpgrade implements Heraldry, InfantryUpgrade, Protector {
    public ProfaneBannerBearer() {
        this.armor = 2;
    }
}
