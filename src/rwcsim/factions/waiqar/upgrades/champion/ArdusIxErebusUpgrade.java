package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.HeroUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.base.upgrades.Unique;

public class ArdusIxErebusUpgrade extends FigureUpgrade implements Champion, HeroUpgrade, InfantryUpgrade, Unique {
    public ArdusIxErebusUpgrade() {
        this.armor = 3;
        this.health = 2;
    }
}
