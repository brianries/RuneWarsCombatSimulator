package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface AfterCommandDialReveal extends Stage<AfterCommandDialReveal> {
    Key<AfterCommandDialReveal> key = new Key<>();
    default Key<AfterCommandDialReveal> key() { return key; }
}
