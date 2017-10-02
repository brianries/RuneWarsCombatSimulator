package rwcsim.factions.waiqar.upgrades.heraldry;

import rwcsim.base.systems.stages.OnCollision;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Heraldry;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class BlightedVexillumBearer extends FigureUpgrade implements Cost, Waiqar, Heraldry, InfantryUpgrade, OnCollision {
    public BlightedVexillumBearer(){}

    @Override
    public int price() {
        return 3;
    }
}
