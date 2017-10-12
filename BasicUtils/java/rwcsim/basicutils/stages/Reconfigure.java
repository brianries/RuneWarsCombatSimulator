package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface Reconfigure extends Stage<Reconfigure> {
    Key<Reconfigure> key = new Key<>();
    default Key<Reconfigure> key() { return key; };
}