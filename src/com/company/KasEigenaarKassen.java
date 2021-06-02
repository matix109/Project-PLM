package com.company;

import com.company.Exceptions.KasBestaatNietException;
import com.company.Exceptions.KasEigenaarNietIngelogdException;

import java.util.ArrayList;

public class KasEigenaarKassen {
    private ArrayList<Kas> Kassen;

    KasEigenaarKassen(){
        Kassen = new ArrayList<>();
        Kassen.add(new Kas("Dummy"));
    }

    public ArrayList<Kas> getKassenLijst(){
        ArrayList<Kas> dummy = new ArrayList<>();
        dummy.addAll(Kassen);
        return dummy;
    }

    public void removeKas(Kas kas) {
        if (new KasBezitControle(this).bezitDeKas(kas.getKasNaam())) {
            Kassen.remove(kas);
        }
    }

    public void addKas(Kas kas) throws KasEigenaarNietIngelogdException {
        if(Login.getInstance().kasEigenaarIngelogd()) {
            Kassen.add(kas);
        }
        else {
            throw new KasEigenaarNietIngelogdException();
        }
    }

}
