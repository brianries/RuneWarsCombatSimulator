package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public interface Regenerate extends Ability<Regenerate> {

    static Regenerate asAbility(int i) {
        return (Regenerate) new NullAbility(i);
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
