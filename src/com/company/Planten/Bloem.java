package com.company.Planten;

import com.company.VoedingPlanten.BloemVoeding;

public class Bloem extends Plant {

    public Bloem(String naam, double prijsPerStuk, Benodigdheden benodigheid, BloemVoeding voeding) {
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
