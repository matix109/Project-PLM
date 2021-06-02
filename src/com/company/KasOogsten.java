package com.company;

import java.util.ArrayList;

public class KasOogsten {
    private ArrayList<Oogst> Bewaart;
    private Kas kas;

    KasOogsten(Kas currentKas) {
        Bewaart = new ArrayList<>();
        this.kas = currentKas;
    }

    public ArrayList<Oogst> getOogstenLijst(){
        ArrayList<Oogst> dummy = new ArrayList<>();
        dummy.addAll(Bewaart);
        return dummy;
    }

    public boolean oogstPlantSoort(Plant plant, int Hoeveelheid, double prijsPerStuk, String Kwaliteit) {
        if (kanGeoogstWorden(plant, Hoeveelheid)) {
            Oogst oogst = new Oogst(plant, Hoeveelheid, prijsPerStuk, Kwaliteit);
            geoogstePlant(oogst, plant);
            return true;
        }
        return false;
    }

    private boolean kanGeoogstWorden(Plant plant, int Hoeveelheid) {
        return new GetPlant(kas.getKasPlanten()).inDeKas(plant) && Volgroeid(plant) && Hoeveelheid >= 1;
    }

    private void geoogstePlant(Oogst oogst, Plant plant) {
        Bewaart.add(oogst);
        kas.getKasWinst().addWinst(oogst);
        kas.getKasPlanten().removePlant(plant);
    }

    private boolean Volgroeid(Plant plant) {
        return (plant.getBenodigdheden().getGroeiTijdWeken() + 1 == plant.getPlantLevensduur().getHuidigeGroeiTijdWeken()) || (plant.getBenodigdheden().getGroeiTijdWeken() - 1 == plant.getPlantLevensduur().getHuidigeGroeiTijdWeken())
                || (plant.getBenodigdheden().getGroeiTijdWeken() == plant.getPlantLevensduur().getHuidigeGroeiTijdWeken());
    }
}
