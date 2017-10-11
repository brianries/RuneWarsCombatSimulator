package rwcsim.factions.daqan.upgrades.heraldry;

import rwcsim.base.morale.MoraleType;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.abilities.Steadfast;
import rwcsim.factions.base.upgrades.Heraldry;
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
