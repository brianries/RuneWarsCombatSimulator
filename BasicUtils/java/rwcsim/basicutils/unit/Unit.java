package rwcsim.basicutils.unit;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.concepts.*;
import rwcsim.basicutils.dials.CommandTool;
import rwcsim.basicutils.dice.DiePool;
import rwcsim.basicutils.upgrade.Upgrade;
import rwcsim.basicutils.upgrade.UpgradeType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dsayles on 8/17/17.
 */
public interface Unit {
    List<Formation> legalFormations = new ArrayList<>();
    List<UpgradeType> legalUpgrades = new ArrayList<>();
    List<Ability> abilities = new ArrayList<>();
    Map<Stage.Key,List<Upgrade>> upgradeRegister = new HashMap<>();

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

    void setAbilities();
    default void addAbility(Ability ability) { abilities.add(ability); }

    default void registerUpgrade(Stage stage, Upgrade upgrade) {
        if (!upgradeRegister.containsKey(stage.key())) {
            upgradeRegister.put(stage.key(), new ArrayList<Upgrade>());
        }
        upgradeRegister.get(stage.key()).add(upgrade);
    }
    default Map<Stage.Key, List<Upgrade>> getStageRegister() { return upgradeRegister; }
}
