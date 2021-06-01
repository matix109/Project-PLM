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

    @Override
    public String toString() {
        return " moet staan in " + Temperatuur + " graden celcius met " +
                Luchtvochtigheid + "% luchtvochtigheid en heeft de volgende hoeveelheden voeding nodig: ";
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
}
