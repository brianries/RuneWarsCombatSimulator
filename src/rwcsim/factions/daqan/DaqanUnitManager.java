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
            case KARI_WRAITHSTALKER: return new KariWraithstalker().availableFormations();
            case SPEARMEN: return new Spearmen().availableFormations();
            case OATHSWORN_CAVALRY: return new OathswornCavalry().availableFormations();
            case RUNE_GOLEMS: return new RuneGolems().availableFormations();
            case LORD_HAWTHORNE: return new LordHawthorne().availableFormations();
            case HEAVY_CROSSBOWMEN: return new HeavyCrossbowmen().availableFormations();
        }
        return null;
    }

    public int formationCost(int unit, Formation formation) {
        switch(unit) {
            case KARI_WRAITHSTALKER: return 32;
            case SPEARMEN:
                switch(formation) {
                    case TWO_BY_ONE: return 18;
                    case TWO_BY_TWO: return 30;
                    case THREE_BY_TWO: return 40;
                    case THREE_BY_THREE: return 59;
                }
                break;
            case OATHSWORN_CAVALRY:
                switch(formation) {
                    case TWO_BY_ONE: return 20;
                    case TWO_BY_TWO: return 34;
                    case TWO_BY_THREE: return 46;
                    case THREE_BY_THREE: return 68;
                }
                break;
            case RUNE_GOLEMS:
                switch (formation) {
                    case ONE: return 17;
                    case TWO_BY_ONE: return 26;
                    case TWO_BY_TWO: return 50;
                    case THREE_BY_TWO: return 74;
                }
            case LORD_HAWTHORNE: return 34;
            case HEAVY_CROSSBOWMEN:
                switch(formation) {
                    case TWO_BY_ONE: return 19;
                    case THREE_BY_ONE: return 27;
                    case THREE_BY_TWO: return 48;
                }
                break;
        }
        return 0;
    }

    public List<UpgradeType> availableUpgrades(Unit unit, Formation formation) {
        return unit.getAsDaqanUnit().availableUpgrades(formation);
    }



}
