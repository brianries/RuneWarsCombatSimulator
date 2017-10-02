package rwcsim.factions.daqan.upgrades.heraldry;

import rwcsim.base.systems.stages.OnAttack;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.upgrades.Heraldry;
import rwcsim.factions.daqan.upgrades.Daqan;

public class EagleBannerBearer extends FigureUpgrade implements Cost, Daqan, Heraldry, InfantryUpgrade, OnAttack {
    public EagleBannerBearer() {
    }

    @Override
    public int price() {
        return 4;
    }
}
