package rwcsim.basicutils.figure;


import rwcsim.basicutils.concepts.Figure;
import rwcsim.basicutils.concepts.Tray;

public abstract class AbstractFigure implements Figure {
    int currentHealth = 0;

    @Override
    public boolean isAlive() {
        return currentHealth > 0;
    }

    @Override
    public boolean applyDamage(int count) {
        currentHealth -= count;
        return isAlive();
    }

    @Override
    public void setInitialHealth() {
        currentHealth = getHealth();
    }
}
