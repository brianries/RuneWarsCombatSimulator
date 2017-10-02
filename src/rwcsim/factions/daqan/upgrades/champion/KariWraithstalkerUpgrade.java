package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.base.systems.actions.AddDie;
import rwcsim.base.systems.stages.SpendSurges;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.HeroUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.base.upgrades.Unique;

public class KariWraithstalkerUpgrade extends FigureUpgrade implements Champion, HeroUpgrade, InfantryUpgrade, Unique, AddDie, SpendSurges {
    public KariWraithstalkerUpgrade() {
        this.armor = 3;
        this.health = 2;
    }

    @Override
    public int[] modifyDiePool() {
        return new int[]{0,1,0};
    }
}
