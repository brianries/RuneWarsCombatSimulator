package rwcsim.factions.neutral.figures;

import rwcsim.basicutils.figure.BaseFigure;

public class CavalryFigure extends BaseFigure {
    public CavalryFigure(int armor, int health) {
        this.armor = armor;
        this.health = health;
        this.currentHealth = health;
    }
}