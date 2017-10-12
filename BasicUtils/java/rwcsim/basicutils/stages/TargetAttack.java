package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface TargetAttack extends Stage<TargetAttack> {
    Key<TargetAttack> key = new Key<>();
    default Key<TargetAttack> key() { return key; };
}
