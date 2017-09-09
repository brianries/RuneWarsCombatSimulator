package rwcsim.base.dials;

import java.util.ArrayList;
import java.util.List;

public abstract class Dial {
    List<DialFace> faces = new ArrayList<>();
    public void setFaces(List<DialFace> faces) {
        this.faces = faces;
    }
}
