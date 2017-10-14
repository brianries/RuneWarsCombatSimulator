package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;
import rwcsim.basicutils.concepts.Unit;

public interface Flanked  extends State<Flanked> {
    @Override
    default Flanked getState(Unit unit) { return new FlankedState(unit); }
}
