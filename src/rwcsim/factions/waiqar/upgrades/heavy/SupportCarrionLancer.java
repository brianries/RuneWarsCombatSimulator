package rwcsim.factions.waiqar.upgrades.heavy;

import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.SiegeUpgrade;
import rwcsim.factions.base.upgrades.Heavy;

public class SupportCarrionLancer extends FigureUpgrade implements Heavy, SiegeUpgrade {
    public SupportCarrionLancer() {
        this.armor = 3;
        this.health = 3;
    }
}
