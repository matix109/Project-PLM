package com.company.Oogsten;

import com.company.Planten.Plant;

public abstract class PPSBerekeningPlantCalls {
    Plant onderDeLoep;

    PPSBerekeningPlantCalls(Plant plant){
     this.onderDeLoep = plant;
    }

    public abstract double berekeningTPPS(double tijdelijkePrijsPerStuk, int procent);

    public abstract double kwaliteitPrijs(double PrijsPerStuk, Kwaliteit kwaliteit);

    public abstract boolean isDePlantLuxe();

    public abstract boolean isDePlantBio();

    public Plant getOnderDeLoep() {
        return onderDeLoep;
    }
}
