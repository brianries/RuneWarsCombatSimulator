package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface OnReceivingBane extends Stage<OnReceivingBane> {
    Key<OnReceivingBane> key = new Key<>();
    default Key<OnReceivingBane> key() { return key; };
}
