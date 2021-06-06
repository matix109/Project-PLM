package com.company.Oogsten;

import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.Oogsten.MultiOogster;
import com.company.Oogsten.Oogst;
import com.company.Planten.Plant;

import java.util.ArrayList;

public class KasOogsten implements MultiOogster {
    private ArrayList<Oogst> Bewaart;
    private Kas kas;

    public KasOogsten(Kas currentKas) {
        Bewaart = new ArrayList<>();
        this.kas = currentKas;
    }

    public ArrayList<Oogst> getOogstenLijst(){
        ArrayList<Oogst> dummy = new ArrayList<>();
        dummy.addAll(Bewaart);
        return dummy;
    }

    public boolean oogstPlantSoort(Oogst oogst){
        if (kanGeoogstWorden(oogst.getPlant(), oogst.getHoeveelheid())) {
            geoogstePlant(oogst, oogst.getPlant());
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
