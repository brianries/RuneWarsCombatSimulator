package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.actions.AddDie;
import rwcsim.basicutils.stages.AfterAttacking;
import rwcsim.basicutils.upgrade.CavalryUpgrade;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.HeroUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Champion;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.daqan.upgrades.Daqan;

public class LordHawthorneUpgrade extends FigureUpgrade implements Champion, Daqan, HeroUpgrade, InfantryUpgrade, CavalryUpgrade, Unique, AddDie, AfterAttacking, Cost {
    public LordHawthorneUpgrade() {
        this.armor = 3;
        this.health = 2;
    }

    @Override
    public int[] modifyDiePool() {
        return new int[]{0,0,1};
    }

    @Override
    public int price() {
        return 22;
    }
}
