package rwcsim.gui.controller;

import rwcsim.basicutils.systems.MassAttackLoopTest;
import rwcsim.basicutils.systems.SimSetup;
import rwcsim.gui.view.Simulator;
import rwcsim.gui.view.UnitFormationPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimulatorController {
    private Simulator simulator;
    private JPanel rootPanel;
    private JTextArea textArea1;
    private UnitFormationPanel secondSelector;
    private UnitFormationPanel firstSelector;
    private JButton runCurrentSimulationButton;
    private JTextField simulationCountField;

    private UnitFormationPanelController firstController;
    private UnitFormationPanelController secondController;

    private SimSetup ss;
    private MassAttackLoopTest malt;

    public SimulatorController() {
        simulator = new Simulator();
        initializeComponents();
        initializeListeners();
    }

    public void initializeComponents() {
        firstController = new UnitFormationPanelController(simulator.getFirstSelector());
        secondController = new UnitFormationPanelController(simulator.getSecondSelector());
        runCurrentSimulationButton = simulator.getRunCurrentSimulationButton();
        simulationCountField = simulator.getSimulationCountField();
        malt = new MassAttackLoopTest();
    }


    public void initializeListeners() {
        runCurrentSimulationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runSimulation();
            }
        });

        simulationCountField.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                malt.setSimCount(Integer.parseInt(simulationCountField.getSelectedText()));
            }
        }));
    }

    public void runSimulation() {
        ss = new SimSetup(firstController.getUnit(), firstController.getFormation(), secondController.getUnit(), secondController.getFormation());
        malt.setSimCount(Integer.parseInt(simulationCountField.getText()));
        malt.setupLoops(ss);
    }






    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public UnitFormationPanel getSecondSelector() {
        return secondSelector;
    }

    public void setSecondSelector(UnitFormationPanel secondSelector) {
        this.secondSelector = secondSelector;
    }

    public UnitFormationPanel getFirstSelector() {
        return firstSelector;
    }

    public void setFirstSelector(UnitFormationPanel firstSelector) {
        this.firstSelector = firstSelector;
    }





}