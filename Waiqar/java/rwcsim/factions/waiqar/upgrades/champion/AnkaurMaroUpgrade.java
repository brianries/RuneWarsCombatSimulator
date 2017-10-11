package rwcsim.factions.waiqar.upgrades.champion;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.*;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.base.upgrades.Unique;
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
