package rwcsim.factions.neutral.upgrades.music;

import rwcsim.base.systems.stages.WhileMoving;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Music;

public class MeteredMarch implements Cost, Music, WhileMoving {
    @Override
    public int price() {
        return 2;
    }
}
