package rwcsim.basicutils.concepts;


public interface Ability<T> {
    boolean useOther();
    void activateOther();
    int getSecondaryValue();
    int getOtherValue();
    int getValue();
    void setValue(int v);
    default T getAbility(int v) { return (T)new NullAbility(v); }

//    interface Null extends Ability<T> {}
    class NullAbility implements Ability {
        boolean secondary = false;
        int value;
        int value2;


        public NullAbility(int v) {
            this.value = v;
        }

        public NullAbility(int v, int v2) {
            this.value = v;
            this.value2 = v2;
        }



        @Override
        public boolean useOther() { return secondary; }

        @Override
        public void activateOther() { secondary = true; }

        @Override
        public int getSecondaryValue() { return value2; }

        public int getOtherValue() { return value; }

        @Override
        public int getValue() {
            return value;
        }

        public void setValue(int v) {
            this.value = v;
        }

        public Ability getAbility(int v) {
            return null;
        }
    }
}
