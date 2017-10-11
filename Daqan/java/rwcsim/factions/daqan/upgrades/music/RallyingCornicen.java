package rwcsim.factions.daqan.upgrades.music;

import rwcsim.basicutils.actions.OnSkill;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Music;
import rwcsim.factions.daqan.upgrades.Daqan;

public class RallyingCornicen extends FigureUpgrade implements Cost, Daqan, Music, InfantryUpgrade, OnSkill {
    public RallyingCornicen() {}

    @Override
    public int price() {
        return 4;
    }
}
