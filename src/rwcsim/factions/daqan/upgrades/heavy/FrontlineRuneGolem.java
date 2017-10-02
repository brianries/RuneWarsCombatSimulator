package rwcsim.factions.daqan.upgrades.heavy;

import rwcsim.base.systems.stages.WhileAttacking;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.SiegeUpgrade;
import rwcsim.factions.base.abilities.Brutal;
import rwcsim.factions.base.upgrades.Heavy;
import rwcsim.factions.daqan.upgrades.Daqan;
import rwcsim.utils.runes.Rune;
import rwcsim.utils.runes.RuneManager;

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
