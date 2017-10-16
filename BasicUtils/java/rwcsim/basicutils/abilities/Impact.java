package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public interface Impact extends Ability<Impact> {
    static Impact asAbility(int i) {
        return (Impact) new NullAbility(i);
    }

    static Impact asAbility(RuneFaces rf) {
        Impact ability = (Impact) new NullAbility(rf.ordinal());
        ability.activateOther();
        return ability;
    }

    default int getValue() {
        if (useOther()) {
            return RuneManager.getInstance().currentRuneCount(RuneFaces.getFace(getOtherValue()));
        }
        return getOtherValue();
    }
}
