package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;

public interface Alive extends State<Alive> {
    @Override
    default Alive getState() { return new AliveState(); }
}
