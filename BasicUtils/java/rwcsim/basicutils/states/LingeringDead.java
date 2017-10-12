package rwcsim.basicutils.states;

import rwcsim.basicutils.concepts.State;

public interface LingeringDead extends State<LingeringDead> {
    @Override
    default LingeringDead getState() { return new LingeringDeadState(); }
}
