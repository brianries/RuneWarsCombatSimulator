package rwcsim.utils.dice;

import rwcsim.base.ActionType;

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

    public static List<ActionType> rollPool(int[] pool) {
        List<ActionType> actionPool = new ArrayList<>();
        List<DieFace> resultPool = new ArrayList<>();
        for (int i=0;i<pool[DiePool.RED_DIE];i++) {
            resultPool.add(roll(redDie));
        }
        for (int i=0;i<pool[DiePool.BLUE_DIE];i++) {
            resultPool.add(roll(blueDie));
        }
        for (int i=0;i<pool[DiePool.WHITE_DIE];i++) {
            resultPool.add(roll(whiteDie));
        }

        for (DieFace df : resultPool) {
            actionPool.addAll(df.getActions());
        }

        return actionPool;
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
