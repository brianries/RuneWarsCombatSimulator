package rwcsim.factions.waiqar;

import rwcsim.base.Formation;
import rwcsim.factions.base.BaseUnit;
import rwcsim.factions.base.upgrades.UpgradeType;
import rwcsim.factions.daqan.DaqanUnit;

import java.util.List;

public abstract class WaiqarUnit extends BaseUnit {
    public List<UpgradeType> availableUpgrades(boolean listContainsArdus, Formation formation) {
        populateUpgrades(listContainsArdus, formation);
        return legalUpgrades;
    }

    public abstract void populateUpgrades(boolean listContainsArdus, Formation formation);

    public DaqanUnit  getAsDaqanUnit() { return null; }
    public WaiqarUnit getAsWaiqarUnit() {
        return this;
    }
}
