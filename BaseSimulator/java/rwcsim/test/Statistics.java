package rwcsim.test;

import rwcsim.basicutils.managers.UnitStateManager;

/**
 * Created by dsayles on 8/17/17.
 */
public class Statistics {
    UnitStateManager first;
    UnitStateManager second;
    int rounds;
    public Statistics(int r, UnitStateManager d, UnitStateManager w) {
        first = d;
        second = w;
        rounds = r;
    }

    public void showStats() {
        System.out.println("R: "+ rounds + " " + first.unit.getName() + ":"+first.isAlive+ " "+ second.unit.getName() +":"+second.isAlive);
        System.out.println("\nLiving Data");


//        daqan.showStats();
//
//        System.out.println("\nWaiqar Stats");
//        waiqar.showStats();
    }
}
