package com.collab.clicker;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        var window = new JFrame("Clicker");
        var stats = new StatsPanel();
        stats.setGold(55);
        stats.setIncome(22);
        window.setSize(800, 600);
        window.add(stats.getPanel());
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
