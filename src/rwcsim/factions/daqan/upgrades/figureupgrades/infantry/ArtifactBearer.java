package rwcsim.factions.daqan.upgrades.figureupgrades.infantry;

import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;

public class ArtifactBearer extends FigureUpgrade implements Champion, InfantryUpgrade {
    public ArtifactBearer() {
        this.armor = 3;
        this.health = 2;
    }
}
