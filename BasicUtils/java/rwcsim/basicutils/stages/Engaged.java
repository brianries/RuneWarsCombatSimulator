package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface Engaged extends Stage<Engaged> {
    Key<Engaged> key = new Key<>();
    default Key<Engaged> key() { return key; }
}