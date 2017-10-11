package rwcsim.basicutils.actions;

public interface AddSurges {
    int getSurges();
    default int addSurges() { return getSurges(); }
}
