package com.company.Planten;
import com.company.VoedingPlanten.GroenteVoeding;

public class Groente extends Plant {
    public Groente(String naam, double prijsPerStuk, Benodigdheden benodigheid, GroenteVoeding voeding) {// Om makkelijk mee te kunnen testen
        super(naam,prijsPerStuk,benodigheid, voeding);
    }

    public double getBerekeningKwaliteit(double PPS){
            return (PPS/ 100) * 20;
        }

}
