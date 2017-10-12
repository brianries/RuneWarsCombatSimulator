package rwcsim.factions.daqan.upgrades.heavy;

import rwcsim.basicutils.modifiers.AddAbility;
import rwcsim.basicutils.stages.WhileAttacking;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.SiegeUpgrade;
import rwcsim.basicutils.abilities.Brutal;
import rwcsim.basicutils.upgrade.Heavy;
import rwcsim.factions.daqan.upgrades.Daqan;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class FrontlineRuneGolem extends FigureUpgrade implements Daqan, Heavy, SiegeUpgrade, WhileAttacking, AddAbility<Brutal>, Cost {
    public FrontlineRuneGolem() {
        this.armor = 4;
        this.health = 2;
    }

    @Override
    public int price() {
        return 7;
    }

    @Override
    public Brutal getAbility() {
        return Brutal.asAbility(RuneFaces.STABLE);
    }
}
