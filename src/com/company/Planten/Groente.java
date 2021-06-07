package com.company.Planten;
import com.company.VoedingPlanten.GroenteVoeding;

public class Groente extends Plant {
    public Groente(String naam, double prijsPerStuk, Benodigdheden benodigheid, GroenteVoeding voeding) {// Om makkelijk mee te kunnen testen
        super(naam,prijsPerStuk,benodigheid, voeding);
    }

    public double getBerekekningKwaliteit(int rating, double prijsPerStuk){
        if (rating == 0) {
            return (prijsPerStuk / 100) * 20;
        } else if (rating == 1) {
            return (prijsPerStuk / 100) * 20;
        }
        return 0;
    }

}
