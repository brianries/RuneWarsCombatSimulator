package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;
import rwcsim.basicutils.dials.DialFace;

public interface OnMarch extends Stage<OnMarch> {
    Key<OnMarch> key = new Key<>();
    default Key<OnMarch> key() { return key; };
    DialFace applyModifier();
}
