package rwcsim.basicutils.unit;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.concepts.Cavalry;
import rwcsim.basicutils.concepts.Hero;
import rwcsim.basicutils.concepts.Infantry;
import rwcsim.basicutils.concepts.Siege;
import rwcsim.basicutils.dials.CommandTool;
import rwcsim.basicutils.dice.DiePool;
import rwcsim.basicutils.upgrades.UpgradeType;

import java.util.List;

public abstract class BaseUnit implements Unit {
    public CommandTool commandTool;

    DiePool meleePool;
    DiePool rangedPool;

//    int woundCount;

    public BaseUnit() {
        initializeUnit();
    }

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

    public CommandTool getCommandTool() {
        return this.commandTool;
    }

    public DiePool getMeleeAttackPool() {
        return this.meleePool;
    }
    public void setMeleeAttackPool(DiePool diePool) {
        this.meleePool = diePool;
    }

    public DiePool getRangedAttackPool() {
        return this.rangedPool;
    }
    public void setRangedAttackPool(DiePool diePool) {
        this.rangedPool = diePool;
    }
}
