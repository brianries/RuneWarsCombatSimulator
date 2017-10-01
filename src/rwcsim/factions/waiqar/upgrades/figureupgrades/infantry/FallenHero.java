package rwcsim.factions.waiqar.upgrades.figureupgrades.infantry;

import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;

public class FallenHero extends FigureUpgrade implements Champion, InfantryUpgrade {
    public FallenHero() {
        this.armor = 3;
        this.health = 2;
    }
}
