package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.basicutils.stages.AvailableUpgrades;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Champion;
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
