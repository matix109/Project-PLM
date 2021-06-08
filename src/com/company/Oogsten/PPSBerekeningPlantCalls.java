package com.company.Oogsten;

import com.company.Planten.Plant;

public class PPSBerekeningPlantCalls {
    Plant onderDeLoep;

    public PPSBerekeningPlantCalls(Plant plant) {
        this.onderDeLoep = plant;
    }

    public double plantPrijsOmTeGroeien(){
        return onderDeLoep.getPrijsOmTeGroeien();
    }

    public double getPlantBerekeningKwaliteit0(double PrijsPerStuk) {
        return onderDeLoep.getBerekekningKwaliteit(0, PrijsPerStuk);
    }


    public double getPlantBerekeningKwaliteit1(double PrijsPerStuk) {
        return onderDeLoep.getBerekekningKwaliteit(1, PrijsPerStuk);
    }

    public boolean isDePlantBio() {
        return onderDeLoep.getBio();
    }
}
