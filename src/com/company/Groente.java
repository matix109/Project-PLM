package com.company;

class Groente extends Plant {

    Groente(String naam, double prijsPerStuk, Benodigdheden benodigheid,GroenteVoeding voeding) {
        super(naam,prijsPerStuk,benodigheid,voeding);
    }

    public double getBerekekningKwaliteit(String Kwaliteit, double prijsPerStuk){
        if (Kwaliteit.equalsIgnoreCase("slecht")) {
            return (prijsPerStuk / 100) * 20;
        } else if (Kwaliteit.equalsIgnoreCase("goed")) {
            return (prijsPerStuk / 100) * 20;
        }
        return 0;
    }

}
