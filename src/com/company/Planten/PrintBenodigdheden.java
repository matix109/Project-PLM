package com.company.Planten;

public class PrintBenodigdheden {
    private Plant plant;

    public PrintBenodigdheden(Plant plant){
      this.plant = plant;
    }
    public void printString() {
        System.out.println("Plantensoort " + plant.getNaam() + plant.getBenodigdheden().toString() + plant.getVoeding().getStringVoeding());
    }
    }

