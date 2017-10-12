package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface AfterAttacking extends Stage<AfterAttacking> {
    Key<AfterAttacking> key = new Key<>();
    default Key<AfterAttacking> key() { return key; }
}
