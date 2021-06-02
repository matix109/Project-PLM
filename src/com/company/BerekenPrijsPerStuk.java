package com.company;

public class BerekenPrijsPerStuk {// DIT IS NU OOK EEN COMPOSITIE MET OOGST
    private double huidigePrijsPerStuk;
    private double nieuwePrijsPerStuk;

    BerekenPrijsPerStuk(Kwaliteit kwaliteit,Plant plant, double PrijsPerStuk){
        this.huidigePrijsPerStuk = PrijsPerStuk;
        this.nieuwePrijsPerStuk = berekenPrijsPerStuk(kwaliteit, plant, plant.getBio(),plant.getPrijsOmTeGroeien() > 0.30);
    }

    public double getPrijsPerStuk() {
        return nieuwePrijsPerStuk;
    }

    private double berekenPrijsPerStuk(Kwaliteit kwaliteit, Plant plant, boolean Bio, boolean Luxe){
        double tijdelijkePrijsPerStuk = kwaliteitPrijs(plant, huidigePrijsPerStuk, kwaliteit);
        if (Bio){
            tijdelijkePrijsPerStuk = berekeningTPPS(tijdelijkePrijsPerStuk,10);
        }
        if(Luxe){
            tijdelijkePrijsPerStuk = berekeningTPPS(tijdelijkePrijsPerStuk,5);
        }
        return tijdelijkePrijsPerStuk;
    }

    private double berekeningTPPS(double tijdelijkePrijsPerStuk, int procent){
        return tijdelijkePrijsPerStuk + ((tijdelijkePrijsPerStuk/100)*procent);
    }

    private double kwaliteitPrijs(Plant plant, double PrijsPerStuk,Kwaliteit kwaliteit){
        if (kwaliteit.getKwaliteitString().equalsIgnoreCase("slecht")) {
            return PrijsPerStuk - plant.getBerekekningKwaliteit(kwaliteit.getKwaliteitString(),PrijsPerStuk);
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("algemeen")) {
            return PrijsPerStuk;
        } else if (kwaliteit.getKwaliteitString().equalsIgnoreCase("goed")) {
            return PrijsPerStuk + plant.getBerekekningKwaliteit(kwaliteit.getKwaliteitString(),PrijsPerStuk);
        }
        return PrijsPerStuk;
    }
}
