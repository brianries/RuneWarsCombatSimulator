package rwcsim.factions.base;

import rwcsim.base.Formation;
import rwcsim.base.dials.CommandTool;
import rwcsim.factions.base.upgrades.UpgradeType;

import java.util.List;

public abstract class BaseUnit implements Unit {
    public CommandTool commandTool;
//    Formation formation;

//    DiePool meleePool;
//    DiePool rangedPool;

//    int woundCount;

    @Override
    public Siege getAsSiege() {
        if (this instanceof Siege) return (Siege)this;
        return null;
    }

    @Override
    public Infantry getAsInfantry() {
        if (this instanceof Infantry) return (Infantry)this;
        return null;
    }

    @Override
    public Cavalry getAsCavalry() {
        if (this instanceof Cavalry) return (Cavalry)this;
        return null;
    }

    @Override
    public Hero getAsHero() {
        if (this instanceof Hero) return (Hero)this;
        return null;
    }

    public List<Formation> availableFormations() {
        populateFormations();
        return legalFormations;
    };

    public List<UpgradeType> availableUpgrades(Formation formation) {
        populateUpgrades(formation);
        return legalUpgrades;
    }
}
