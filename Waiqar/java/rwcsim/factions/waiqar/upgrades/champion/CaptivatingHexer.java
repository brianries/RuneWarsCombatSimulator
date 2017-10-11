package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.basicutils.stages.Engaged;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Champion;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class CaptivatingHexer extends FigureUpgrade implements Cost, Waiqar, Champion, InfantryUpgrade, Engaged {
    public CaptivatingHexer() {
        this.armor = 2;
    }

    @Override
    public int price() {
        return 5;
    }
}
