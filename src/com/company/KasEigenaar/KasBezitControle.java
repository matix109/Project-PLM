package com.company.KasEigenaar;

import com.company.DeKas.Kas;
import com.company.Exceptions.KasBestaatNietException;

public class KasBezitControle {
    KasEigenaarKassen kasEigenaarKassen;

    public KasBezitControle(KasEigenaarKassen kasEigenaarKassen){
     this.kasEigenaarKassen = kasEigenaarKassen;
    }

    public boolean bezitDeKas(String kasNaam){
        for (int i = 0; i < kasEigenaarKassen.getKassenLijst().size(); i++) {
            if (kasEigenaarKassen.getKassenLijst().get(i).getKasNaam().equals(kasNaam)) {
                return true;
            }
        }
        return false;
    }
    public Kas getKasInBezit(String kasNaam) throws KasBestaatNietException {
        for (int i = 0; i < kasEigenaarKassen.getKassenLijst().size(); i++) {
            if (kasEigenaarKassen.getKassenLijst().get(i).getKasNaam().equals(kasNaam)) {
                return kasEigenaarKassen.getKassenLijst().get(i);
            }
        }
        throw new KasBestaatNietException(kasNaam);
    }
}
