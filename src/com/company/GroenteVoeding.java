package com.company;

import com.company.Exceptions.KasEigenaarNietIngelogdException;

public class GroenteVoeding extends Voeding {
    double Gro;
    double MiGro;

    GroenteVoeding(double Gro, double MiGro) {
        this.Gro = Gro;
        this.MiGro = MiGro;
    }

    public void setVoeding() throws KasEigenaarNietIngelogdException {
        if(Login.getInstance().kasEigenaarIngelogd()) {
            System.out.print("Voer de Gro in ml in: ");
            this.Gro = AskForInput.vraagEenDouble();
            System.out.print("Voer de Mi-Gro in ml in: ");
            this.MiGro = AskForInput.vraagEenDouble();
            System.out.println();
        }
        else {
            throw new KasEigenaarNietIngelogdException();
        }
    }

    public String setStringVoeding() {
        return Gro + "ml Gro en " + MiGro + "ml MiGro.";
    }
}
