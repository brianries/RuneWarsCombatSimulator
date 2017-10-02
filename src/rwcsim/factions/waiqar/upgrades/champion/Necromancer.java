package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class Necromancer extends FigureUpgrade implements Cost, Waiqar, Champion, InfantryUpgrade, OnSkill {
    public Necromancer() {
        this.armor = 2;
    }

    @Override
    public int price() {
        return 3;
    }
}
