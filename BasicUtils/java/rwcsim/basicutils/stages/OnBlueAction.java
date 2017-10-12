package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface OnBlueAction extends Stage<OnBlueAction> {
    Key<OnBlueAction> key = new Key<>();
    default Key<OnBlueAction> key() { return key; };
}
