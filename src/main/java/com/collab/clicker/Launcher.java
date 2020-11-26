package com.collab.clicker;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        var window = new JFrame("Clicker");
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
