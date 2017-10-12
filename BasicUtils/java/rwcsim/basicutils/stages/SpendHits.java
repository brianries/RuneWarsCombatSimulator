package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface SpendHits extends Stage<SpendHits> {
    Key<SpendHits> key = new Key<>();
    default Key<SpendHits> key() { return key; };
}