package rwcsim.factions.daqan.upgrades.heraldry;

import rwcsim.basicutils.stages.OnAttack;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.upgrade.Heraldry;
import rwcsim.factions.daqan.upgrades.Daqan;

public class EagleBannerBearer extends FigureUpgrade implements Cost, Daqan, Heraldry, InfantryUpgrade, OnAttack {
    public EagleBannerBearer() {
    }

    @Override
    public int price() {
        return 4;
    }
}
