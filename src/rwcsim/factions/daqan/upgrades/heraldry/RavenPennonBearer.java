package rwcsim.factions.daqan.upgrades.heraldry;

import rwcsim.base.systems.stages.Exhaustable;
import rwcsim.base.systems.stages.OnActivation;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Heraldry;

public class RavenPennonBearer extends FigureUpgrade implements Heraldry, InfantryUpgrade, Exhaustable, OnActivation {
    public RavenPennonBearer() {
        this.armor = 3;

    }
}
