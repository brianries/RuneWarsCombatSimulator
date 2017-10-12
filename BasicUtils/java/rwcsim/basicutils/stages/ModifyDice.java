package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface ModifyDice extends Stage<ModifyDice> {
    Key<ModifyDice> key = new Key<>();
    default Key<ModifyDice> key() { return key; }
}