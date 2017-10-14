package rwcsim.factions.neutral.upgrades.music;


import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.WhileMoving;
import rwcsim.basicutils.upgrades.Music;

public class MeteredMarch implements Cost, Music, WhileMoving {
    @Override
    public int price() {
        return 2;
    }
}
