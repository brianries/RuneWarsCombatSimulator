package rwcsim.gui;

import rwcsim.basicutils.Configuration;
import rwcsim.gui.controller.SimulatorController;
import rwcsim.gui.controller.UnitFormationPanelController;
import rwcsim.gui.view.Simulator;
import rwcsim.gui.view.UnitFormationPanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Configuration.getInstance();
        SimulatorController simulator = new SimulatorController();
//        unitFormationPanel = new UnitFormationPanelController();
    }
}
