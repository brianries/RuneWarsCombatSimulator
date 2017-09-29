package rwcsim.factions.daqan;

import rwcsim.base.Formation;
import rwcsim.factions.base.BaseUnit;
import rwcsim.factions.base.upgrades.UpgradeType;
import rwcsim.factions.latari.LatariUnit;
import rwcsim.factions.uthuk.UthukUnit;
import rwcsim.factions.waiqar.WaiqarUnit;

import java.util.List;

public abstract class DaqanUnit extends BaseUnit {
    public DaqanUnit() {
        super();
    }
    public DaqanUnit  getAsDaqanUnit() {
        return this;
    }
    public LatariUnit getAsLatariUnit() { return null; }
    public UthukUnit getAsUthukUnit() { return null; }
    public WaiqarUnit getAsWaiqarUnit() { return null; }
}
