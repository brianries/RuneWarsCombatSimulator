package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.basicutils.stages.OnRangedAttack;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.abilities.Brutal;
import rwcsim.basicutils.upgrade.HeroSpecific;
import rwcsim.basicutils.upgrade.Unique;
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
