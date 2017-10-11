package rwcsim.factions.waiqar.upgrades.heavy;

import rwcsim.basicutils.actions.OnSkill;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.SiegeUpgrade;
import rwcsim.basicutils.upgrade.Heavy;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class SupportCarrionLancer extends FigureUpgrade implements Cost, Waiqar, Heavy, SiegeUpgrade, OnSkill {
    public SupportCarrionLancer() {
        this.armor = 3;
        this.health = 3;
    }

    @Override
    public int price() {
        return 6;
    }
}
