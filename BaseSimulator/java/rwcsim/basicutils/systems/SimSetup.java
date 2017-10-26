package rwcsim.basicutils.systems;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.concepts.Unit;
import rwcsim.basicutils.unit.DeployableUnit;
import rwcsim.factions.daqan.*;
import rwcsim.factions.uthuk.FleshRippers;
import rwcsim.factions.uthuk.RavosTheEverhungry;
import rwcsim.factions.uthuk.SpinedThreshers;
import rwcsim.factions.waiqar.ArdusIxErebus;
import rwcsim.factions.waiqar.CarrionLancer;
import rwcsim.factions.waiqar.DeathKnights;
import rwcsim.factions.waiqar.Reanimates;

public class SimSetup {
    private static SimSetup ss = new SimSetup();

    private Unit firstUnit;
    private Formation firstFormation;

    private Unit secondUnit;
    private Formation secondFormation;

    public SimSetup() {
        firstUnit = new OathswornCavalry();
        firstFormation = Formation.TWO_BY_TWO;

        secondUnit = new DeathKnights();
        secondFormation = Formation.TWO_BY_TWO;
    }

    public SimSetup(Unit fu, Formation ff, Unit su, Formation sf) {
        firstUnit = fu;
        firstFormation = ff;
        secondUnit = su;
        secondFormation = sf;
    }


    public static SimSetup getSetup() {return ss;}
    public DeployableUnit getFirst() {
        return new DeployableUnit(firstUnit, firstFormation);
    }

    public DeployableUnit getSecond() {
        return new DeployableUnit(secondUnit, secondFormation);
    }





}
