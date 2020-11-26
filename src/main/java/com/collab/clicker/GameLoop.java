package com.collab.clicker;

import java.util.Timer;
import java.util.TimerTask;

public class GameLoop {
    private StatsPanel statsPanel;
    private MinerCharacter miner;

    private final Timer timer = new Timer();

    public GameLoop(StatsPanel statsPanel, MinerCharacter miner) {
        this.statsPanel = statsPanel;
        this.miner = miner;
    }

    private void update(){
        miner.gold += miner.income * miner.incomeFrequency;
        statsPanel.setGold(miner.gold);
        statsPanel.setIncome(miner.income);
    }

    public void start(){
        TimerTask task = new TimerTask() {
            public void run() {
                update();
            }
        };
        timer.scheduleAtFixedRate(task, 0, 200);
    }

    public void stop(){
        timer.cancel();
    }
}
