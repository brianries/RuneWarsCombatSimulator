package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.basicutils.stages.SpendSurges;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.HeroSpecific;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.waiqar.AnkaurMaro;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class RegenerativeMagic implements Cost, Waiqar,HeroSpecific<AnkaurMaro>, Unique, SpendSurges {
    @Override
    public int price() {
        return 5;
    }
}
