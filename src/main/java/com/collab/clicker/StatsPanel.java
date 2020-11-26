package com.collab.clicker;

import javax.swing.*;
import java.awt.*;

public class StatsPanel {
    private final JLabel goldLabel = new JLabel();
    private final JLabel incomeLabel = new JLabel();
    private final JPanel panel = createPanel();

    private JPanel createPanel(){
        var panel = new JPanel();
        panel.setLayout(new GridLayout(12, 1));
        panel.add(goldLabel);
        panel.add(incomeLabel);
        return panel;
    }

    public void setGold(int gold){
        SwingUtilities.invokeLater(() -> goldLabel.setText("Gold: " + gold));
    }

    public void setIncome(int income){
        incomeLabel.setText("Income: " + income);
    }

    public JPanel getPanel() {
        return panel;
    }
}
