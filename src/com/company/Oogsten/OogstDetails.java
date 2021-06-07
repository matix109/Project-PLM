package com.company.Oogsten;

public class OogstDetails {
    private int Hoeveelheid;
    private double prijsPerStuk;

    public OogstDetails(int Hoeveelheid, double PPS){
    this.Hoeveelheid =Hoeveelheid;
    this.prijsPerStuk = PPS;
    }

    public int getHoeveelheid() {
        return Hoeveelheid;
    }

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
