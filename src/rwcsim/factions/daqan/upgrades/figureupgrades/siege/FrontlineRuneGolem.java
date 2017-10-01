package rwcsim.factions.daqan.upgrades.figureupgrades.siege;

import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.SiegeUpgrade;
import rwcsim.factions.base.upgrades.Heavy;

public class FrontlineRuneGolem extends FigureUpgrade implements Heavy, SiegeUpgrade {
    public FrontlineRuneGolem() {
        this.armor = 4;
        this.health = 2;
    }
}
