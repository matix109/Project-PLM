package com.company.VoedingPlanten;
import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.Exceptions.NietInDeKasException;
import com.company.Planten.Datum;
import com.company.Planten.Plant;

public class GeefPlantVoeding {
    private Plant plant;

    public GeefPlantVoeding(Plant plant){//voor testen
        this.plant =plant;
    }

    public void geefVoeding(Datum datum) {//Voor testen
        plant.getHandelingen().newHandeling(datum, "Krijgt: "+ plant.getVoeding().getStringVoeding());
        plant.setBio(false);
    }
}
