package rwcsim.factions.latari.upgrades.heavy;

import rwcsim.basicutils.stages.AfterActivation;
import rwcsim.basicutils.actions.OnSkill;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.SiegeUpgrade;
import rwcsim.basicutils.abilities.Overgrow;
import rwcsim.basicutils.upgrade.Heavy;
import rwcsim.factions.latari.upgrades.Latari;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public class SupportAymhelinScion extends FigureUpgrade implements Cost, Latari, Heavy, SiegeUpgrade, OnSkill, AfterActivation, Overgrow {
    public SupportAymhelinScion() {
        this.armor = 1 + RuneManager.currentRuneCount(RuneFaces.STABLE);
        this.health = 3;
    }

    @Override
    public int getOvergrowValue() {
        return 1;
    }

    @Override
    public int price() {
        return 4;
    }
}
