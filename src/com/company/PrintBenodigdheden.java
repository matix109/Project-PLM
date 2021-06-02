package com.company;

public class PrintBenodigdheden {
    private Plant plant;

    PrintBenodigdheden(Plant plant){
      this.plant = plant;
    }
    public void printString() {
        System.out.println("Plantensoort " + plant.getNaam() + plant.getBenodigdheden().toString() + plant.getVoeding().getStringVoeding());
    }
    }

