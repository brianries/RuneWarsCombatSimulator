package rwcsim.factions.neutral.figures;

import rwcsim.basicutils.figure.BaseFigure;

public class SiegeFigure extends BaseFigure {
    int armor;
    int health;

    public SiegeFigure(int armor, int health) {
        this.armor = armor;
        this.health = health;
    }

    @Override
    public int getArmor() { return armor;}
    @Override
    public int getHealth() { return health;}
}