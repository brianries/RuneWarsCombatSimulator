package rwcsim.basicutils.abilities;

import rwcsim.basicutils.concepts.Ability;
import rwcsim.basicutils.runes.RuneFaces;
import rwcsim.basicutils.runes.RuneManager;

public interface Lethal extends Ability<Lethal> {
    static Lethal asAbility(int i) {
        return (Lethal) new NullAbility(i);
    }

    static Lethal asAbility(RuneFaces rf) {
        Lethal ability = (Lethal) new NullAbility(rf.ordinal());
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
