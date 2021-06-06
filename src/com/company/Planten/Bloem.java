package com.company.Planten;
import com.company.VoedingPlanten.BloemVoeding;

public class Bloem extends Plant {

    public Bloem(String naam, double prijsPerStuk, Benodigdheden benodigheid, BloemVoeding voeding) {// Om makkelijk mee te kunnen testen
        super(naam,prijsPerStuk,benodigheid,voeding);
    }

    public double getBerekekningKwaliteit(int rating, double prijsPerStuk){
        if (rating == 0) {
            return (prijsPerStuk / 100) * 30;
        } else if (rating == 1) {
            return (prijsPerStuk / 100) * 30;
        }
        return 0;
    }

}
