package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.daqan.upgrades.Daqan;

public class NerekhallHexer extends FigureUpgrade implements Champion, Daqan, InfantryUpgrade, OnSkill, Cost {
    public NerekhallHexer() {}

    @Override
    public int price() {
        return 7;
    }
}
