package rwcsim.utils.interaction;

public class DefaultInteractionManager extends BaseInteractionManager {
    private static DefaultInteractionManager dim = new DefaultInteractionManager();

    public static InteractionManager instance() {
        return dim;
    }
}
