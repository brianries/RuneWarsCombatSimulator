package rwcsim.factions.daqan.upgrades.music;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Music;
import rwcsim.factions.daqan.upgrades.Daqan;

public class RallyingCornicen extends FigureUpgrade implements Cost, Daqan, Music, InfantryUpgrade, OnSkill {
    public RallyingCornicen() {}

    @Override
    public int price() {
        return 4;
    }
}
