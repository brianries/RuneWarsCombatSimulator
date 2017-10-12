package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;

public interface Unavailable extends State<Unavailable> {
    @Override
    default Unavailable getState() { return new UnavailableState(); }
}
