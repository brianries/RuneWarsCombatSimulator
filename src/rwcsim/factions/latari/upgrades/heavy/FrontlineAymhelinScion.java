package rwcsim.factions.latari.upgrades.heavy;

import rwcsim.base.systems.stages.Exhaustable;
import rwcsim.base.systems.stages.OnAttack;
import rwcsim.base.systems.stages.SpendSurges;
import rwcsim.base.systems.stages.WhileAttacking;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.SiegeUpgrade;
import rwcsim.factions.base.upgrades.Heavy;
import rwcsim.factions.latari.upgrades.Latari;
import rwcsim.utils.runes.Rune;
import rwcsim.utils.runes.RuneManager;

public class FrontlineAymhelinScion extends FigureUpgrade implements Cost, Latari, Heavy, SiegeUpgrade, OnAttack, Exhaustable, SpendSurges {
    public FrontlineAymhelinScion() {
        this.armor = 1 + RuneManager.currentRuneCount(Rune.STABLE);
        this.health = 3;
    }

    @Override
    public int price() {
        return 6;
    }
}
