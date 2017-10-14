package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.basicutils.actions.OnSkill;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.concepts.Figure;
import rwcsim.basicutils.concepts.FigureUpgrade;
import rwcsim.basicutils.upgrades.InfantryUpgrade;
import rwcsim.basicutils.upgrades.Champion;
import rwcsim.factions.daqan.upgrades.Daqan;

public class NerekhallHexer implements FigureUpgrade, Champion, Daqan, InfantryUpgrade, OnSkill, Cost {
    public NerekhallHexer() {}

    @Override
    public int price() {
        return 7;
    }

    @Override
    public Figure getFigure() {
        return null;
    }
}
