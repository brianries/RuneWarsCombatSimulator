package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.basicutils.stages.AvailableUpgrades;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Champion;
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
