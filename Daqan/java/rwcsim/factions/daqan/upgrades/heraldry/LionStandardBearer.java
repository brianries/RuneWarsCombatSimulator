package rwcsim.factions.daqan.upgrades.heraldry;

import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.abilities.Steadfast;
import rwcsim.basicutils.upgrade.Heraldry;
import rwcsim.factions.daqan.upgrades.Daqan;

public class LionStandardBearer extends FigureUpgrade implements Cost, Daqan, Heraldry, InfantryUpgrade, Steadfast {
    public LionStandardBearer() {
        this.armor = 3;
    }

    @Override
    public MoraleType getType() {
        return MoraleType.FEAR;
    }

    @Override
    public int getMoraleValue() {
        return 1;
    }

    @Override
    public int price() {
        return 5;
    }
}
