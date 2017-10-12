package rwcsim.basicutils.actions;

import rwcsim.basicutils.concepts.Action;

public interface AddSurges extends Action {
    int getSurges();
    default int addSurges() { return getSurges(); }
}
