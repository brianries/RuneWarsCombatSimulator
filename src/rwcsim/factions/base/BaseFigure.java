package rwcsim.factions.base;

import rwcsim.utils.trays.Tray;

public abstract class BaseFigure implements Figure {
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
