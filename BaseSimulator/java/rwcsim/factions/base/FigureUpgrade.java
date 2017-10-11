package rwcsim.factions.base;

import rwcsim.utils.trays.Tray;

public class FigureUpgrade extends AbstractFigure {


    @Override
    public boolean isUpgrade() {
        return true;
    }

    @Override
    public boolean replaceTray() {
        return false;
    }

    @Override
    public Tray getTray() {
        return null;
    }
}
