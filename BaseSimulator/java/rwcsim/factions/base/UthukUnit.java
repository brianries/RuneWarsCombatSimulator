package rwcsim.factions.base;


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
