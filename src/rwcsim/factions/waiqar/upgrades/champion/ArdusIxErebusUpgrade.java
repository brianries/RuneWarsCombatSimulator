package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.base.systems.actions.AddDie;
import rwcsim.base.systems.stages.SpendSurges;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.HeroUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class ArdusIxErebusUpgrade extends FigureUpgrade implements Cost, Waiqar, Champion, HeroUpgrade, InfantryUpgrade, Unique, AddDie, SpendSurges {
    public ArdusIxErebusUpgrade() {
        this.armor = 3;
        this.health = 2;
    }

    @Override
    public int[] modifyDiePool() {
        return new int[]{0,0,1};
    }

    @Override
    public int price() {
        return 23;
    }
}
