package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.base.systems.stages.OnRangedAttack;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.abilities.Brutal;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.waiqar.AnkaurMaro;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class ViolentForces implements Cost, Waiqar,HeroSpecific<AnkaurMaro>, Unique, OnRangedAttack, Brutal {
    @Override
    public int getBrutalValue() {
        return 1;
    }

    @Override
    public int price() {
        return 6;
    }
}
