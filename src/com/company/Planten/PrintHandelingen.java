package com.company.Planten;

import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.DeKas.KasPlanten;
import com.company.Exceptions.NietInDeKasException;

public class PrintHandelingen{
    private Plant plant;

    public PrintHandelingen(Kas kas) throws NietInDeKasException {
        this.plant = new GetPlant(kas.getKasPlanten()).getTargetPlant();
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
