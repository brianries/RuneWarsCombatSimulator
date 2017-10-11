package rwcsim.basicutils.ruleset;

import rwcsim.basicutils.Rule;
import rwcsim.basicutils.managers.RuleSetManager;

public class AutomaticallyRerollBlanks implements Rule<AutomaticallyRerollBlanks> {
    public static final String name = "AUTOMATICALLY_REROLL_BLANKS";


    public String name() {return name;}

    public boolean isEnabled() {
        return RuleSetManager.isEnabled(name);
    }

    public AutomaticallyRerollBlanks getRule() {
        return new AutomaticallyRerollBlanks();
    }
}
