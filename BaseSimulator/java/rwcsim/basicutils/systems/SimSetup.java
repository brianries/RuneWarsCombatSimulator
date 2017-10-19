package rwcsim.basicutils.systems;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.unit.DeployableUnit;
import rwcsim.factions.daqan.*;
import rwcsim.factions.uthuk.RavosTheEverhungry;
import rwcsim.factions.uthuk.SpinedThreshers;
import rwcsim.factions.waiqar.ArdusIxErebus;
import rwcsim.factions.waiqar.CarrionLancer;
import rwcsim.factions.waiqar.DeathKnights;
import rwcsim.factions.waiqar.Reanimates;

public class SimSetup {
    private static SimSetup ss = new SimSetup();

    public SimSetup() {}

    public static SimSetup getSetup() {return ss;}
    public DeployableUnit getFirst() {
        return new DeployableUnit(new LordHawthorne(), Formation.ONE);
    }

    public DeployableUnit getSecond() {
        return new DeployableUnit(new ArdusIxErebus(), Formation.ONE);
    }
}
