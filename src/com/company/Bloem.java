package com.company;

class Bloem extends Plant {

    Bloem(String naam, double prijsPerStuk,Benodigdheden benodigheid, BloemVoeding voeding) {
        super(naam,prijsPerStuk,benodigheid,voeding);
    }

    public double getBerekekningKwaliteit(String Kwaliteit, double prijsPerStuk){
        if (Kwaliteit.equalsIgnoreCase("slecht")) {
            return (prijsPerStuk / 100) * 30;
        } else if (Kwaliteit.equalsIgnoreCase("goed")) {
            return (prijsPerStuk / 100) * 30;
        }
        return 0;
    }

}
