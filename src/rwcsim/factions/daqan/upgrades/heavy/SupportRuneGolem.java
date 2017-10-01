package rwcsim.factions.daqan.upgrades.heavy;

import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.SiegeUpgrade;
import rwcsim.factions.base.upgrades.Heavy;

public class SupportRuneGolem extends FigureUpgrade implements Heavy, SiegeUpgrade {
    public SupportRuneGolem() {
        this.armor = 4;
        this.health = 2;
    }
}
