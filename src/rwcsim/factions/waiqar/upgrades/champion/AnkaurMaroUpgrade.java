package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.CavalryUpgrade;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.HeroUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.base.upgrades.Unique;

public class AnkaurMaroUpgrade extends FigureUpgrade implements Champion, HeroUpgrade, InfantryUpgrade, CavalryUpgrade, Unique, OnSkill {
    public AnkaurMaroUpgrade() {
        this.armor = 2;
        this.health = 3;
    }
}
