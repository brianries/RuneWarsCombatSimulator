package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface AfterActivation extends Stage<AfterActivation> {
    Key<AfterActivation> key = new Key<>();
    default Key<AfterActivation> key() { return key; }
}
