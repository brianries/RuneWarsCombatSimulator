package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface WhileAttacking extends Stage<WhileAttacking> {
    Key<WhileAttacking> key = new Key<>();
    default Key<WhileAttacking> key() { return key; };
}
