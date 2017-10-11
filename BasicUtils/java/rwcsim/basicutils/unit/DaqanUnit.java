package rwcsim.basicutils.unit;


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
