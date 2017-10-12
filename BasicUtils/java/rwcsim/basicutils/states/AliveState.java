package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;

public class AliveState implements State<AliveState> {

    @Override
    public AliveState getType() {
        return this;
    }
}
