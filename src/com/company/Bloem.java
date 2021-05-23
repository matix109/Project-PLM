package com.company;

class Bloem extends Plant {
    private Voeding voeding;

    Bloem(String naam, double prijsPerStuk,Benodigdheden benodigheid, Voeding voeding) {
        super(naam,prijsPerStuk,benodigheid);
        this.voeding = voeding;
    }

    public double getBerekekningKwaliteit(String Kwaliteit, double prijsPerStuk){
        if (Kwaliteit.equalsIgnoreCase("slecht")) {
            return (prijsPerStuk / 100) * 30;
        } else if (Kwaliteit.equalsIgnoreCase("goed")) {
            return (prijsPerStuk / 100) * 30;
        }
        return 0;
    }

    public Voeding getVoeding() {
        return voeding;
    }

}
