package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface BeginningEndPhase extends Stage<BeginningEndPhase> {
    Key<BeginningEndPhase> key = new Key<>();
    default Key<BeginningEndPhase> key() { return key; };
}
