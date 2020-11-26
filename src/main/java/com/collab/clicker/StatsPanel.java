package com.collab.clicker;

import javax.swing.*;
import java.awt.*;

public class StatsPanel {
    private final JLabel goldLabel = new JLabel();
    private final JLabel incomeLabel = new JLabel();
    private final JPanel panel = createPanel();

    //TODO remove this
    public GameLoop gameLoop;


    private JPanel createPanel(){
        var panel = new JPanel();
        panel.setLayout(new GridLayout(12, 1));
        panel.add(goldLabel);
        panel.add(incomeLabel);
        panel.add(createUpgradeButton(new FixedUpgrade()));
        panel.add(createUpgradeButton(new MultiplierUpgrade(100, 0.01)));
        return panel;
    }

    private JButton createUpgradeButton(Upgrade upgrade){
        JButton button = new JButton(upgrade.getDescription());
        button.addActionListener(event -> SwingUtilities.invokeLater(() -> gameLoop.upgrade(upgrade)));
        return button;
    }

    public void setGold(double gold){
        SwingUtilities.invokeLater(() -> goldLabel.setText("Gold: " + Math.round(gold)));
    }

    public void setIncome(double income){
        incomeLabel.setText("Income: " + Math.round(income));
    }

    public JPanel getPanel() {
        return panel;
    }
}
