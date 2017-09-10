package rwcsim.factions.daqan;

import rwcsim.base.Formation;
import rwcsim.factions.UnitManager;
import rwcsim.factions.base.DeployableUnit;
import rwcsim.factions.base.Unit;
import rwcsim.factions.base.upgrades.UpgradeType;
import rwcsim.factions.waiqar.*;

import java.util.List;

public class DaqanUnitManager extends UnitManager {
    public static final int KARI_WRAITHSTALKER = 0;
    public static final int SPEARMEN = 1;
    public static final int OATHSWORN_CAVALRY = 2;
    public static final int RUNE_GOLEMS = 3;
    public static final int LORD_HAWTHORNE = 4;
    public static final int HEAVY_CROSSBOWMEN = 5;
//    public static final int WRAITHS = 6;

    public List<Formation> availableFormations(int unit) {
        switch (unit) {
            case KARI_WRAITHSTALKER: return new ArdusIxErebus().availableFormations();
            case SPEARMEN: return new CarrionLancer().availableFormations();
            case OATHSWORN_CAVALRY: return new ReanimateArchers().availableFormations();
            case RUNE_GOLEMS: return new AnkaurMaro().availableFormations();
            case LORD_HAWTHORNE: return new DeathKnights().availableFormations();
//            case WRAITHS: return new Wraiths().avaialbleFormations();
        }
        return null;
    }

    public int formationCost(int unit, Formation formation) {
        switch(unit) {
            case KARI_WRAITHSTALKER: return 37;
            case SPEARMEN:
                switch(formation) {
                    case ONE: return 15;
                    case TWO_BY_ONE: return 27;
                    case TWO_BY_TWO: return 46;
                    case THREE_BY_TWO: return 68;
                }
                break;
            case OATHSWORN_CAVALRY:
                switch(formation) {
                    case TWO_BY_ONE: return 18;
                    case TWO_BY_TWO: return 32;
                    case THREE_BY_TWO: return 45;
                }
                break;
            case RUNE_GOLEMS:
                switch (formation) {
                    case TWO_BY_ONE: return 16;
                    case TWO_BY_TWO: return 26;
                    case THREE_BY_TWO: return 35;
                    case THREE_BY_THREE: return 50;
                    case FOUR_BY_THREE: return 64;
                }
            case LORD_HAWTHORNE: return 34;
            case HEAVY_CROSSBOWMEN:
                switch(formation) {
                    case TWO_BY_ONE: return 19;
                    case THREE_BY_ONE: return 27;
                    case THREE_BY_TWO: return 48;
                }
                break;
//            case WRAITHS:
//                break;
        }
        return 0;
    }

    public List<UpgradeType> availableUpgrades(Unit unit, Formation formation) {
        return unit.getAsDaqanUnit().availableUpgrades(formation);
    }



}
