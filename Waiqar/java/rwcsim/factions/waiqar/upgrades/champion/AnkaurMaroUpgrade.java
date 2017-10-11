package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.actions.OnSkill;
import rwcsim.basicutils.upgrade.CavalryUpgrade;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.HeroUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Champion;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class AnkaurMaroUpgrade extends FigureUpgrade implements Cost, Waiqar, Champion, HeroUpgrade, InfantryUpgrade, CavalryUpgrade, Unique, OnSkill {
    public AnkaurMaroUpgrade() {
        this.armor = 2;
        this.health = 3;
    }

    @Override
    public int price() {
        return 20;
    }
}
