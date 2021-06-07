package com.company.Oogsten;

import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.Planten.Plant;

public class OogstDePlantTesselaar extends OogstDePlant{

    public OogstDePlantTesselaar(Kas currentKas) {
        super(currentKas);
    }

    public boolean kanGeoogstWorden(Plant plant, int Hoeveelheid) {
        return new GetPlant(getKas().getKasPlanten()).inDeKas(plant) && Volgroeid(plant) && Hoeveelheid >= 1;
    }
    public void naDeOogst(Oogst oogst, Plant plant) {
        getKas().getKasWinst().addWinst(oogst);
        getKas().getKasPlanten().removePlant(plant);
    }

    public boolean Volgroeid(Plant plant) {
        return (plant.getBenodigdheden().getGroeiTijdWeken() + 1 == plant.getPlantLevensduur().getHuidigeGroeiTijdWeken()) || (plant.getBenodigdheden().getGroeiTijdWeken() - 1 == plant.getPlantLevensduur().getHuidigeGroeiTijdWeken())
                || (plant.getBenodigdheden().getGroeiTijdWeken() == plant.getPlantLevensduur().getHuidigeGroeiTijdWeken());
    }
}
