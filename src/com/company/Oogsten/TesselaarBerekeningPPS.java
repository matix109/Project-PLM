package com.company.Oogsten;

import com.company.Planten.Plant;

public class TesselaarBerekeningPPS extends BerekenPrijsPerStuk {
    private double nieuwePrijsPerStuk;
    private PPSBerekeningPlantCalls plantCalls;
    public TesselaarBerekeningPPS(Kwaliteit kwaliteit, Plant plant, double PrijsPerStuk) {
        super(PrijsPerStuk);
        plantCalls = new PPSBerekeningPlantCalls(plant);
        this.nieuwePrijsPerStuk = berekenPrijsPerStuk(kwaliteit, plantCalls.isDePlantBio(), isDePlantLuxe());
    }

    public boolean isDePlantLuxe(){
        return plantCalls.plantPrijsOmTeGroeien() > 0.30;
    }

    public double berekenPrijsPerStuk(Kwaliteit kwaliteit,boolean bio, boolean luxe){
        double tijdelijkePrijsPerStuk = kwaliteitPrijs(getHuidigePrijsPerStuk(), kwaliteit);
        if (bio){
            tijdelijkePrijsPerStuk = berekeningTPPS(tijdelijkePrijsPerStuk,10);
        }
        if(luxe){
            tijdelijkePrijsPerStuk = berekeningTPPS(tijdelijkePrijsPerStuk,5);
        }
        return tijdelijkePrijsPerStuk;
    }

    public double berekeningTPPS(double tijdelijkePrijsPerStuk, int procent){
        return tijdelijkePrijsPerStuk + ((tijdelijkePrijsPerStuk/100)*procent);
    }

    public double kwaliteitPrijs(double PrijsPerStuk,Kwaliteit kwaliteit){
        if (kwaliteit.getKwaliteitString().equalsIgnoreCase("slecht")) {
            return PrijsPerStuk - plantCalls.getPlantBerekeningKwaliteit0(PrijsPerStuk);
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("algemeen")) {
            return PrijsPerStuk;
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("goed")) {
            return PrijsPerStuk + plantCalls.getPlantBerekeningKwaliteit1(PrijsPerStuk);
        }
        return PrijsPerStuk;
    }

    public double getPrijsPerStuk() {
        return nieuwePrijsPerStuk;
    }
}
