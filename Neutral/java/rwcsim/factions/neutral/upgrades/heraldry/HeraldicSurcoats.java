package rwcsim.factions.neutral.upgrades.heraldry;

import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.stages.OnMoraleTest;
import rwcsim.basicutils.upgrade.Heraldry;

public class HeraldicSurcoats implements Cost, Heraldry, OnMoraleTest {
    @Override
    public int price() {
        return 5;
    }
}
