package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface OnEmptyTray extends Stage<OnEmptyTray> {
    Key<OnEmptyTray> key = new Key<>();
    default Key<OnEmptyTray> key() { return key; };
}
