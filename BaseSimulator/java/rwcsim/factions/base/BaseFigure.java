package rwcsim.factions.base;

import rwcsim.utils.trays.Tray;

public class BaseFigure extends AbstractFigure {
    @Override
    public boolean replaceTray() {
        return false;
    }

    @Override
    public Tray getTray() {
        return null;
    }
}
