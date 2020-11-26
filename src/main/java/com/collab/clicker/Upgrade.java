package com.collab.clicker;

public interface Upgrade {
    Miner update(Miner miner);
    String getDescription();
}
