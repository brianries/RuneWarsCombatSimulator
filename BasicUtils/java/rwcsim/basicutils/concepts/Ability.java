package rwcsim.basicutils.concepts;



public interface Ability<T> {
    boolean useOther();
    void activateOther();
    int getSecondaryValue();
    int getOtherValue();
    int getValue();
    void setValue(int v);
//    T getAbility(int v);

//    interface Null extends Ability<T> {}
}
