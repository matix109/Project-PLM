package com.company.Planten;
import com.company.VoedingPlanten.BloemVoeding;

public class Bloem extends Plant {

    public Bloem(String naam, double prijsPerStuk, Benodigdheden benodigheid, BloemVoeding voeding) {// Om makkelijk mee te kunnen testen
        super(naam, prijsPerStuk, benodigheid, voeding);
    }

    public double getBerekeningKwaliteit(double PPS) {
            return (PPS / 100) * 30;
            }
}
