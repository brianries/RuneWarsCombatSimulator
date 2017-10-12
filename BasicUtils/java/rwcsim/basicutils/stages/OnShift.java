package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;
import rwcsim.basicutils.dials.DialFace;

public interface OnShift extends Stage<OnShift> {
    DialFace applyModifier();
}
