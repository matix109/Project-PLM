package com.company.Oogsten;

import com.company.Planten.Plant;

public class PPSBerekeningCallsParadijs extends PPSBerekeningPlantCalls{

    PPSBerekeningCallsParadijs(Plant plant) {
        super(plant);
    }

    public boolean isDePlantLuxe(){
        return getOnderDeLoep().getPrijsOmTeGroeien() > 0.10;
    }
    public double berekeningTPPS(double tijdelijkePrijsPerStuk, int procent){
        return tijdelijkePrijsPerStuk + ((tijdelijkePrijsPerStuk/100)*procent);
    }

    public double kwaliteitPrijs(double PrijsPerStuk,Kwaliteit kwaliteit){
        if (kwaliteit.getKwaliteitString().equalsIgnoreCase("matig")) {
            return PrijsPerStuk - getOnderDeLoep().getBerekekningKwaliteit(0,PrijsPerStuk);
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("bedorven")) {
            return 0;
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("uitstekend")) {
            return PrijsPerStuk + getOnderDeLoep().getBerekekningKwaliteit(1,PrijsPerStuk);
        }
        return PrijsPerStuk;
    }
    public boolean isDePlantBio(){
        return getOnderDeLoep().getBio();
    }
}
