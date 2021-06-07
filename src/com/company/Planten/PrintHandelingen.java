package com.company.Planten;

import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.DeKas.KasPlanten;
import com.company.Exceptions.NietInDeKasException;

public class PrintHandelingen{
    private Plant plant;

    public PrintHandelingen(Plant plant) throws NietInDeKasException {
        this.plant = plant;
    }

    private String handelingenString(int i) {
        return plant.getHandelingen().getHandelingenLijst().get(i).toString() +"\n";
    }

    public void printLijst() {
        String handelingenString = "";
        for (int i = 0; i < plant.getHandelingen().getHandelingenLijst().size(); i++) {
            handelingenString = handelingenString + handelingenString(i);
        }
        System.out.println(handelingenString);
    }
}
