package rwcsim.utils.dice;

import rwcsim.base.ActionType;
import rwcsim.base.RuleSetManager;
import rwcsim.base.ruleset.AutomaticallyRerollBlanks;
import rwcsim.test.CoreUnit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by dsayles on 5/14/15.
 */
public class Roller {
    static Random rand = new Random(System.nanoTime());
    static RedDie redDie = new RedDie();
    static WhiteDie whiteDie = new WhiteDie();
    static BlueDie blueDie = new BlueDie();

    public static DieFace rollRedDie() {
        return roll(redDie);
    }
    public static DieFace rollBlueDie() {
        return roll(blueDie);
    }
    public static DieFace rollWhiteDie() {
        return roll(whiteDie);
    }

    public static DieFace roll(Die die) {
        return die.result(rand.nextInt(die.faces.length));
    }


    public static List<ActionType> rollPool(int[] pool, CoreUnit unit) {
        List<ActionType> actionPool = new ArrayList<>();
        actionPool.addAll(rollDice(redDie,pool[DiePool.RED_DIE], unit));
        actionPool.addAll(rollDice(blueDie,pool[DiePool.BLUE_DIE], unit));
        actionPool.addAll(rollDice(whiteDie,pool[DiePool.WHITE_DIE], unit));
        return actionPool;
    }

    public static List<ActionType> rollDice(Die die, int count, CoreUnit unit) {
        List<ActionType> pool = new ArrayList<>();
        List<DieFace> resultPool = new ArrayList<>();
        for (int i=0; i<count; i++) {
            resultPool.add(roll(die));
        }

        // add control of AutoBlankRerolls
        if (RuleSetManager.isEnabled(AutomaticallyRerollBlanks.name)) {
            int z=0;
            List<DieFace> workingPool = new ArrayList<>();
            workingPool.addAll(resultPool);

            for (DieFace df : workingPool) {
                if (df.equals(DieFace.BLANK)) {
                    resultPool.remove(df);
                    z++;
                    unit.incrementStat(CoreUnit.REROLLS);
                }
            }
            for (int y=0; y<z; y++) {
                resultPool.add(roll(die));
            }
        }


        for (DieFace df : resultPool) {
            pool.addAll(df.getActions());
        }
        return pool;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            System.out.println("RedD: "+rollRedDie());
        }
        System.out.println("");
        for (int i = 0; i < 1; i++) {
            System.out.println("WhtD: "+rollWhiteDie());
        }
        System.out.println("");
        for (int i = 0; i < 1; i++) {
            System.out.println("BluD: "+rollBlueDie());
        }
    }
}
