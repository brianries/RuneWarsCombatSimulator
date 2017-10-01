package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.factions.base.CavalryUpgrade;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.HeroUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.base.upgrades.Unique;

public class AnkaurMaroUpgrade extends FigureUpgrade implements Champion, HeroUpgrade, InfantryUpgrade, CavalryUpgrade, Unique {
    public AnkaurMaroUpgrade() {
        this.armor = 2;
        this.health = 3;
    }
}
