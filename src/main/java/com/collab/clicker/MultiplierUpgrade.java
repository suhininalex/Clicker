package com.collab.clicker;

public class MultiplierUpgrade implements Upgrade {
    @Override
    public Miner update(Miner miner) {
        return new Miner(miner.gold - getPrice(), miner.income * 1.01, miner.incomeFrequency);
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
