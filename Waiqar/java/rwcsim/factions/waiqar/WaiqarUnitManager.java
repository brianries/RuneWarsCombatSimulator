package rwcsim.factions.waiqar;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.managers.UnitManager;
import rwcsim.basicutils.unit.DeployableUnit;
import rwcsim.basicutils.unit.Unit;
import rwcsim.basicutils.upgrade.UpgradeType;

import java.util.List;

public class WaiqarUnitManager extends UnitManager {
    public static final int ARDUS_IX_EREBUS = 0;
    public static final int CARRION_LANCERS = 1;
    public static final int REANIMATE_ARCHERS = 2;
    public static final int REANIMATES = 3;
    public static final int ANKAUR_MARO = 4;
    public static final int DEATH_KNIGHTS = 5;
    public static final int WRAITHS = 6;

    public List<Formation> availableFormations(int unit) {
        switch (unit) {
            case ARDUS_IX_EREBUS: return new ArdusIxErebus().availableFormations();
            case CARRION_LANCERS: return new CarrionLancer().availableFormations();
            case REANIMATE_ARCHERS: return new ReanimateArchers().availableFormations();
            case REANIMATES: return new Reanimates().availableFormations();
            case ANKAUR_MARO: return new AnkaurMaro().availableFormations();
            case DEATH_KNIGHTS: return new DeathKnights().availableFormations();
//            case WRAITHS: return new Wraiths().avaialbleFormations();
        }
        return null;
    }

    public int formationCost(int unit, Formation formation) {
        switch(unit) {
            case ARDUS_IX_EREBUS: return 37;
            case CARRION_LANCERS:
                switch(formation) {
                    case ONE: return 15;
                    case TWO_BY_ONE: return 27;
                    case TWO_BY_TWO: return 46;
                    case THREE_BY_TWO: return 68;
                }
                break;
            case REANIMATE_ARCHERS:
                switch(formation) {
                    case TWO_BY_ONE: return 18;
                    case TWO_BY_TWO: return 32;
                    case THREE_BY_TWO: return 45;
                }
                break;
            case REANIMATES:
                switch (formation) {
                    case TWO_BY_ONE: return 16;
                    case TWO_BY_TWO: return 26;
                    case THREE_BY_TWO: return 35;
                    case THREE_BY_THREE: return 50;
                    case FOUR_BY_THREE: return 64;
                }
            case ANKAUR_MARO:
                switch(formation) {
                    case ONE: return 40;
                }
                break;
            case DEATH_KNIGHTS:
                switch(formation) {
                    case TWO_BY_ONE: return 24;
                    case TWO_BY_TWO: return 42;
                    case TWO_BY_THREE: return 55;
                }
                break;
            case WRAITHS:
                break;
        }
        return 0;
    }

    public List<UpgradeType> availableUpgrades(Unit unit, Formation formation) {
        boolean containsArdus = false;
        for (DeployableUnit du : getUnitList()) {
            if (du.getUnit() instanceof ArdusIxErebus) {
                containsArdus = true;
                break;
            }
        }
        return unit.getAsWaiqarUnit().availableUpgrades(containsArdus, formation);
    }



}
