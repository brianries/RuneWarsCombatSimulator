package rwcsim.factions.daqan.upgrades.music;

import rwcsim.base.systems.stages.OnMarch;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Music;

public class MarchingCornicen extends FigureUpgrade implements Music, InfantryUpgrade, OnMarch {
    public MarchingCornicen() {
        this.armor = 2;
    }
}
