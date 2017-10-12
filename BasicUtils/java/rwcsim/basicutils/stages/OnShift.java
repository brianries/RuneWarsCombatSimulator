package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;
import rwcsim.basicutils.dials.DialFace;

public interface OnShift extends Stage<OnShift> {
    Key<OnShift> key = new Key<>();
    default Key<OnShift> key() { return key; };
    DialFace applyModifier();
}
