package com.company.Planten;

import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.Exceptions.NietInDeKasException;

public class PrintBenodigdheden {
    private Plant plant;

    public PrintBenodigdheden(Kas kas) throws NietInDeKasException {
      this.plant = new GetPlant(kas.getKasPlanten()).getTargetPlant();
    }
    public void printString() {
        System.out.println("Plant " + plant.getNaam() + plant.getBenodigdheden().toString() + plant.getVoeding().getStringVoeding());
    }
    }

