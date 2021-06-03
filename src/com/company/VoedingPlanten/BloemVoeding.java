package com.company.VoedingPlanten;

import com.company.AskForInput;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.KasEigenaar.Login;

public class BloemVoeding extends Voeding {
    double Gro;
    double MiGro;
    double Bloom;

    public BloemVoeding() {
    maakVoeding();
    }

    public BloemVoeding(double Gro, double MiGro, double Bloom) {//Voor testen
        this.Gro = Gro;
        this.MiGro = MiGro;
        this.Bloom = Bloom;
    }

private void maakVoeding(){
    System.out.println("Wat voor voeding krijgt de bloem?");
    System.out.print("Voer de Gro in ml in: ");
    this.Gro = AskForInput.vraagEenDouble();
    System.out.print("Voer de Mi-Gro in ml in: ");
    this.MiGro = AskForInput.vraagEenDouble();
    System.out.print("Voer de Bloom in ml in: ");
    this.Bloom = AskForInput.vraagEenDouble();
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
        return Gro + "ml Gro, " + MiGro + "ml MiGro en " + Bloom + "ml Bloom.";
    }

}
