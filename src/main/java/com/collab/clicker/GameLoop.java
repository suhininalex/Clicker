package com.collab.clicker;

import java.util.Timer;
import java.util.TimerTask;

public class GameLoop {
    private final StatsPanel statsPanel;
    private Miner miner;

    private final Timer timer = new Timer();

    public GameLoop(StatsPanel statsPanel, Miner miner) {
        this.statsPanel = statsPanel;
        this.miner = miner;
    }


    private void update(){
        miner.gold += miner.gold + miner.income * miner.incomeFrequency;
    }

    public void start(){
        TimerTask task = new TimerTask() {
            public void run() {
                update();
                statsPanel.setGold(miner.gold);
                statsPanel.setIncome(miner.income);
            }
        };
        timer.scheduleAtFixedRate(task, 0, 200);
    }

    public void upgrade(Upgrade upgrade){
        if (miner.gold >= upgrade.getPrice()) {
            miner.gold -= miner.gold;
            upgrade.update(miner);
        }
    }

    public void stop(){
        timer.cancel();
    }
}
