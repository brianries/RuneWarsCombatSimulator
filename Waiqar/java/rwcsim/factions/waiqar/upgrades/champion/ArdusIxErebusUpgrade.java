package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.basicutils.actions.AddDie;
import rwcsim.basicutils.stages.SpendSurges;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.HeroUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Champion;
import rwcsim.basicutils.upgrade.Unique;
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
