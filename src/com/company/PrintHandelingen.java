package com.company;

public class PrintHandelingen{
    public PrintHandelingen(){
    }
    private static String handelingenString(Plant plant, int i) {
        return plant.getHandelingen().getLijst().get(i).toString() +"\n";
    }

    public static String printLijst(Plant plant) {
        String handelingenString = "";
        for (int i = 0; i < plant.getHandelingen().getLijst().size(); i++) {
            handelingenString = handelingenString + handelingenString(plant,i);
        }
        return handelingenString;
    }
}
