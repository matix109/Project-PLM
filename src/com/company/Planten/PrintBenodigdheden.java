package com.company.Planten;

import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.Exceptions.NietInDeKasException;

public class PrintBenodigdheden {
    private Plant plant;

    public PrintBenodigdheden(Plant plant) throws NietInDeKasException {
      this.plant = plant;
    }
    public void printString() {
        System.out.println("Plant " + plant.getNaam() + plant.getBenodigdheden().toString() + plant.getVoeding().getStringVoeding());
    }
    }

