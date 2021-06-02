package com.company.Planten;

public class PrintHandelingen{
    private Plant plant;

    public PrintHandelingen(Plant plant){
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
