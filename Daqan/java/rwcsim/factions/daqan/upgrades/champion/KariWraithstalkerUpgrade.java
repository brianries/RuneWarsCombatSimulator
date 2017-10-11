package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.basicutils.actions.AddDie;
import rwcsim.basicutils.stages.SpendSurges;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.HeroUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Champion;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.daqan.upgrades.Daqan;

public class KariWraithstalkerUpgrade extends FigureUpgrade implements Champion, Daqan, HeroUpgrade, InfantryUpgrade, Unique, AddDie, SpendSurges, Cost {
    public KariWraithstalkerUpgrade() {
        this.armor = 3;
        this.health = 2;
    }

    @Override
    public int[] modifyDiePool() {
        return new int[]{0,1,0};
    }

    @Override
    public int price() {
        return 18;
    }
}
