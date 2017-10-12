package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface WhenEngagedEnemyIsDestroyed extends Stage<WhenEngagedEnemyIsDestroyed> {
    Key<WhenEngagedEnemyIsDestroyed> key = new Key<>();
    default Key<WhenEngagedEnemyIsDestroyed> key() { return key; };
}
