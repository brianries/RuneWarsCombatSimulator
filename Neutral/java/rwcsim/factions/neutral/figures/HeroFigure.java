package rwcsim.factions.neutral.figures;

import rwcsim.basicutils.figure.BaseFigure;

public class HeroFigure extends BaseFigure {
    public HeroFigure(int armor, int health) {
        this.armor = armor;
        this.health = health;
        this.currentHealth = health;
    }
}