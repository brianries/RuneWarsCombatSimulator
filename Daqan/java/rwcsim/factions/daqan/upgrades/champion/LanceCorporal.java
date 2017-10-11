package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.base.systems.stages.AfterCommandDialReveal;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
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
