package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface ResolveMorale extends Stage<ResolveMorale> {
    Key<ResolveMorale> key = new Key<>();
    default Key<ResolveMorale> key() { return key; };
}