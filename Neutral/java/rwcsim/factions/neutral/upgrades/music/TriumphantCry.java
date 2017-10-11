package rwcsim.factions.neutral.upgrades.music;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.WhenEngagedEnemyIsDestroyed;
import rwcsim.basicutils.upgrade.Music;

public class TriumphantCry implements Cost, Music, WhenEngagedEnemyIsDestroyed {
    @Override
    public int price() {
        return 3;
    }
}
