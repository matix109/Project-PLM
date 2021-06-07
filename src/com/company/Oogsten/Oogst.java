package com.company.Oogsten;


import com.company.Planten.Plant;

public abstract class Oogst {
    private Plant plant;
    private OogstDetails details;

    public Oogst(Plant plant,OogstDetails details) {
        this.plant = plant;
        this.details = details;
    }

public abstract int extraKosten();

    public abstract double getWinst();

    public Plant getPlant(){
        return plant;
    }

    public abstract double getNettoWinst();

    public OogstDetails getOogstDetails() {
        return details;
    }
}
