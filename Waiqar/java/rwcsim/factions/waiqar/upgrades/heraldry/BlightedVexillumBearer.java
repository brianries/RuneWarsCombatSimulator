package rwcsim.factions.waiqar.upgrades.heraldry;

import rwcsim.basicutils.stages.OnCollision;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Heraldry;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class BlightedVexillumBearer extends FigureUpgrade implements Cost, Waiqar, Heraldry, InfantryUpgrade, OnCollision {
    public BlightedVexillumBearer(){}

    @Override
    public int price() {
        return 3;
    }
}
