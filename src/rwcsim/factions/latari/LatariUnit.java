package rwcsim.factions.latari;

import rwcsim.factions.base.BaseUnit;
import rwcsim.factions.daqan.DaqanUnit;
import rwcsim.factions.uthuk.UthukUnit;
import rwcsim.factions.waiqar.WaiqarUnit;

public abstract class LatariUnit extends BaseUnit {

    public DaqanUnit getAsDaqanUnit() {
        return null;
    }
    public LatariUnit getAsLatariUnit() { return this; }
    public UthukUnit getAsUthukUnit() { return null; }
    public WaiqarUnit getAsWaiqarUnit() { return null; }
}
