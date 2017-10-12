package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;

public class Unavailable implements State<Unavailable> {
    @Override
    public Unavailable getType() {
        return this;
    }
}
