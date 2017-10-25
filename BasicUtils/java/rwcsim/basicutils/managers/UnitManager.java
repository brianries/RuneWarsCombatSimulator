package rwcsim.basicutils.managers;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.concepts.Manager;
import rwcsim.basicutils.unit.DeployableUnit;

import java.util.ArrayList;
import java.util.List;

public abstract class UnitManager implements Manager {
    List<DeployableUnit> unitList = new ArrayList<>();
    public String[] availableUnitNames;

    public String[] getAvailableUnitNames() {
        return availableUnitNames;
    }
    public List<DeployableUnit> getUnitList() {
        return unitList;
    }

    
    public abstract List<Formation> availableFormations(int unit);
    public abstract int getIdFromName(String name);
    public List<Formation> availableFormations(String unit) {
        return availableFormations(getIdFromName(unit));
    }
}
