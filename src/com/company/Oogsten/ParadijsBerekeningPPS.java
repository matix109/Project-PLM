package com.company.Oogsten;

import com.company.Planten.Plant;

public class ParadijsBerekeningPPS extends BerekenPrijsPerStuk{
    private double nieuwePrijsPerStuk;
    public ParadijsBerekeningPPS(Kwaliteit kwaliteit, Plant plant, double PrijsPerStuk) {
        super(PrijsPerStuk);
        this.nieuwePrijsPerStuk = berekenPrijsPerStuk(plant,kwaliteit);
    }

    public boolean isDePlantLuxe(Plant plant){
        return plant.getPrijsOmTeGroeien() > 0.10;
    }

    public double berekenPrijsPerStuk(Plant plant,Kwaliteit kwaliteit){
       nieuwePrijsPerStuk = kwaliteitPrijs(plant,kwaliteit);
        if (plant.getBio()){
            nieuwePrijsPerStuk = berekeningTPPS(nieuwePrijsPerStuk,20);
        }
        if(isDePlantLuxe(plant)){
            nieuwePrijsPerStuk = berekeningTPPS(nieuwePrijsPerStuk,2);
        }
        return nieuwePrijsPerStuk;
    }

    public double kwaliteitPrijs(Plant plant,Kwaliteit kwaliteit){
        if (kwaliteit.getKwaliteitString().equalsIgnoreCase("matig")) {
            return getHuidigePrijsPerStuk() - plant.getBerekeningKwaliteit(getHuidigePrijsPerStuk());
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("bedorven")) {
            return 0;
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("uitstekend")) {
            return getHuidigePrijsPerStuk() + plant.getBerekeningKwaliteit(getHuidigePrijsPerStuk());
        }
        return getHuidigePrijsPerStuk();
    }

    public double getNieuwePrijsPerStuk() {
        return nieuwePrijsPerStuk;
    }
}
