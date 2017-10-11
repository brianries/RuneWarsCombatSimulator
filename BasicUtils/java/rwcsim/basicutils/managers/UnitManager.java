package rwcsim.basicutils.managers;

import rwcsim.basicutils.unit.DeployableUnit;

import java.util.ArrayList;
import java.util.List;

public class UnitManager {
    List<DeployableUnit> unitList = new ArrayList<>();

    public List<DeployableUnit> getUnitList() {
        return unitList;
    }
}
