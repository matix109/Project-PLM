package com.company.DeKas;

import com.company.Planten.Plant;

import java.util.ArrayList;

public class KasPlanten{
    private ArrayList<Plant> groeitIn;

    KasPlanten(){
        groeitIn = new ArrayList<>();
    }

     public ArrayList<Plant> getPlantenLijst(){
     ArrayList<Plant> dummy = new ArrayList<>();
     dummy.addAll(groeitIn);
     return dummy;
     }

    public void removePlant(Plant plant) {
        if (new GetPlant(this).inDeKas(plant)) {
            groeitIn.remove(plant);
            plant.getHandelingen().resetHandelingen();
        }
    }

    public void addPlant(Plant plant){
        groeitIn.add(plant);
    }

}
