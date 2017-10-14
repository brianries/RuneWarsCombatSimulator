package rwcsim.basicutils.concepts;

import rwcsim.basicutils.figure.AbstractFigure;
import rwcsim.basicutils.concepts.Tray;
import rwcsim.basicutils.upgrades.Upgrade;

public interface FigureUpgrade extends Upgrade {
    default boolean isFigureUpgrade() {
        return true;
    }
    Figure getFigure();

    default int getArmor() {
        return 1;
    }
    default int getHealth() {
        return 1;
    }

}
