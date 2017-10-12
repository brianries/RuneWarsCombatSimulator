package rwcsim.factions.latari.upgrades.heavy;

import rwcsim.basicutils.concepts.Stage;
import rwcsim.basicutils.modifiers.AddStage;
import rwcsim.basicutils.modifiers.AddStages;
import rwcsim.basicutils.modifiers.Exhaustable;
import rwcsim.basicutils.stages.OnAttack;
import rwcsim.basicutils.stages.SpendSurges;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.SiegeUpgrade;
import rwcsim.basicutils.upgrade.Heavy;
import rwcsim.factions.latari.upgrades.Latari;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

import java.util.List;

public class FrontlineAymhelinScion extends FigureUpgrade implements Cost, Latari, Heavy, SiegeUpgrade, AddStages<OnAttack,SpendSurges>, Exhaustable {
    public FrontlineAymhelinScion() {
        this.armor = 1 + RuneManager.currentRuneCount(RuneFaces.STABLE);
        this.health = 3;
    }

    @Override
    public int price() {
        return 6;
    }

    @Override
    public List<Stage> getStage() {
        return null;
    }
}
