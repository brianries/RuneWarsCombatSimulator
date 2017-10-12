package rwcsim.basicutils.stages;

import rwcsim.basicutils.concepts.Stage;

public interface RerollForExtraRanks extends Stage<RerollForExtraRanks> {
    Key<RerollForExtraRanks> key = new Key<>();
    default Key<RerollForExtraRanks> key() { return key; };
}