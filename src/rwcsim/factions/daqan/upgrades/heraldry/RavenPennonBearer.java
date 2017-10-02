package rwcsim.factions.daqan.upgrades.heraldry;

import rwcsim.base.systems.stages.Exhaustable;
import rwcsim.base.systems.stages.OnActivation;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Heraldry;
import rwcsim.factions.daqan.upgrades.Daqan;

public class RavenPennonBearer extends FigureUpgrade implements Cost, Daqan, Heraldry, InfantryUpgrade, Exhaustable, OnActivation {
    public RavenPennonBearer() {
        this.armor = 3;

    }

    @Override
    public int price() {
        return 5;
    }
}
