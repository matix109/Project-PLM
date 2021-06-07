package com.company.Oogsten;

import com.company.Planten.Plant;

public class ParadijsBerekeningPPS extends BerekenPrijsPerStuk{
    private double nieuwePrijsPerStuk;
    private PPSBerekeningPlantCalls plantCalls;

    public ParadijsBerekeningPPS(Kwaliteit kwaliteit, PPSBerekeningPlantCalls plantCalls, double PrijsPerStuk) {
        super(PrijsPerStuk);
        this.plantCalls = plantCalls;
        this.nieuwePrijsPerStuk = berekenPrijsPerStuk(kwaliteit);
    }

    public boolean isDePlantLuxe(){
        return plantCalls.plantPrijsOmTeGroeien() > 0.10;
    }

    public double berekenPrijsPerStuk(Kwaliteit kwaliteit){
        double tijdelijkePrijsPerStuk = kwaliteitPrijs(getHuidigePrijsPerStuk(), kwaliteit);
        if (plantCalls.isDePlantBio()){
            tijdelijkePrijsPerStuk = berekeningTPPS(tijdelijkePrijsPerStuk,20);
        }
        if(isDePlantLuxe()){
            tijdelijkePrijsPerStuk = berekeningTPPS(tijdelijkePrijsPerStuk,2);
        }
        return tijdelijkePrijsPerStuk;
    }

    public double berekeningTPPS(double tijdelijkePrijsPerStuk, int procent){
        return tijdelijkePrijsPerStuk + ((tijdelijkePrijsPerStuk/100)*procent);
    }

    public double kwaliteitPrijs(double PrijsPerStuk,Kwaliteit kwaliteit){
        if (kwaliteit.getKwaliteitString().equalsIgnoreCase("matig")) {
            return PrijsPerStuk - plantCalls.getPlantBerekeningKwaliteit0(PrijsPerStuk);
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("bedorven")) {
            return 0;
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("uitstekend")) {
            return PrijsPerStuk + plantCalls.getPlantBerekeningKwaliteit1(PrijsPerStuk);
        }
        return PrijsPerStuk;
    }

    public double getPrijsPerStuk() {
        return nieuwePrijsPerStuk;
    }
}
