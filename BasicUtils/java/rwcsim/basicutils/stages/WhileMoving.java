package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface WhileMoving extends Stage<WhileMoving> {
    Key<WhileMoving> key = new Key<>();
    default Key<WhileMoving> key() { return key; };
}
