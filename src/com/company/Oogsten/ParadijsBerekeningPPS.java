package com.company.Oogsten;

import com.company.Planten.Plant;

public class ParadijsBerekeningPPS extends BerekenPrijsPerStuk{
    private double nieuwePrijsPerStuk;

    public ParadijsBerekeningPPS(Kwaliteit kwaliteit, Plant plant, double PrijsPerStuk) {
        super(PrijsPerStuk);
        this.nieuwePrijsPerStuk = berekenPrijsPerStuk(kwaliteit, plant, plant.getBio(),isDePlantLuxe(plant));
    }

    public boolean isDePlantLuxe(Plant plant){
        return plant.getPrijsOmTeGroeien() > 0.10;
    }

    public double berekenPrijsPerStuk(Kwaliteit kwaliteit, Plant plant, boolean Bio, boolean Luxe){
        double tijdelijkePrijsPerStuk = kwaliteitPrijs(plant, getHuidigePrijsPerStuk(), kwaliteit);
        if (Bio){
            tijdelijkePrijsPerStuk = berekeningTPPS(tijdelijkePrijsPerStuk,20);
        }
        if(Luxe){
            tijdelijkePrijsPerStuk = berekeningTPPS(tijdelijkePrijsPerStuk,2);
        }
        return tijdelijkePrijsPerStuk;
    }

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
    }

    public double getPrijsPerStuk() {
        return nieuwePrijsPerStuk;
    }
}
