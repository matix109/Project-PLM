package com.company.Oogsten;


import com.company.Planten.Plant;

public abstract class Oogst {
    private Plant plant;
    private int Hoeveelheid;
    private double prijsPerStuk;

    public Oogst(Plant plant, int Hoeveelheid, double PrijsPerStuk) {
        this.plant = plant;
        this.Hoeveelheid = Hoeveelheid;
        this.prijsPerStuk =PrijsPerStuk;
    }

public abstract int extraKosten();

    public int getHoeveelheid() {
        return Hoeveelheid;
    }

    public abstract double getWinst();

    public Plant getPlant(){
        return plant;
    }

    public abstract double getNettoWinst();

    public void setHoeveelheid(int hoeveelheid) {
        this.Hoeveelheid = hoeveelheid;
    }

    public double getPrijsPerStuk() {
        return prijsPerStuk;
    }

    public void setPrijsPerStuk(double prijsPerStuk) {
        this.prijsPerStuk = prijsPerStuk;
    }
}
