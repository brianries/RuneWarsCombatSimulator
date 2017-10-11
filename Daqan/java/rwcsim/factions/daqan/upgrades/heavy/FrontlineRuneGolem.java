package rwcsim.factions.daqan.upgrades.heavy;

import rwcsim.basicutils.stages.WhileAttacking;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.SiegeUpgrade;
import rwcsim.basicutils.abilities.Brutal;
import rwcsim.basicutils.upgrade.Heavy;
import rwcsim.factions.daqan.upgrades.Daqan;
import rwcsim.basicutils.runes.Rune;
import rwcsim.basicutils.runes.RuneManager;

public class FrontlineRuneGolem extends FigureUpgrade implements Daqan, Heavy, SiegeUpgrade, WhileAttacking, Brutal, Cost {
    public FrontlineRuneGolem() {
        this.armor = 4;
        this.health = 2;
    }

    @Override
    public int getBrutalValue() {
        return RuneManager.currentRuneCount(Rune.STABLE);
    }

    @Override
    public int price() {
        return 7;
    }
}
