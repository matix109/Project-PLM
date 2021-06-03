package com.company.Planten;
import com.company.VoedingPlanten.GroenteVoeding;
import com.company.VoedingPlanten.Voeding;

public class Groente extends Plant {

    public Groente(String naam, double prijsPerStuk, Benodigdheden benodigheid, GroenteVoeding voeding) {// Om makkelijk mee te kunnen testen
        super(naam,prijsPerStuk,benodigheid,voeding);
    }

public Groente() {
    super();
}

public void watIsDeNaam() {
    System.out.print("Wat is de naam van de groente?: ");
}

    public Voeding getSoortVoeding(){
        return new GroenteVoeding();
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
