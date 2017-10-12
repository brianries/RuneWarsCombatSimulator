package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;

public class Alive implements State<Alive> {

    @Override
    public Alive getType() {
        return this;
    }
}
