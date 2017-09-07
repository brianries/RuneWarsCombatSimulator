package rwcsim.base.ruleset;

import rwcsim.base.Rule;
import rwcsim.base.RuleSetManager;

public class Reroll implements Rule<Reroll> {
    public static final String name = "REROLL";


    public String name() {return name;}

    public boolean isEnabled() {
        return RuleSetManager.isEnabled(name);
    }

    public Reroll getRule() {
        return new Reroll();
    }
}
