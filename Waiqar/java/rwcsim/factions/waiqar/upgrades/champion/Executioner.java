package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.basicutils.actions.OnSkill;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Champion;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class Executioner extends FigureUpgrade implements Cost, Waiqar, Champion, InfantryUpgrade, OnSkill {
    public Executioner() {
        this.armor = 3;
    }

    @Override
    public int price() {
        return 6;
    }
}
