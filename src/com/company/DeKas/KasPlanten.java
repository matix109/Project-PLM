package com.company.DeKas;

import com.company.Planten.Plant;

import java.util.ArrayList;

public class KasPlanten{
    private ArrayList<Plant> bestaatUit;

    KasPlanten(){
        bestaatUit = new ArrayList<>();
    }

     public ArrayList<Plant> getPlantenLijst(){
     ArrayList<Plant> dummy = new ArrayList<>();
     dummy.addAll(bestaatUit);
     return dummy;
     }

    public void removePlant(Plant plant) {
        if (new GetPlant(this).inDeKas(plant)) {
            bestaatUit.remove(plant);
            plant.getHandelingen().resetHandelingen();
        }
    }

    public void addPlant(Plant plant){
        bestaatUit.add(plant);
    }

}
