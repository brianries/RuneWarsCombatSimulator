package rwcsim.factions.neutral.upgrades.heraldry;

import rwcsim.base.systems.stages.BeginningEndPhase;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Heraldry;

public class TerrifyingHeraldry implements Cost, Heraldry, BeginningEndPhase {
    @Override
    public int price() {
        return 5;
    }
}
