package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface OnMoraleTest extends Stage<OnMoraleTest> {
    Key<OnMoraleTest> key = new Key<>();
    default Key<OnMoraleTest> key() { return key; };
}
