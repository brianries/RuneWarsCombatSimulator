package rwcsim.factions.daqan.upgrades.heavy;

import rwcsim.basicutils.actions.OnSkill;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.SiegeUpgrade;
import rwcsim.basicutils.upgrade.Heavy;
import rwcsim.factions.daqan.upgrades.Daqan;

public class SupportRuneGolem extends FigureUpgrade implements Daqan, Heavy, SiegeUpgrade, OnSkill, Cost {
    public SupportRuneGolem() {
        this.armor = 4;
        this.health = 2;
    }

    @Override
    public int price() {
        return 6;
    }
}
