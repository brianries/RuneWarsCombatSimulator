package rwcsim.factions.daqan.upgrades.heraldry;

import rwcsim.basicutils.modifiers.AddAbility;
import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.FigureUpgrade;
import rwcsim.basicutils.upgrade.InfantryUpgrade;
import rwcsim.basicutils.abilities.Steadfast;
import rwcsim.basicutils.upgrade.Heraldry;
import rwcsim.factions.daqan.upgrades.Daqan;

public class LionStandardBearer extends FigureUpgrade implements Cost, Daqan, Heraldry, InfantryUpgrade, AddAbility<Steadfast> {
    public LionStandardBearer() {
        this.armor = 3;
    }

    @Override
    public int price() {
        return 5;
    }

    @Override
    public Steadfast getAbility() {
        return Steadfast.asAbility(MoraleType.FEAR, 1);
    }
}
