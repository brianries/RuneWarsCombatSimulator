package rwcsim.basicutils.modifiers;

import rwcsim.basicutils.concepts.Stage;

import java.util.List;

public interface AddStages<T,S> {
    List<Stage> getStage();
}
