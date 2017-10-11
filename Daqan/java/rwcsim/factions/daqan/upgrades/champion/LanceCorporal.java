package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.basicutils.stages.AfterCommandDialReveal;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Champion;
import rwcsim.factions.daqan.upgrades.Daqan;

public class LanceCorporal extends FigureUpgrade implements Champion, Daqan, InfantryUpgrade, AfterCommandDialReveal, Cost {
    public LanceCorporal() {
        this.armor = 4;
    }

    @Override
    public int price() {
        return 6;
    }
}
