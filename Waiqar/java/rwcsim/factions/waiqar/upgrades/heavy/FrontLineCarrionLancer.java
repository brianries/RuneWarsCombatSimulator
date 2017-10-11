package rwcsim.factions.waiqar.upgrades.heavy;

import rwcsim.basicutils.stages.SpendSurges;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.SiegeUpgrade;
import rwcsim.basicutils.upgrade.Heavy;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class FrontLineCarrionLancer extends FigureUpgrade implements Cost, Waiqar, Heavy, SiegeUpgrade, SpendSurges {
    public FrontLineCarrionLancer() {
        this.armor = 3;
        this.health = 3;
    }

    @Override
    public int price() {
        return 5;
    }
}
