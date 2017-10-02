package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.base.systems.stages.AvailableUpgrades;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;

public class ArtifactBearer extends FigureUpgrade implements Champion, InfantryUpgrade, AvailableUpgrades {
    public ArtifactBearer() {
        this.armor = 3;
        this.health = 2;
    }
}
