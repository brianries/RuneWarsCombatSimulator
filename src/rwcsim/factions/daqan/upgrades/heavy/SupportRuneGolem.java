package rwcsim.factions.daqan.upgrades.heavy;

import rwcsim.base.systems.actions.OnSkill;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.SiegeUpgrade;
import rwcsim.factions.base.upgrades.Heavy;
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
