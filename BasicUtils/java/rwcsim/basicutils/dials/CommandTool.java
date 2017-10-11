package rwcsim.basicutils.dials;

import java.util.List;

public class CommandTool {
    ActionDial actionDial;
    ModifierDial modifierDial;

    public CommandTool() {
        actionDial = new ActionDial();
        modifierDial = new ModifierDial();
    }

    public void setActionDialFaces(List<DialFace> faces) {
        actionDial.setFaces(faces);
    }

    public void setModifierDialFaces(List<DialFace> faces) {
        modifierDial.setFaces(faces);
    }
}
