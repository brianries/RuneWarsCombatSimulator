package rwcsim.factions.waiqar.upgrades.training;

import rwcsim.basicutils.stages.OnEmptyTray;
import rwcsim.basicutils.concepts.Cost;
import rwcsim.basicutils.upgrade.Training;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class LingeringDead implements Cost, Waiqar, Training, OnEmptyTray {
    @Override
    public int price() {
        return 3;
    }
}
