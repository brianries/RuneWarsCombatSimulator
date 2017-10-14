package rwcsim.basicutils.figure;


import rwcsim.basicutils.concepts.Figure;
import rwcsim.basicutils.concepts.Tray;

public abstract class AbstractFigure implements Figure {
    public boolean isUpgrade() {
        return false;
    }
    public abstract boolean replaceTray();
    public abstract Tray getTray();
}
