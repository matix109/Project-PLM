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

    public GeefPlantVoeding(Kas kas) throws NietInDeKasException {
        this.plant = new GetPlant(kas.getKasPlanten()).getTargetPlant();
    }

    public void geefVoeding(Datum datum) {//Voor testen
        plant.getHandelingen().newHandeling(datum, "Krijgt: "+ plant.getVoeding().getStringVoeding());
        plant.setBio(false);
    }

    public void geefVoeding(){
        plant.getHandelingen().newHandeling(new Datum(),"Krijgt: "+ plant.getVoeding().getStringVoeding());
        plant.setBio(false);
    }
}
