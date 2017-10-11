package rwcsim.basicutils.upgrade;

import rwcsim.basicutils.figure.AbstractFigure;
import rwcsim.basicutils.concepts.Tray;

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
