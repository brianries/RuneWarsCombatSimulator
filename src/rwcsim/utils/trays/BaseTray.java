package rwcsim.utils.trays;

import rwcsim.factions.base.BaseFigure;
import rwcsim.factions.base.Figure;
import rwcsim.factions.base.Tray;

public abstract class BaseTray implements Tray {
    protected int figureCount;
    protected Figure[] trayLayout;

    BaseTray(int c) {
        figureCount = c;
        trayLayout = new Figure[c];
        for (int i = 0; i < figureCount; i++) {
            trayLayout[i] = new BaseFigure();
        }
    }
}
