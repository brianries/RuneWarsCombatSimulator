package rwcsim.basicutils.concepts;


import rwcsim.basicutils.unit.Unit;

public interface State<T> {
    default T getState() { return (T) new NullState(); }
    default T getState(Unit unit) { return (T) new NullState(unit); };
    default T getState(Unit attacker, Unit defender) { return (T) new NullState(attacker,defender); };

    interface Null extends State<Null> {
        default Null getState() { return null; }
        default Null getState(Unit unit) { return null; }
        default Null getState(Unit attacker, Unit defender) { return null; }
    }

    class NullState implements State.Null {
        public NullState(){}
        public NullState(Unit unit){}
        public NullState(Unit attacker, Unit defender){}
    }
}
