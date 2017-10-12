package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;

public class LingeringDeadState implements State<LingeringDeadState> {
    @Override
    public LingeringDeadState getType() {
        return this;
    }
}
