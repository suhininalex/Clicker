package com.collab.clicker;

public class MultiplierUpgrade implements Upgrade {
    @Override
    public void update(Miner miner) {
        miner.income = miner.income * 1.01;
    }

    @Override
    public String getDescription() {
        return "Multiplier income";
    }

    @Override
    public long getPrice() {
        return 100;
    }
}
