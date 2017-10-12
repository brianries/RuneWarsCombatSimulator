package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface OnCollision extends Stage<OnCollision> {
    Key<OnCollision> key = new Key<>();
    default Key<OnCollision> key() { return key; };
}
