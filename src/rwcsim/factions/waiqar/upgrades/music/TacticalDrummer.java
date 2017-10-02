package rwcsim.factions.waiqar.upgrades.music;

import rwcsim.base.systems.stages.OnDisengage;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Music;

public class TacticalDrummer extends FigureUpgrade implements Music, InfantryUpgrade, OnDisengage {
    public TacticalDrummer() {
        this.armor = 4;
    }
}
