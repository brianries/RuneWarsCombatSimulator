package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.base.systems.actions.AddDie;
import rwcsim.base.systems.stages.AfterAttacking;
import rwcsim.factions.base.*;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.base.upgrades.Unique;
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
