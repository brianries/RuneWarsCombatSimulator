package rwcsim.utils.dice;

/**
 * Created by dsayles on 6/10/15.
 */
public class DiePool {
    public static final int RED_DIE = 0;
    public static final int BLUE_DIE = 1;
    public static final int WHITE_DIE = 2;

    public static final int DIE_TYPE_COUNT = 3;
//    private int[] antiSquadronDice = new int[DIE_TYPE_COUNT];
    private int[] attackDice = new int[DIE_TYPE_COUNT];

//    public int[] getSquadronPool() {
//        int[] ret = new int[DIE_TYPE_COUNT];
//        System.arraycopy(antiSquadronDice, 0, ret, 0, antiSquadronDice.length);
//        return ret;
//    }

    public int[] getAttackPool() {
        int[] ret = new int[DIE_TYPE_COUNT];
        System.arraycopy(attackDice, 0, ret, 0, attackDice.length);
        return ret;
    }

//    public void setSquadronPool(int[] pool) {
//        if (pool.length == DIE_TYPE_COUNT) {
//            System.arraycopy(pool, 0, antiSquadronDice, 0, pool.length);
//        }
//    }
//
//    public void setSquadronPool(int red, int blue, int white) {
//        antiSquadronDice[RED_DIE] = red;
//        antiSquadronDice[BLUE_DIE] = blue;
//        antiSquadronDice[WHITE_DIE] = white;
//    }

    public void setAttackPool(int[] pool) {
        if (pool.length == DIE_TYPE_COUNT) {
            System.arraycopy(pool, 0, attackDice, 0, pool.length);
        }
    }

    public void setAttackPool(int red, int blue, int white) {
        attackDice[RED_DIE] = red;
        attackDice[BLUE_DIE] = blue;
        attackDice[WHITE_DIE] = white;
    }

//    public void incrementSquadron(int dieType) {
//        antiSquadronDice[dieType]++;
//    }
//
//    public void decrementSquadron(int dieType) {
//        antiSquadronDice[dieType]--;
//    }
//
//    public void incrementShip(int dieType) {
//        antiShipDice[dieType]++;
//    }
//
//    public void decrementShip(int dieType) {
//        antiShipDice[dieType]--;
//    }
}
