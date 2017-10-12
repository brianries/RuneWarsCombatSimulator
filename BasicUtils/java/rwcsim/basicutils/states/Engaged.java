package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;
import rwcsim.basicutils.unit.Unit;

public interface Engaged extends State<Engaged> {
    @Override
    default Engaged getState(Unit unit) { return new EngagedState(unit); }
}
