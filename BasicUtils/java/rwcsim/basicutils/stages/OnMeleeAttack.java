package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface OnMeleeAttack extends Stage<OnMeleeAttack> {
    Key<OnMeleeAttack> key = new Key<>();
    default Key<OnMeleeAttack> key() { return key; };
}
