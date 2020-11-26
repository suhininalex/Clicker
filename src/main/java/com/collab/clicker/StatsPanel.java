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
        var upgrade = new FixedUpgrade();
        JButton button = new JButton(upgrade.getDescription());
        button.addActionListener(event -> SwingUtilities.invokeLater(() -> gameLoop.upgrade(upgrade)));
        panel.add(button);
        return panel;
    }

    public void setGold(long gold){
        SwingUtilities.invokeLater(() -> goldLabel.setText("Gold: " + gold));
    }

    public void setIncome(long income){
        incomeLabel.setText("Income: " + income);
    }

    public JPanel getPanel() {
        return panel;
    }
}
