package rwcsim.factions.waiqar.upgrades.unique;

import rwcsim.basicutils.actions.AddSurges;
import rwcsim.basicutils.stages.OnMeleeAttack;
import rwcsim.basicutils.upgrade.HeroSpecific;
import rwcsim.basicutils.upgrade.Unique;
import rwcsim.basicutils.upgrade.Upgrade;
import rwcsim.factions.waiqar.ArdusIxErebus;

public class ArdusFury implements Upgrade, HeroSpecific<ArdusIxErebus>, Unique, OnMeleeAttack, AddSurges {

    @Override
    public int getSurges() {
        return 1;
    }
}
