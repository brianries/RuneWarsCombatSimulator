package rwcsim.utils.trays;

import rwcsim.factions.base.BaseFigure;
import rwcsim.factions.base.Figure;
import rwcsim.factions.base.FigureUpgrade;

public abstract class BaseTray implements Tray {
    protected int figureCount;
    protected Figure[] trayLayout;
    protected int[] accuracyCount;


    BaseTray(int c) {
        figureCount = c;
        trayLayout = new Figure[c];
        accuracyCount = new int[c];
        for (int i = 0; i < figureCount; i++) {
            trayLayout[i] = new BaseFigure();
        }

        clearAccuracy();
    }

    public void setFigureUpgrade(int trayLocation, FigureUpgrade figureUpgrade) {
        trayLayout[trayLocation] = figureUpgrade;
    }

    public void setAccuracy(int trayLocation) {
        accuracyCount[trayLocation]++;
    }

    public void clearAccuracy() {
        for (int i = 0; i<accuracyCount.length; i++) {
            accuracyCount[i] = 0;
        }
    }

    public boolean containsUpgradeFigure() {
        for (int i = 0; i< trayLayout.length; i++) {
            if (trayLayout[i].isUpgrade()) {
                return true;
            }
        }
        return false;
    }
}
