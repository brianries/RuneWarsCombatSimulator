package rwcsim.gui.controller;

import org.apache.log4j.Logger;
import rwcsim.basicutils.Factions;
import rwcsim.basicutils.Formation;
import rwcsim.basicutils.managers.FactionManager;
import rwcsim.basicutils.managers.UnitManager;
import rwcsim.gui.beans.FactionComboBean;
import rwcsim.gui.view.UnitFormationPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class UnitFormationPanelController {
    private final Logger log = Logger.getLogger(UnitFormationPanelController.class);
    private UnitFormationPanel    unitFormationPanelFrame;
    private JPanel    unitFormationPanel;
    private JComboBox formationComboBox;
    private JComboBox unitComboBox;
    private JComboBox factionComboBox;

    public UnitFormationPanelController() {
        initComponents();
        initListeners();
    }


    public void initComponents() {
        unitFormationPanelFrame = new UnitFormationPanel();

        factionComboBox = unitFormationPanelFrame.getFactionComboBox();
        unitComboBox = unitFormationPanelFrame.getUnitComboBox();
        formationComboBox = unitFormationPanelFrame.getFormationComboBox();

        loadFactions();
    }

    private void loadFactions() {
        factionComboBox.removeAllItems();
        unitComboBox.removeAllItems();
        formationComboBox.removeAllItems();
        String[] factions = FactionComboBean.getFactionNames();
        for (String f: factions) {
            factionComboBox.addItem(f);
        }
        factionComboBox.setSelectedIndex(0);
    }

    private void loadUnits(UnitManager unitManager) {
        log.info("Loading Units");
        unitComboBox.removeAllItems();

        String[] names = unitManager.getAvailableUnitNames();
        for (String n: names) {
            unitComboBox.addItem(n);
        }
        unitComboBox.setSelectedIndex(0);
        loadFormations(unitManager, (String)unitComboBox.getSelectedItem());
    }

    private void loadFormations(UnitManager unitManager, String unit) {
        log.info("Loading Formations for "+ unit);

        formationComboBox.removeAllItems();
        List<Formation> formations = unitManager.availableFormations(unit);
        for (Formation formation:formations) {
            formationComboBox.addItem(formation.name());
        }
        formationComboBox.setSelectedIndex(0);
    }

    public void initListeners() {
        factionComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                log.info("FactionComboBox "+e.getActionCommand()+ ": "+factionComboBox.getSelectedItem()+" "+ factionComboBox.getSelectedIndex());
                UnitManager um = FactionManager.instance().getUnitManager(Factions.valueOfFromString((String)factionComboBox.getSelectedItem()));
                loadUnits(um);
            }
        });

        unitComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                log.info("UnitComboBox "+e.getActionCommand() + ": "+unitComboBox.getSelectedIndex());
                UnitManager um = FactionManager.instance().getUnitManager(Factions.valueOfFromString((String)factionComboBox.getSelectedItem()));
                loadFormations(um, (String)unitComboBox.getSelectedItem());
            }
        });

        formationComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                log.info("FormationComboBox "+e.getActionCommand()+" "+formationComboBox.getSelectedItem()+" "+formationComboBox.getSelectedIndex());

            }
        });
    }
}
