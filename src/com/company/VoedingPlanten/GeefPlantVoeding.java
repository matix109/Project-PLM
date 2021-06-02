package com.company.VoedingPlanten;
import com.company.Planten.Plant;

public class GeefPlantVoeding {
    private Plant plant;
    public GeefPlantVoeding(Plant plant){
        this.plant =plant;
    }
    public void geefVoeding(int Dag, int Maand, int Jaar) {
        plant.getHandelingen().newHandeling(Dag,Maand,Jaar, "Krijgt: "+ plant.getVoeding().getStringVoeding());
        plant.setBio(false);
    }
}
