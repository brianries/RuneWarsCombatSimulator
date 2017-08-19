package rwcsim.base;

/**
 * Created by dsayles on 8/17/17.
 */
public enum Formation {
    ONE(1,1),
    TWO_BY_ONE(2,1),
    TWO_BY_TWO(2,2),
    THREE_BY_TWO(3,2),
    THREE_BY_THREE(3,3),
    FOUR_BY_THREE(4,3),
    TWO_BY_THREE(2,3);

    private int columns;
    private int rows;
    private int trays;

    Formation(int c, int r) {
        columns = c;
        rows = r;
        trays = c * r;
    }

    public int getTrayCount() {
        return trays;
    }

    public int getThreat() {
        return columns;
    }

    public int getRerolls() {
        return rows-1;
    }
}
