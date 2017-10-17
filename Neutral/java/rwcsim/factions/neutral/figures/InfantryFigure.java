package rwcsim.factions.neutral.figures;

import rwcsim.basicutils.figure.BaseFigure;

public class InfantryFigure extends BaseFigure {
    public InfantryFigure(int armor, int health) {
        this.armor = armor;
        this.health = health;
        this.currentHealth = health;
    }
}