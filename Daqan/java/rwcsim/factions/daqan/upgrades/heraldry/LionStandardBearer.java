package rwcsim.factions.daqan.upgrades.heraldry;

import rwcsim.basicutils.concepts.Figure;
import rwcsim.basicutils.modifiers.AddAbility;
import rwcsim.basicutils.morale.MoraleType;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.concepts.FigureUpgrade;
import rwcsim.basicutils.upgrades.InfantryUpgrade;
import rwcsim.basicutils.abilities.Steadfast;
import rwcsim.basicutils.upgrades.Heraldry;
import rwcsim.factions.daqan.upgrades.Daqan;

public class LionStandardBearer implements FigureUpgrade, Cost, Daqan, Heraldry, InfantryUpgrade, AddAbility<Steadfast> {
    public LionStandardBearer() {

    }

    @Override
    public int price() {
        return 5;
    }

    @Override
    public Steadfast getAbility() {
        return Steadfast.asAbility(MoraleType.FEAR, 1);
    }

    @Override
    public Figure getFigure() {
        return null;
    }

    @Override
    public int getArmor() {
        return 3;
    }
}
