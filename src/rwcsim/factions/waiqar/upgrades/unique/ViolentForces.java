package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.base.systems.stages.OnRangedAttack;
import rwcsim.factions.base.abilities.Brutal;
import rwcsim.factions.base.upgrades.HeroSpecific;
import rwcsim.factions.base.upgrades.Unique;
import rwcsim.factions.waiqar.AnkaurMaro;

public class ViolentForces implements HeroSpecific<AnkaurMaro>, Unique, OnRangedAttack, Brutal {
    @Override
    public int getBrutalValue() {
        return 1;
    }
}
