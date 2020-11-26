package com.collab.clicker;

public class FixedUpgrade implements Upgrade {
    @Override
    public Miner update(Miner miner) {
        return new Miner(miner.gold - getPrice(), miner.income + 1, miner.incomeFrequency);
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
