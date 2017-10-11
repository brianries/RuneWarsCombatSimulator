package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.base.systems.stages.Engaged;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
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
