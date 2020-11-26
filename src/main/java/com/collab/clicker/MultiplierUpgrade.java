package com.collab.clicker;

public class MultiplierUpgrade implements Upgrade {
    final private double price;
    final private double boost;

    public MultiplierUpgrade(double price, double boost) {
        this.price = price;
        this.boost = boost;
    }

    @Override
    public void update(Miner miner) {
        miner.income = miner.income * 1 + boost;
    }

    @Override
    public String getDescription() {
        return "Multiplier income";
    }

    @Override
    public double getPrice() {
        return price;
    }
}
