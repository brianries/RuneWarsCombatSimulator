package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface SpendSurges extends Stage<SpendSurges> {
    Key<SpendSurges> key = new Key<>();
    default Key<SpendSurges> key() { return key; };
}