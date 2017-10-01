package rwcsim.factions.waiqar.upgrades.heavy;

import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.SiegeUpgrade;
import rwcsim.factions.base.upgrades.Heavy;

public class FrontLineCarrionLancer extends FigureUpgrade implements Heavy, SiegeUpgrade {
    public FrontLineCarrionLancer() {
        this.armor = 3;
        this.health = 3;
    }
}
