package com.company.Oogsten;

import com.company.Planten.Plant;

public class ParadijsBerekeningPPS extends BerekenPrijsPerStuk{
    private double nieuwePrijsPerStuk;
    private PPSBerekeningCallsParadijs plantCalls;

    public ParadijsBerekeningPPS(Kwaliteit kwaliteit, Plant plant, double PrijsPerStuk) {
        super(PrijsPerStuk);
        plantCalls = new PPSBerekeningCallsParadijs(plant);
        this.nieuwePrijsPerStuk = berekenPrijsPerStuk(kwaliteit, plant);
    }

/*    public boolean isDePlantLuxe(Plant plant){
        return plant.getPrijsOmTeGroeien() > 0.10;
    }*/

    public double berekenPrijsPerStuk(Kwaliteit kwaliteit, Plant plant){
        double tijdelijkePrijsPerStuk = plantCalls.kwaliteitPrijs(getHuidigePrijsPerStuk(), kwaliteit);
        if (plantCalls.isDePlantBio()){
            tijdelijkePrijsPerStuk = plantCalls.berekeningTPPS(tijdelijkePrijsPerStuk,20);
        }
        if(plantCalls.isDePlantLuxe()){
            tijdelijkePrijsPerStuk = plantCalls.berekeningTPPS(tijdelijkePrijsPerStuk,2);
        }
        return tijdelijkePrijsPerStuk;
    }
/*
    public double berekeningTPPS(double tijdelijkePrijsPerStuk, int procent){
        return tijdelijkePrijsPerStuk + ((tijdelijkePrijsPerStuk/100)*procent);
    }

    public double kwaliteitPrijs(Plant plant, double PrijsPerStuk,Kwaliteit kwaliteit){
        if (kwaliteit.getKwaliteitString().equalsIgnoreCase("matig")) {
            return PrijsPerStuk - plant.getBerekekningKwaliteit(0,PrijsPerStuk);
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("bedorven")) {
            return 0;
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("uitstekend")) {
            return PrijsPerStuk + plant.getBerekekningKwaliteit(1,PrijsPerStuk);
        }
        return PrijsPerStuk;
    }*/

    public double getPrijsPerStuk() {
        return nieuwePrijsPerStuk;
    }
}
