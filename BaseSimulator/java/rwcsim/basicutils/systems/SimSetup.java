package rwcsim.basicutils.systems;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.unit.DeployableUnit;
import rwcsim.factions.daqan.KariWraithstalker;
import rwcsim.factions.daqan.OathswornCavalry;
import rwcsim.factions.daqan.RuneGolems;
import rwcsim.factions.daqan.Spearmen;
import rwcsim.factions.waiqar.ArdusIxErebus;
import rwcsim.factions.waiqar.CarrionLancer;
import rwcsim.factions.waiqar.DeathKnights;
import rwcsim.factions.waiqar.Reanimates;

public class SimSetup {
    private static SimSetup ss = new SimSetup();

    public SimSetup() {}

    public static SimSetup getSetup() {return ss;}
    public DeployableUnit getFirst() {
        return new DeployableUnit(new KariWraithstalker(), Formation.ONE);
    }

    public DeployableUnit getSecond() {
        return new DeployableUnit(new ArdusIxErebus(), Formation.ONE);
    }
}
