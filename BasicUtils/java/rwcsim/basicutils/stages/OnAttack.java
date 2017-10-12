package rwcsim.basicutils.stages;


import rwcsim.basicutils.concepts.Stage;

public interface OnAttack extends Stage<OnAttack> { //OnMeleeAttack , OnRangedAttack {
    Key<OnAttack> key = new Key<>();
    default Key<OnAttack> key() { return key; }
}
