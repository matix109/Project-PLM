package com.company;

public class GeefPlantVoeding {
    public static void geefVoeding(Plant plant,int Dag, int Maand, int Jaar) {
        plant.getHandelingen().newHandeling(Dag,Maand,Jaar, "Krijgt: "+ plant.getVoeding().getStringVoeding());
        plant.setBio(false);
    }
}
