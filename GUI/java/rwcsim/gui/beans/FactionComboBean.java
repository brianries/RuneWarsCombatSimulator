package rwcsim.gui.beans;

import rwcsim.basicutils.managers.FactionManager;

public class FactionComboBean {
    static String[] factionNames;

    public static String[] getFactionNames() {
        reload();
        return factionNames;
    }

    private static void reload() {
        factionNames = FactionManager.instance().getLeadingNullFactionList();
    }
}