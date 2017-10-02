package rwcsim.factions.daqan.upgrades.heraldry;

import rwcsim.base.morale.MoraleType;
import rwcsim.factions.base.FigureUpgrade;
import rwcsim.factions.base.InfantryUpgrade;
import rwcsim.factions.base.abilities.Steadfast;
import rwcsim.factions.base.upgrades.Heraldry;

public class LionStandardBearer extends FigureUpgrade implements Heraldry, InfantryUpgrade, Steadfast {
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
}
