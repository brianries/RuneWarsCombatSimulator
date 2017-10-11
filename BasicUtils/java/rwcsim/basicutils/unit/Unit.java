package rwcsim.basicutils.unit;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.concepts.*;
import rwcsim.basicutils.dials.CommandTool;
import rwcsim.basicutils.dice.DiePool;
import rwcsim.basicutils.upgrade.UpgradeType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsayles on 8/17/17.
 */
public interface Unit {
    List<Formation> legalFormations = new ArrayList<>();
    List<UpgradeType> legalUpgrades = new ArrayList<>();
    List<Ability> abilities = new ArrayList<>();

    void initializeUnit();

    Siege getAsSiege();

    Infantry getAsInfantry();

    Cavalry getAsCavalry();

    Hero getAsHero();

    Tray getTray();

    DaqanUnit getAsDaqanUnit();
    LatariUnit getAsLatariUnit();
    UthukUnit getAsUthukUnit();
    WaiqarUnit getAsWaiqarUnit();

    void populateFormations();
    void populateUpgrades(Formation formation);

    CommandTool getCommandTool();
    DiePool getMeleeAttackPool();
    void setMeleeAttackPool(DiePool diePool);
    DiePool getRangedAttackPool();
    void setRangedAttackPool(DiePool diePool);
}
