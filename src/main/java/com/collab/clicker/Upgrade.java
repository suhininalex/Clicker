package com.collab.clicker;

public interface Upgrade {
    void update(Miner miner);
    String getDescription();
    long getPrice();
}
