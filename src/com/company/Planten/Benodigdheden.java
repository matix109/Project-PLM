package com.company.Planten;

import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.KasEigenaar.Login;
public class Benodigdheden {
    private int groeiTijdWeken;
    private int Luchtvochtigheid;
    private int Temperatuur;

    public Benodigdheden(int groeiTijdWeken, int Luchtvochtigheid,int Temperatuur){
    this.groeiTijdWeken = groeiTijdWeken;
    this.Luchtvochtigheid = Luchtvochtigheid;
    this.Temperatuur = Temperatuur;
    }

    public void setBenodigdheden(int groeiTijdWeken, int Luchtvochtigheid,int Temperatuur) throws KasEigenaarNietIngelogdException {
    if(Login.getInstance().kasEigenaarIngelogd()){
        this.groeiTijdWeken = groeiTijdWeken;
        this.Luchtvochtigheid = Luchtvochtigheid;
        this.Temperatuur = Temperatuur;
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
