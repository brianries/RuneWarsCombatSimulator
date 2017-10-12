package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface AvailableUpgrades extends Stage<AvailableUpgrades> {
    Key<AvailableUpgrades> key = new Key<>();
    default Key<AvailableUpgrades> key() { return key; }
}
