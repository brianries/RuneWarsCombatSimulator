package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.base.systems.stages.Engaged;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;

public class CaptivatingHexer extends FigureUpgrade implements Champion, InfantryUpgrade, Engaged {
    public CaptivatingHexer() {
        this.armor = 2;
    }
}
