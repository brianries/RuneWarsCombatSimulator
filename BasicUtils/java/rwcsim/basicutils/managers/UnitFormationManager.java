package rwcsim.basicutils.managers;

import rwcsim.basicutils.AttackType;
import rwcsim.basicutils.Formation;
import rwcsim.basicutils.concepts.Manager;
import rwcsim.basicutils.unit.DeployableUnit;
import rwcsim.basicutils.concepts.FigureUpgrade;
import rwcsim.basicutils.concepts.Tray;
import rwcsim.basicutils.concepts.Unit;
import rwcsim.basicutils.dice.DiePool;

import java.util.ArrayList;
import java.util.List;

public class UnitFormationManager implements Manager {
    /**
     * 1: [0]  1x2:  [0]    1x3:  [0]
     *               [1]          [1]
     *                            [3]
     *
     * 2x1: [0] [1]   2x2: [0] [1]   2x3: [0] [1]
     *                     [2] [3]        [2] [3]
     *                                    [4] [5]
     *
     * 3x1: [0] [1] [2]  3x2: [0] [1] [2]  3x3: [0] [1] [2]
     *                        [3] [4] [5]       [3] [4] [5]
     *                                          [6] [7] [8]
     *
     * 4x1: [0] [1] [2] [3]   4x2: [0] [1] [2] [3]   4x3: [0] [1] [2]  [3]
     *                             [4] [5] [6] [7]        [4] [5] [6]  [7]
     *                                                    [8] [9] [10] [11]
     *
     * Additional trays are added as needed following the same patterns
     *
     *
     */

    DeployableUnit deployableUnit;
    Unit unit;
    Formation formation;
    List<Tray> trayLayout;
    int totalTrayCount;
    int currentTrayCount;

    public UnitFormationManager(DeployableUnit deployableUnit) {
        this.deployableUnit = deployableUnit;
        this.unit = deployableUnit.getUnit();
        this.formation = deployableUnit.getFormation();
        totalTrayCount = this.formation.getTrayCount();
        trayLayout = new ArrayList<>(totalTrayCount);
        currentTrayCount = totalTrayCount;
        initializeTrays();
    }

    public void initializeTrays() {
        for (int i = 0; i<totalTrayCount; i++) {
            trayLayout.add(i, unit.getTray());
        }
    }

    public int getThreat() {
        return formation.getThreat();
    }

    public int getCurrentRanks() {
        int currentRanks = currentTrayCount / formation.getThreat();
        return currentRanks;
    }

    public boolean hasPartialRank() {
        return currentTrayCount % formation.getThreat() > 0;
    }

    public DiePool getDiePool(AttackType type) {
        return this.deployableUnit.getDiePool(type);
    }

    public boolean canReroll() {
        return this.deployableUnit.canReroll();
    }

    public int getRerollDieCount() {
        return this.deployableUnit.getRerollDieCount();
    }

    public void setFigureUpgrade(int tray, int trayLocation, FigureUpgrade figureUpgrade) {
        // TODO:  Get Trady support in tray
//        if (figureUpgrade.replaceTray()) {
//            trayLayout.add(tray, figureUpgrade.getTray());
//        }
        trayLayout.get(tray).setFigureUpgrade(trayLocation, figureUpgrade);
    }


    public void applyHits(int count) {
        ((ArrayList)trayLayout).trimToSize();
        int curTray = trayLayout.size()-1;
        int remainingHits = count;
        Tray tmp;

        while (remainingHits>0) {
            tmp = trayLayout.get(curTray);
            remainingHits = tmp.applyDamage(remainingHits);
            if (tmp.isEmpty()) {
                trayLayout.remove(curTray);
                currentTrayCount--;
                curTray--;
            }
         }
    }


}
