package rwcsim.factions.latari.upgrades.champion;

import rwcsim.basicutils.actions.AddDie;
import rwcsim.basicutils.modifiers.AddAbility;
import rwcsim.basicutils.stages.SpendSurges;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.HeroUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.abilities.Impact;
import rwcsim.basicutils.upgrade.Champion;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.latari.upgrades.Latari;

public class AlianaOfSummersongUpgrade extends FigureUpgrade implements Champion, HeroUpgrade, InfantryUpgrade, Unique, AddDie, SpendSurges, AddAbility<Impact>, Latari, Cost {
    public AlianaOfSummersongUpgrade() {
        this.armor = 3;
        this.health = 2;
    }

    @Override
    public int[] modifyDiePool() {
        return new int[]{0,0,1};
    }

    @Override
    public int price() {
        return 12;
    }

    @Override
    public Impact getAbility() {
        return Impact.asAbility(1);
    }
}
