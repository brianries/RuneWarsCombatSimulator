package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.base.systems.stages.AfterCommandDialReveal;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;

public class LanceCorporal extends FigureUpgrade implements Champion, InfantryUpgrade, AfterCommandDialReveal {
    public LanceCorporal() {
        this.armor = 4;
    }
}
