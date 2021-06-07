package com.company.Oogsten;

import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.Planten.Plant;

public abstract class OogstDePlant implements MultiOogster {
    private Kas kas;

    OogstDePlant(Kas currentKas){
        this.kas = currentKas;
    }

    public boolean oogstPlantSoort(Oogst oogst){
        if (kanGeoogstWorden(oogst.getPlant(), oogst.getOogstDetails().getHoeveelheid())) {
            kas.getKasOogsten().addOogst(oogst);
            naDeOogst(oogst, oogst.getPlant());
            return true;
        }
        return false;
    }

    public abstract  boolean kanGeoogstWorden(Plant plant, int Hoeveelheid);

    public abstract void naDeOogst(Oogst oogst, Plant plant);

    public abstract boolean Volgroeid(Plant plant);

    public Kas getKas() {
        return kas;
    }
}
