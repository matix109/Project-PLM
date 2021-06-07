package com.company.Oogsten;

import com.company.Planten.Plant;

public class TesselaarBerekeningPPS extends BerekenPrijsPerStuk {
    private double nieuwePrijsPerStuk;
    private PPSBerekeningCallsTesselaar plantCalls;
    public TesselaarBerekeningPPS(Kwaliteit kwaliteit, Plant plant, double PrijsPerStuk) {
        super(PrijsPerStuk);
        plantCalls = new PPSBerekeningCallsTesselaar(plant);
        this.nieuwePrijsPerStuk = berekenPrijsPerStuk(kwaliteit, plant);
    }
/*
    public boolean isDePlantLuxe(Plant plant){
        return plant.getPrijsOmTeGroeien() > 0.30;
    }*/

    public double berekenPrijsPerStuk(Kwaliteit kwaliteit, Plant plant){
        double tijdelijkePrijsPerStuk = plantCalls.kwaliteitPrijs(getHuidigePrijsPerStuk(), kwaliteit);
        if (plantCalls.isDePlantBio()){
            tijdelijkePrijsPerStuk = plantCalls.berekeningTPPS(tijdelijkePrijsPerStuk,10);
        }
        if(plantCalls.isDePlantLuxe()){
            tijdelijkePrijsPerStuk = plantCalls.berekeningTPPS(tijdelijkePrijsPerStuk,5);
        }
        return tijdelijkePrijsPerStuk;
    }

/*    public double berekeningTPPS(double tijdelijkePrijsPerStuk, int procent){
        return tijdelijkePrijsPerStuk + ((tijdelijkePrijsPerStuk/100)*procent);
    }

    public double kwaliteitPrijs(Plant plant, double PrijsPerStuk,Kwaliteit kwaliteit){
        if (kwaliteit.getKwaliteitString().equalsIgnoreCase("slecht")) {
            return PrijsPerStuk - plant.getBerekekningKwaliteit(0,PrijsPerStuk);
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("algemeen")) {
            return PrijsPerStuk;
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("goed")) {
            return PrijsPerStuk + plant.getBerekekningKwaliteit(1,PrijsPerStuk);
        }
        return PrijsPerStuk;
    }*/

    public double getPrijsPerStuk() {
        return nieuwePrijsPerStuk;
    }
}
