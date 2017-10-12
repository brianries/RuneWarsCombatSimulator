package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface AfterCharge extends Stage<AfterCharge> {
    Key<AfterCharge> key = new Key<>();
    default Key<AfterCharge> key() { return key; }
}
