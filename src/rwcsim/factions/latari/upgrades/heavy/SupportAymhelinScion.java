package rwcsim.factions.latari.upgrades.heavy;

import rwcsim.base.systems.stages.AfterActivation;
import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.SiegeUpgrade;
import rwcsim.factions.base.abilities.Overgrow;
import rwcsim.factions.base.upgrades.Heavy;
import rwcsim.utils.runes.Rune;
import rwcsim.utils.runes.RuneManager;

public class SupportAymhelinScion extends FigureUpgrade implements Heavy, SiegeUpgrade, OnSkill, AfterActivation, Overgrow {
    public SupportAymhelinScion() {
        this.armor = 1 + RuneManager.currentRuneCount(Rune.STABLE);
        this.health = 3;
    }

    @Override
    public int getOvergrowValue() {
        return 1;
    }
}
