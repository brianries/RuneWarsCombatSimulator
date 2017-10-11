package rwcsim.base.systems.actions;

public interface AddSurges {
    int getSurges();
    default int addSurges() { return getSurges(); }
}
