package com.collab.clicker;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        var window = new JFrame("Clicker");
        var stats = new StatsPanel();
        var miner = new Miner();
        var updater = new GameLoop(stats, miner);
        stats.gameLoop = updater;
        window.setSize(800, 600);
        window.add(stats.getPanel());
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);

        updater.start();
    }
}
