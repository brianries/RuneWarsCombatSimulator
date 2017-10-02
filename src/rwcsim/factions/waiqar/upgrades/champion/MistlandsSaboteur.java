package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;

public class MistlandsSaboteur extends FigureUpgrade implements Champion, InfantryUpgrade, OnSkill {
    public MistlandsSaboteur() {
        this.armor = 2;
    }
}
