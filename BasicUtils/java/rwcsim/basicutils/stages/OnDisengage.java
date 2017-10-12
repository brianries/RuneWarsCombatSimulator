package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface OnDisengage extends Stage<OnDisengage> {
    Key<OnDisengage> key = new Key<>();
    default Key<OnDisengage> key() { return key; };
}
