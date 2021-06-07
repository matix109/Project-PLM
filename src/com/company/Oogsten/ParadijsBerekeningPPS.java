package com.company.Oogsten;

import com.company.Planten.Plant;

public class ParadijsBerekeningPPS extends BerekenPrijsPerStuk{
    private double nieuwePrijsPerStuk;
    private PPSBerekeningPlantCalls plantCalls;

    public ParadijsBerekeningPPS(Kwaliteit kwaliteit, Plant plant, double PrijsPerStuk) {
        super(PrijsPerStuk);
        plantCalls = new PPSBerekeningPlantCalls(plant);
        this.nieuwePrijsPerStuk = berekenPrijsPerStuk(kwaliteit,plantCalls.isDePlantBio(), isDePlantLuxe());
    }

    public boolean isDePlantLuxe(){
        return plantCalls.plantPrijsOmTeGroeien() > 0.10;
    }

    public double berekenPrijsPerStuk(Kwaliteit kwaliteit,boolean bio, boolean luxe){
        double tijdelijkePrijsPerStuk = kwaliteitPrijs(getHuidigePrijsPerStuk(), kwaliteit);
        if (bio){
            tijdelijkePrijsPerStuk = berekeningTPPS(tijdelijkePrijsPerStuk,20);
        }
        if(luxe){
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
