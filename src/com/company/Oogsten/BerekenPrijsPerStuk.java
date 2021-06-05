package com.company.Oogsten;

import com.company.Planten.Plant;

public abstract class BerekenPrijsPerStuk {// DIT IS NU OOK EEN COMPOSITIE MET OOGST
    private double huidigePrijsPerStuk;

    public BerekenPrijsPerStuk(double PrijsPerStuk){
        this.huidigePrijsPerStuk = PrijsPerStuk;
    }

    public double getHuidigePrijsPerStuk() {
        return huidigePrijsPerStuk;
    }

    public abstract double getPrijsPerStuk();

    public abstract boolean isDePlantLuxe(Plant plant);

    public abstract double berekenPrijsPerStuk(Kwaliteit kwaliteit, Plant plant, boolean Bio, boolean Luxe);

    public abstract double berekeningTPPS(double tijdelijkePrijsPerStuk, int procent);

    public abstract double kwaliteitPrijs(Plant plant, double PrijsPerStuk,Kwaliteit kwaliteit);

}
