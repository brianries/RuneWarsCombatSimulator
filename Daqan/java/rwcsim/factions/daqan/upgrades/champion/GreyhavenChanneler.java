package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.base.systems.stages.AfterThrowRunes;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.daqan.upgrades.Daqan;

public class GreyhavenChanneler extends FigureUpgrade implements Champion, Daqan, InfantryUpgrade, AfterThrowRunes, Cost {
    public GreyhavenChanneler() {}

    @Override
    public int price() {
        return 6;
    }
}
