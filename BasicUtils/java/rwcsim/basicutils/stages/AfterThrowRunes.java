package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface AfterThrowRunes extends Stage<AfterThrowRunes> {
    Key<AfterThrowRunes> key = new Key<>();
    default Key<AfterThrowRunes> key() { return key; }
}
