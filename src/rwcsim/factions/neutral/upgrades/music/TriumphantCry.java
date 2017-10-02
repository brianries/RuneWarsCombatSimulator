package rwcsim.factions.neutral.upgrades.music;

import rwcsim.base.systems.stages.WhenEngagedEnemyIsDestroyed;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Music;

public class TriumphantCry implements Cost, Music, WhenEngagedEnemyIsDestroyed {
    @Override
    public int price() {
        return 3;
    }
}
