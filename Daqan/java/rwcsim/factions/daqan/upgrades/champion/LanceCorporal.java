package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.basicutils.concepts.Figure;
import rwcsim.basicutils.stages.AfterCommandDialReveal;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.concepts.FigureUpgrade;
import rwcsim.basicutils.upgrades.InfantryUpgrade;
import rwcsim.basicutils.upgrades.Champion;
import rwcsim.factions.daqan.upgrades.Daqan;

public class LanceCorporal implements FigureUpgrade, Champion, Daqan, InfantryUpgrade, AfterCommandDialReveal, Cost {
    public LanceCorporal() {

    }

    @Override
    public int price() {
        return 6;
    }

    @Override
    public Figure getFigure() {
        return null;
    }

    @Override
    public int getArmor() {
        return 4;
    }
}
