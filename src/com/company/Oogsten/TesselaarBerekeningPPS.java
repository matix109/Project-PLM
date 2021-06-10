package com.company.Oogsten;

import com.company.Planten.Plant;

public class TesselaarBerekeningPPS extends BerekenPrijsPerStuk {
    private double nieuwePrijsPerStuk;
    public TesselaarBerekeningPPS(Kwaliteit kwaliteit, Plant plant, double PrijsPerStuk) {
        super(PrijsPerStuk);
        this.nieuwePrijsPerStuk = berekenPrijsPerStuk(plant,kwaliteit);
    }

    public boolean isDePlantLuxe(Plant plant){
        return plant.getPrijsOmTeGroeien() > 0.30;
    }

    public double berekenPrijsPerStuk(Plant plant,Kwaliteit kwaliteit){
        nieuwePrijsPerStuk = kwaliteitPrijs(plant,kwaliteit);
        if (plant.getBio()){
            nieuwePrijsPerStuk = berekeningTPPS(nieuwePrijsPerStuk,10);
        }
        if(isDePlantLuxe(plant)){
            nieuwePrijsPerStuk = berekeningTPPS(nieuwePrijsPerStuk,5);
        }
        return nieuwePrijsPerStuk;
    }

    public double berekeningTPPS(double tijdelijkePrijsPerStuk, int procent){
        return tijdelijkePrijsPerStuk + ((tijdelijkePrijsPerStuk/100)*procent);
    }

    public double kwaliteitPrijs(Plant plant,Kwaliteit kwaliteit){
        if (kwaliteit.getKwaliteitString().equalsIgnoreCase("slecht")) {
            return getHuidigePrijsPerStuk() - plant.getBerekeningKwaliteit(getHuidigePrijsPerStuk());
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("algemeen")) {
            return getHuidigePrijsPerStuk();
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("goed")) {
            return getHuidigePrijsPerStuk() + plant.getBerekeningKwaliteit(getHuidigePrijsPerStuk());
        }
        return getHuidigePrijsPerStuk();
    }

    public double getNieuwePrijsPerStuk() {
        return nieuwePrijsPerStuk;
    }
}
