package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface SpendMortalStrikes extends Stage<SpendMortalStrikes> {
    Key<SpendMortalStrikes> key = new Key<>();
    default Key<SpendMortalStrikes> key() { return key; };
}