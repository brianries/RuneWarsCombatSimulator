package rwcsim.basicutils.morale;

/**
 * Created by dsayles on 8/18/17.
 */
public enum MoraleType {
    FEAR,
    CONFUSION,
    DOUBT;

    static MoraleType[] values = MoraleType.values();
    public static MoraleType getType(int i) { return values[i]; }
}
