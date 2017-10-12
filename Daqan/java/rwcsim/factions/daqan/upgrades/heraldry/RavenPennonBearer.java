package rwcsim.factions.daqan.upgrades.heraldry;

import rwcsim.basicutils.modifiers.Exhaustable;
import rwcsim.basicutils.stages.OnActivation;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Heraldry;
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
