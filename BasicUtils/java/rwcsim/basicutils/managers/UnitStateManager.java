package rwcsim.basicutils.managers;

import rwcsim.basicutils.states.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnitStateManager {
    public static UnavailableState UNAVAILABLE_STATE = new UnavailableState();
    public static List<State> UNAVAILABLE_STATE_LIST = new ArrayList<>();
    static { UNAVAILABLE_STATE_LIST.add(UNAVAILABLE_STATE); }

    List<State> activeCircumstances = new ArrayList<>();


    public UnitStateManager() {
        activeCircumstances.add(new AliveState());
    }

    public boolean checkCircumstance(State circumstance) {
        return activeCircumstances.contains(circumstance);
    }

    public State getFirstState(State state) {
        if (activeCircumstances.contains(state)) {
            return activeCircumstances.get(activeCircumstances.indexOf(state));
        }
        return UNAVAILABLE_STATE;
    }
    public List<State> getAllStates(State circumstance) {
        if (checkCircumstance(circumstance)) {
            return activeCircumstances.stream().filter(c -> c.getType() == circumstance.getType()).collect(Collectors.toList());
        }
        return UNAVAILABLE_STATE_LIST;
    }
}
