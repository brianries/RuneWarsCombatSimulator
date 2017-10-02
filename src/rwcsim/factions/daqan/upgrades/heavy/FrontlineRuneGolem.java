package rwcsim.factions.daqan.upgrades.heavy;

import rwcsim.base.systems.stages.WhileAttacking;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.SiegeUpgrade;
import rwcsim.factions.base.abilities.Brutal;
import rwcsim.factions.base.upgrades.Heavy;
import rwcsim.utils.runes.Rune;
import rwcsim.utils.runes.RuneManager;

public class FrontlineRuneGolem extends FigureUpgrade implements Heavy, SiegeUpgrade, WhileAttacking, Brutal {
    public FrontlineRuneGolem() {
        this.armor = 4;
        this.health = 2;
    }

    @Override
    public int getBrutalValue() {
        return RuneManager.currentRuneCount(Rune.STABLE);
    }
}
