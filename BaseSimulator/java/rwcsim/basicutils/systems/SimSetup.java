package rwcsim.basicutils.systems;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.unit.DeployableUnit;
import rwcsim.factions.daqan.Spearmen;
import rwcsim.factions.waiqar.Reanimates;

public class SimSetup {
    private static SimSetup ss = new SimSetup();

    public SimSetup() {}

    public static SimSetup getSetup() {return ss;}
    public DeployableUnit getFirst() {
        return new DeployableUnit(new Reanimates(), Formation.THREE_BY_TWO);
    }

    public DeployableUnit getSecond() {
        return new DeployableUnit(new Spearmen(), Formation.THREE_BY_TWO);
    }
}
