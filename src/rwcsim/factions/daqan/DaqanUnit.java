package rwcsim.factions.daqan;

import rwcsim.base.Formation;
import rwcsim.factions.base.BaseUnit;
import rwcsim.factions.base.upgrades.UpgradeType;
import rwcsim.factions.waiqar.WaiqarUnit;

import java.util.List;

public abstract class DaqanUnit extends BaseUnit {

    public DaqanUnit getAsDaqanUnit() {
        return this;
    }
    public WaiqarUnit getAsWaiqarUnit() { return null; }
}
