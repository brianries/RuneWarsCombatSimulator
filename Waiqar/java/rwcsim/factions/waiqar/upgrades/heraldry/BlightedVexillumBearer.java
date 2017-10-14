package rwcsim.factions.waiqar.upgrades.heraldry;

import rwcsim.basicutils.concepts.Figure;
import rwcsim.basicutils.stages.OnCollision;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.concepts.FigureUpgrade;
import rwcsim.basicutils.upgrades.InfantryUpgrade;
import rwcsim.basicutils.upgrades.Heraldry;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class BlightedVexillumBearer implements FigureUpgrade, Cost, Waiqar, Heraldry, InfantryUpgrade, OnCollision {
    public BlightedVexillumBearer(){}

    @Override
    public int price() {
        return 3;
    }

    @Override
    public Figure getFigure() {
        return null;
    }
}
