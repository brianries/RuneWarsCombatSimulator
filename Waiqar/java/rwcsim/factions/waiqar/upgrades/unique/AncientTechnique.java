package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.abilities.Precise;
import rwcsim.basicutils.modifiers.AddAbility;
import rwcsim.basicutils.upgrade.HeroSpecific;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.factions.waiqar.ArdusIxErebus;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class AncientTechnique implements Cost, Waiqar, HeroSpecific<ArdusIxErebus>, Unique, AddAbility<Precise> {
    @Override
    public int price() {
        return 2;
    }

    @Override
    public Precise getAbility() {
        return Precise.asAbility(1);
    }
}
