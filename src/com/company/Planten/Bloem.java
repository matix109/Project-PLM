package com.company.Planten;

import com.company.AskForInput;
import com.company.VoedingPlanten.BloemVoeding;
import com.company.VoedingPlanten.Voeding;

public class Bloem extends Plant {

    public Bloem(String naam, double prijsPerStuk, Benodigdheden benodigheid, BloemVoeding voeding) {// Om makkelijk mee te kunnen testen
        super(naam,prijsPerStuk,benodigheid,voeding);
    }

    public Bloem() {
        super();
    }

    public void watIsDeNaam() {
        System.out.print("Wat is de naam van de bloem?: ");
    }

    public Voeding getSoortVoeding(){
        return new BloemVoeding();
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
