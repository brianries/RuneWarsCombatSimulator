package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface OnActivation extends Stage<OnActivation> {
    Key<OnActivation> key = new Key<>();
    default Key<OnActivation> key() { return key; }
}
