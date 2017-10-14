package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface RollDice extends Stage<RollDice> {
    Key<RollDice> key = new Key<>();
    default Key<RollDice> key() { return key; };
}