package rwcsim.factions.waiqar.upgrades.heraldry;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.concepts.Figure;
import rwcsim.basicutils.modifiers.AddAbility;
import rwcsim.basicutils.concepts.FigureUpgrade;
import rwcsim.basicutils.upgrades.InfantryUpgrade;
import rwcsim.basicutils.abilities.Protector;
import rwcsim.basicutils.upgrades.Heraldry;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class ProfaneBannerBearer implements FigureUpgrade, Cost, Waiqar,Heraldry, InfantryUpgrade, AddAbility<Protector> {
    public ProfaneBannerBearer() {
    }

    @Override
    public int price() {
        return 5;
    }

    @Override
    public Protector getAbility() {
        return Protector.asAbility(2);
    }

    @Override
    public Figure getFigure() {
        return null;
    }

    @Override
    public int getArmor() {
        return 2;
    }
}
