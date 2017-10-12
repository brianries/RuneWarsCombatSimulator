package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public interface Overgrow extends Ability<Overgrow> {
    static Overgrow asAbility(int i) {
        return (Overgrow) new NullAbility(i);
    }

    static Overgrow asAbility(RuneFaces rf) {
        Overgrow ability = (Overgrow) new NullAbility(rf.ordinal());
        ability.activateOther();
        return ability;
    }

    default int getValue() {
        if (useOther()) {
            return RuneManager.currentRuneCount(RuneFaces.getFace(getOtherValue()));
        }
        return getOtherValue();
    }
}
