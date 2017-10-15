package rwcsim.test;

import rwcsim.basicutils.Formation;
import rwcsim.basicutils.managers.RuleSetManager;
import rwcsim.basicutils.ruleset.Reroll;
import rwcsim.basicutils.ruleset.AutomaticallyRerollBlanks;
import rwcsim.basicutils.dice.DiePool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsayles on 8/17/17.
 */
public class CSim {
    public static int SIM_COUNT = 1000000;
    public static int DEMARKATION = 100000;
    public static int ARMOR = 0;
    public static int HITS = 1;
    public static int UNITS_PER_TRAY = 2;
    private static List<Statistics> stats = new ArrayList<>();

    public static void initEngine() {
        RuleSetManager.addRule(new Reroll(), false);
        RuleSetManager.addRule(new AutomaticallyRerollBlanks(), true);
    }

    public static void baseCombat() {
        // spearmen vs reanimates
//        int[] daqan = {1,1,4};// 2x1, 2x2, 3x2, 3x3
//        int[] waiqar = {1,1,4};// 2x1, 2x2, 3x2, 3x3, 4x3

        // rune golems vs carrion lancer
//        int[] daqan = {4,2,1}; // 1, 2x1, 2x2, 3x2
//        int[] waiqar = {3,3,1}; // 1, 2x1, 2x2, 3x2

        // oathsworn vs deathknights
        int[] daqan = {2,1,2}; //  2x1, 2x2, 2x3, 3x3
        int[] waiqar = {3,1,2}; // 2x1, 2x2, 2x3

        Formation dform = Formation.FOUR_BY_ONE;
        Formation wform = Formation.TWO_BY_TWO;

        DiePool dpool = new DiePool(2,1, 0);

        DiePool wpool = new DiePool(2,1, 0);

        for (int i = 0; i<SIM_COUNT; i++) {
            if (i!=0&&i%DEMARKATION==0) {
                System.out.println("Processing: "+i);
            }
            CoreUnit daqanSpearmen = new CoreUnit(dform, daqan, dpool);
            CoreUnit waiqarReanimates = new CoreUnit(wform, waiqar, wpool);

            int rounds = 0;
//        System.out.println("D: "+ daqanSpearmen.getHealth() +" W: "+ waiqarReanimates.getHealth());
//            while ((daqanSpearmen.isAlive() && waiqarReanimates.isAlive()) && rounds <= 7) {
//            System.out.println("Round: "+rounds);
//                if (rounds%2==0) {

//            System.out.println("Daqan pool:");
//                    List<ActionType> dres = daqanSpearmen.attack();
////            System.out.println(dres);
//                    waiqarReanimates.applyResults(daqanSpearmen, dres);
//
////            System.out.println("Waiqar pool:");
//                    List<ActionType> wres = waiqarReanimates.attack();
////            System.out.println(wres);
//                    daqanSpearmen.applyResults(waiqarReanimates, wres);
//                } else {
//
////            System.out.println("Waiqar pool:");
//                    List<ActionType> wres = waiqarReanimates.attack();
////            System.out.println(wres);
//                    daqanSpearmen.applyResults(waiqarReanimates, wres);
//
////            System.out.println("Daqan pool:");
////                    List<ActionType> dres = daqanSpearmen.attack();
////            System.out.println(dres);
//                    waiqarReanimates.applyResults(daqanSpearmen, dres);
                }


//            System.out.println("D: "+ daqanSpearmen.getHealth() +" W: "+ waiqarReanimates.getHealth());
//                rounds++;
//            }

//            System.out.println("D: " + daqanSpearmen.getHealth() + " W: " + waiqarReanimates.getHealth());
//            stats.add(new Statistics(rounds, daqanSpearmen, waiqarReanimates));
//        }
    }

    public static void main(String[] args) {
        initEngine();
        baseCombat();
        Analyzer.analyze(stats);
    }
}
