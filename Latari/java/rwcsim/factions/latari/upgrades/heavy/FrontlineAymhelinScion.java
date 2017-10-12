package rwcsim.factions.latari.upgrades.heavy;

import rwcsim.basicutils.stages.Exhaustable;
import rwcsim.basicutils.stages.OnAttack;
import rwcsim.basicutils.stages.SpendSurges;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.SiegeUpgrade;
import rwcsim.basicutils.upgrade.Heavy;
import rwcsim.factions.latari.upgrades.Latari;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class FrontlineAymhelinScion extends FigureUpgrade implements Cost, Latari, Heavy, SiegeUpgrade, OnAttack, Exhaustable, SpendSurges {
    public FrontlineAymhelinScion() {
        this.armor = 1 + RuneManager.currentRuneCount(RuneFaces.STABLE);
        this.health = 3;
    }

    @Override
    public int price() {
        return 6;
    }
}
