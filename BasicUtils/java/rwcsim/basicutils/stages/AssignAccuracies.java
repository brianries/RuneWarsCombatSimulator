package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface AssignAccuracies extends Stage<AssignAccuracies> {
    Key<AssignAccuracies> key = new Key<>();
    default Key<AssignAccuracies> key() { return key; }
}