package rwcsim.factions.daqan.upgrades.champion;

import rwcsim.basicutils.actions.AddDie;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Champion;
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
