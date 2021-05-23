package com.company;

class Groente extends Plant {
    private Voeding voeding;

    Groente(String naam, double prijsPerStuk, Benodigdheden benodigheid,Voeding voeding) {
        super(naam,prijsPerStuk,benodigheid);
        this.voeding =voeding;
    }

    public double getBerekekningKwaliteit(String Kwaliteit, double prijsPerStuk){
        if (Kwaliteit.equalsIgnoreCase("slecht")) {
            return (prijsPerStuk / 100) * 20;
        } else if (Kwaliteit.equalsIgnoreCase("goed")) {
            return (prijsPerStuk / 100) * 20;
        }
        return 0;
    }

    public Voeding getVoeding() {
        return voeding;
    }

}
