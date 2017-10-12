package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;
import rwcsim.basicutils.dials.DialFace;

public interface OnMarch extends Stage<OnMarch> {
    DialFace applyModifier();
}
