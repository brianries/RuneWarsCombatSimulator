package rwcsim.factions.waiqar.upgrades.heavy;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.SiegeUpgrade;
import rwcsim.factions.base.upgrades.Heavy;

public class SupportCarrionLancer extends FigureUpgrade implements Heavy, SiegeUpgrade, OnSkill {
    public SupportCarrionLancer() {
        this.armor = 3;
        this.health = 3;
    }
}
