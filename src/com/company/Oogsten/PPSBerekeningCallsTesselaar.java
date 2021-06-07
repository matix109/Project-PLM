package com.company.Oogsten;

import com.company.Planten.Plant;

public class PPSBerekeningCallsTesselaar extends PPSBerekeningPlantCalls{

    PPSBerekeningCallsTesselaar(Plant plant) {
        super(plant);
    }

    public boolean isDePlantLuxe(){
        return getOnderDeLoep().getPrijsOmTeGroeien() > 0.30;
    }
    public double berekeningTPPS(double tijdelijkePrijsPerStuk, int procent){
        return tijdelijkePrijsPerStuk + ((tijdelijkePrijsPerStuk/100)*procent);
    }

    public double kwaliteitPrijs(double PrijsPerStuk,Kwaliteit kwaliteit){
        if (kwaliteit.getKwaliteitString().equalsIgnoreCase("slecht")) {
            return PrijsPerStuk - getOnderDeLoep().getBerekekningKwaliteit(0,PrijsPerStuk);
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("algemeen")) {
            return PrijsPerStuk;
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("goed")) {
            return PrijsPerStuk + getOnderDeLoep().getBerekekningKwaliteit(1,PrijsPerStuk);
        }
        return PrijsPerStuk;
    }

    public boolean isDePlantBio(){
        return getOnderDeLoep().getBio();
    }
}
