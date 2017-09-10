package rwcsim.factions;

import rwcsim.factions.base.DeployableUnit;

import java.util.ArrayList;
import java.util.List;

public class UnitManager {
    List<DeployableUnit> unitList = new ArrayList<>();

    public List<DeployableUnit> getUnitList() {
        return unitList;
    }
}
