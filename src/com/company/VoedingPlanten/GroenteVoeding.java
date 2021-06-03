package com.company.VoedingPlanten;

import com.company.AskForInput;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.KasEigenaar.Login;

public class GroenteVoeding extends Voeding {
    double Gro;
    double MiGro;

    public GroenteVoeding() {
    maakVoeding();
    }

    public GroenteVoeding(double Gro, double MiGro) {//Voor testen
        this.Gro = Gro;
        this.MiGro = MiGro;
    }

    private void maakVoeding(){
        System.out.println("Wat voor voeding krijgt de groente?");
        System.out.print("Voer de Gro in ml in: ");
        this.Gro = AskForInput.vraagEenDouble();
        System.out.print("Voer de Mi-Gro in ml in: ");
        this.MiGro = AskForInput.vraagEenDouble();
    }

    public void setVoeding() throws KasEigenaarNietIngelogdException {
        if(Login.getInstance().kasEigenaarIngelogd()) {
        maakVoeding();
        }
        else {
            throw new KasEigenaarNietIngelogdException();
        }
    }

    public String setStringVoeding() {
        return Gro + "ml Gro en " + MiGro + "ml MiGro.";
    }
}
