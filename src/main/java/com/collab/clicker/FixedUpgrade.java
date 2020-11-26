package com.collab.clicker;

public class FixedUpgrade implements Upgrade {
    @Override
    public void update(Miner miner) {
        miner.income += 1;
    }

    @Override
    public String getDescription() {
        return "Upgrade income";
    }

    @Override
    public long getPrice() {
        return 10;
    }
}
