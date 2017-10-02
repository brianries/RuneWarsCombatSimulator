package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;

public class UncontrolledGeomancer extends FigureUpgrade implements Champion, InfantryUpgrade, OnSkill {
    public UncontrolledGeomancer() {
        this.armor = 2;
    }
}
