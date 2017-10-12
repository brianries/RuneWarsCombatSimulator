package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.basicutils.modifiers.AddAbility;
import rwcsim.basicutils.stages.OnRangedAttack;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.abilities.Brutal;
import rwcsim.basicutils.upgrade.HeroSpecific;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.waiqar.AnkaurMaro;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class ViolentForces implements Cost, Waiqar,HeroSpecific<AnkaurMaro>, Unique, OnRangedAttack, AddAbility<Brutal> {

    @Override
    public int price() {
        return 6;
    }

    @Override
    public Brutal getAbility() {
        return Brutal.asAbility(1);
    }
}
