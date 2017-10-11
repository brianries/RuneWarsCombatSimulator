package rwcsim.basicutils.unit;


public abstract class LatariUnit extends BaseUnit {
    public LatariUnit() {
        super();
    }
    public DaqanUnit getAsDaqanUnit() {
        return null;
    }
    public LatariUnit getAsLatariUnit() { return this; }
    public UthukUnit getAsUthukUnit() { return null; }
    public WaiqarUnit getAsWaiqarUnit() { return null; }
}
