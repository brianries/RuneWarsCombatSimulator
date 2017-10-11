package rwcsim.basicutils.figure;


import rwcsim.basicutils.concepts.Figure;
import rwcsim.basicutils.concepts.Tray;

public abstract class AbstractFigure implements Figure {
    public int armor = 1;
    public int health = 1;
    @Override
    public boolean isUpgrade() {
        return false;
    }
    public abstract boolean replaceTray();
    public abstract Tray getTray();
    public int getArmor() {
        return armor;
    }
    public int getHealth() {
        return health;
    }
}
