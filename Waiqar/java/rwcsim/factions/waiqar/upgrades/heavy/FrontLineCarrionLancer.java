package rwcsim.factions.waiqar.upgrades.heavy;

import rwcsim.base.systems.stages.SpendSurges;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.SiegeUpgrade;
import rwcsim.factions.base.upgrades.Heavy;
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
