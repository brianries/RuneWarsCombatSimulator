package rwcsim.factions.neutral.figures;

import rwcsim.basicutils.figure.BaseFigure;

public class SiegeFigure extends BaseFigure {
    public SiegeFigure(int armor, int health) {
        this.armor = armor;
        this.health = health;
        this.currentHealth = health;
    }
}