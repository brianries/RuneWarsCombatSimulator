package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface AfterDefending extends Stage<AfterDefending> {
    Key<AfterDefending> key = new Key<>();
    default Key<AfterDefending> key() { return key; }
}
