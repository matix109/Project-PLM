package com.company;

public class PrintBenodigdheden {
    public static void printString(Plant plant) {
        System.out.println("Plantensoort " + plant.getNaam() + plant.getBenodigdheden().toString() + plant.getVoeding().getStringVoeding());
    }
    }

