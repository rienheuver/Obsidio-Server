package com.benberi.cadesim.server.model.vessel.impl;


import com.benberi.cadesim.server.model.vessel.Vessel;

public class WarFrigate extends Vessel {

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public int getMaxCannons() {
        return 24;
    }

    @Override
    public boolean isDualCannon() {
        return true;
    }
}
