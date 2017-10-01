package rwcsim.factions.base;

import rwcsim.utils.trays.Tray;

public abstract class BaseFigure implements Figure {
    @Override
    public boolean isUpgrade() {
        return false;
    }
    public abstract boolean replaceTray();
    public abstract Tray getTray();
}
