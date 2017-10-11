package rwcsim.factions.waiqar.upgrades.music;

import rwcsim.basicutils.stages.OnDisengage;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Music;
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
