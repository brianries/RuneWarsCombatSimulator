package rwcsim.utils.dice;

/**
 * Created by dsayles on 6/10/15.
 */
public class DiePool {
    public static final int RED_DIE = 0;
    public static final int BLUE_DIE = 1;
    public static final int WHITE_DIE = 2;

    public static final int DIE_TYPE_COUNT = 3;
    private int[] attackDice = new int[DIE_TYPE_COUNT];

    public int[] getAttackPool() {
        int[] ret = new int[DIE_TYPE_COUNT];
        System.arraycopy(attackDice, 0, ret, 0, attackDice.length);
        return ret;
    }

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

    public int[] getTemporaryPool(int red, int blue, int white) {
        int[] tPool = new int[DIE_TYPE_COUNT];
        System.arraycopy(attackDice, 0, tPool, 0, attackDice.length);
        tPool[RED_DIE] += red;
        tPool[BLUE_DIE] += blue;
        tPool[WHITE_DIE] += white;
        return tPool;
    }
}
