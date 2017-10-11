package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.basicutils.actions.OnSkill;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Champion;
import rwcsim.factions.daqan.upgrades.Daqan;

public class NerekhallHexer extends FigureUpgrade implements Champion, Daqan, InfantryUpgrade, OnSkill, Cost {
    public NerekhallHexer() {}

    @Override
    public int price() {
        return 7;
    }
}
