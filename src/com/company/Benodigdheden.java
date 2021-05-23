package com.company;

import com.company.Exceptions.KasEigenaarNietIngelogdException;

public class Benodigdheden {
    private int groeiTijdWeken;
    private int Luchtvochtigheid;
    private int Temperatuur;

    public Benodigdheden(int groeiTijdWeken, int luchtvochtigheid, int temperatuur){
    this.groeiTijdWeken = groeiTijdWeken;
    this.Luchtvochtigheid = luchtvochtigheid;
    this.Temperatuur = temperatuur;
    }

    public void setBenodigdheden(int groeiTijdWeken, int luchtvochtigheid, int temperatuur) throws KasEigenaarNietIngelogdException {
    if(Login.getInstance().kasEigenaarIngelogd()){
        this.groeiTijdWeken = groeiTijdWeken;
        this.Luchtvochtigheid = luchtvochtigheid;
        this.Temperatuur = temperatuur;
    }
    else{
    throw new KasEigenaarNietIngelogdException();
    }
    }

    public int getLuchtvochtigheid() {
        return this.Luchtvochtigheid;
    }

    public int getTemperatuur() {
        return this.Temperatuur;
    }
    public int getGroeiTijdWeken() {
        return this.groeiTijdWeken;
    }
    public void setGroeiTijdWeken(int groeiTijdWeken) {
        this.groeiTijdWeken = groeiTijdWeken;
    }

    public void setLuchtvochtigheid(int luchtvochtigheid) {
        this.Luchtvochtigheid = luchtvochtigheid;
    }

    public void setTemperatuur(int temperatuur) {
        this.Temperatuur = temperatuur;
    }
}
