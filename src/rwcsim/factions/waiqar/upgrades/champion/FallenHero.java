package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.base.systems.stages.AvailableUpgrades;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;

public class FallenHero extends FigureUpgrade implements Champion, InfantryUpgrade, AvailableUpgrades {
    public FallenHero() {
        this.armor = 3;
        this.health = 2;
    }
}
