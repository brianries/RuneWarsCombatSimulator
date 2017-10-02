package rwcsim.factions.waiqar.upgrades.music;

import rwcsim.base.systems.stages.OnDisengage;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Music;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class TacticalDrummer extends FigureUpgrade implements Cost, Waiqar, Music, InfantryUpgrade, OnDisengage {
    public TacticalDrummer() {
        this.armor = 4;
    }

    @Override
    public int price() {
        return 2;
    }
}
