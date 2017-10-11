package rwcsim.base.ruleset;

import rwcsim.base.Rule;
import rwcsim.base.RuleSetManager;

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
