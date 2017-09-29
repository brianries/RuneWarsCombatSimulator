package rwcsim.factions.uthuk;

import rwcsim.factions.base.BaseUnit;
import rwcsim.factions.daqan.DaqanUnit;
import rwcsim.factions.latari.LatariUnit;
import rwcsim.factions.waiqar.WaiqarUnit;

public abstract class UthukUnit extends BaseUnit {
    public UthukUnit() {
        super();
    }
    public DaqanUnit getAsDaqanUnit() {
        return null;
    }
    public LatariUnit getAsLatariUnit() { return null; }
    public UthukUnit getAsUthukUnit() { return this; }
    public WaiqarUnit getAsWaiqarUnit() { return null; }
}
