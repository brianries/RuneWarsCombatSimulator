package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.basicutils.stages.AfterThrowRunes;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Champion;
import rwcsim.factions.daqan.upgrades.Daqan;

public class GreyhavenChanneler extends FigureUpgrade implements Champion, Daqan, InfantryUpgrade, AfterThrowRunes, Cost {
    public GreyhavenChanneler() {}

    @Override
    public int price() {
        return 6;
    }
}
