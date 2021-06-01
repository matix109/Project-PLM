package com.company;

import com.company.Exceptions.KasEigenaarNietIngelogdException;

public class BloemVoeding extends Voeding{
    double Gro;
    double MiGro;
    double Bloom;

    BloemVoeding(double Gro, double MiGro, double Bloom) {
        this.Gro =Gro;
        this.MiGro = MiGro;
        this.Bloom = Bloom;
    }

    public void setVoeding() throws KasEigenaarNietIngelogdException {
        if(Login.getInstance().kasEigenaarIngelogd()) {
            System.out.print("Voer de Gro in ml in: ");
            this.Gro = AskForInput.vraagEenDouble();
            System.out.print("Voer de Mi-Gro in ml in: ");
            this.MiGro = AskForInput.vraagEenDouble();
            System.out.print("Voer de Bloom in ml in: ");
            this.Bloom = AskForInput.vraagEenDouble();
            System.out.println();
        }
        else {
            throw new KasEigenaarNietIngelogdException();
        }
    }

    public String setStringVoeding() {
        return Gro + "ml Gro, " + MiGro + "ml MiGro en " + Bloom + "ml Bloom.";
    }

}
