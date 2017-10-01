package rwcsim.utils.trays;

import rwcsim.factions.base.FigureUpgrade;

public interface Tray {
    int TRAY_LOCATION_FRONT_LEFT = 0;
    int TRAY_LOCATION_FRONT_RIGHT = 1;
    int TRAY_LOCATION_REAR_LEFT = 2;
    int TRAY_LOCATION_REAR_RIGHT = 3;
    int TRAY_LOCATION_SOLO = 0;
    int TRAY_LOCATION_LEFT = 0;
    int TRAY_LOCATION_RIGHT = 1;

    void setFigureUpgrade(int trayLocation, FigureUpgrade figureUpgrade);
    boolean containsUpgradeFigure();
    void setAccuracy(int trayLocation);
    void clearAccuracy();
}
