package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.base.systems.actions.AddDie;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Champion;
import rwcsim.factions.daqan.upgrades.Daqan;

public class CitadelWeaponsMaster extends FigureUpgrade implements Champion, Daqan, InfantryUpgrade, AddDie, Cost {
    public CitadelWeaponsMaster() {
        this.armor = 3;
    }
    public int[] modifyDiePool() {
        // add 1 red die
        return new int[]{1,0,0};
    }

    @Override
    public int price() {
        return 8;
    }
}
