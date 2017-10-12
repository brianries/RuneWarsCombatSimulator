package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface WhileDefending extends Stage<WhileDefending> {
    Key<WhileDefending> key = new Key<>();
    default Key<WhileDefending> key() { return key; };
}
