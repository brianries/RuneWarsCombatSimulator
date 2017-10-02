package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.base.systems.stages.AvailableUpgrades;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.daqan.upgrades.Daqan;

public class ArtifactBearer extends FigureUpgrade implements Champion, Daqan, InfantryUpgrade, AvailableUpgrades, Cost {
    public ArtifactBearer() {
        this.armor = 3;
        this.health = 2;
    }

    @Override
    public int price() {
        return 4;
    }
}
