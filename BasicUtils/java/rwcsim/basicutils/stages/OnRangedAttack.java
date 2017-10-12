package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface OnRangedAttack extends Stage<OnRangedAttack> {
    Key<OnRangedAttack> key = new Key<>();
    default Key<OnRangedAttack> key() { return key; };
}
