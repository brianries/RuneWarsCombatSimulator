package rwcsim.factions.waiqar.upgrades.training;

import rwcsim.base.systems.stages.OnEmptyTray;
import rwcsim.factions.base.Cost;
import rwcsim.factions.base.upgrades.Training;
import rwcsim.factions.waiqar.upgrades.Waiqar;

public class LingeringDead implements Cost, Waiqar, Training, OnEmptyTray {
    @Override
    public int price() {
        return 3;
    }
}
