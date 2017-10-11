package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.base.systems.stages.AvailableUpgrades;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class FallenHero extends FigureUpgrade implements Cost, Waiqar, Champion, InfantryUpgrade, AvailableUpgrades {
    public FallenHero() {
        this.armor = 3;
        this.health = 2;
    }

    @Override
    public int price() {
        return 4;
    }
}
