package com.company;

import com.company.Exceptions.KasBestaatNietException;

public class KasBezitControle {
    KasEigenaarKassen kasEigenaarKassen;

    KasBezitControle(KasEigenaarKassen kasEigenaarKassen){
     this.kasEigenaarKassen = kasEigenaarKassen;
    }

    public boolean bezitDeKas(String kas){
        for (int i = 0; i < kasEigenaarKassen.getKassenLijst().size(); i++) {
            if (kasEigenaarKassen.getKassenLijst().get(i).getKasNaam().equals(kas)) {
                return true;
            }
        }
        return false;
    }
    public Kas getKasInBezit(String name) throws KasBestaatNietException {
        for (int i = 0; i < kasEigenaarKassen.getKassenLijst().size(); i++) {
            if (kasEigenaarKassen.getKassenLijst().get(i).getKasNaam().equals(name)) {
                return kasEigenaarKassen.getKassenLijst().get(i);
            }
        }
        throw new KasBestaatNietException(name);
    }
}
