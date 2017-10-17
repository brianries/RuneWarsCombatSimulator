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
    public int applyDamage(int count) {
        int remainingHits = count;

        for (int i=0; i<getHealth();i++) {
            if (remainingHits>=this.getArmor()) {
                remainingHits -= this.getArmor();
                currentHealth--;
            } else {
                remainingHits = 0;
            }
        }
        return remainingHits;
    }

    @Override
    public void setInitialHealth() {
        currentHealth = getHealth();
    }
}
