package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.base.systems.stages.SpendSurges;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.waiqar.AnkaurMaro;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class RegenerativeMagic implements Cost, Waiqar,HeroSpecific<AnkaurMaro>, Unique, SpendSurges {
    @Override
    public int price() {
        return 5;
    }
}
