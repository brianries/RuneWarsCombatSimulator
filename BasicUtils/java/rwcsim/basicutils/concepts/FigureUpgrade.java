package rwcsim.basicutils.concepts;

import rwcsim.basicutils.figure.AbstractFigure;
import rwcsim.basicutils.concepts.Tray;
import rwcsim.basicutils.upgrades.Upgrade;

public interface FigureUpgrade extends Figure, Upgrade {
    @Override
    default boolean isUpgrade() {
        return true;
    }
    Figure getFigure();


}
