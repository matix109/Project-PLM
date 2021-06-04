package com.company.Planten;
import com.company.Factory.GroenteFactory;
import com.company.Factory.PlantenFactory;
import com.company.VoedingPlanten.GroenteVoeding;


public class Groente extends Plant {

    public Groente(String naam, double prijsPerStuk, Benodigdheden benodigheid, GroenteVoeding voeding) {// Om makkelijk mee te kunnen testen
        super(naam,prijsPerStuk,benodigheid,voeding);
    }

public Groente(GroenteFactory plant) {
    super(plant);
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
