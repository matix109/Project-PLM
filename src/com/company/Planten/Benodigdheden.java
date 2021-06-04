package com.company.Planten;

import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.KasEigenaar.Login;
public abstract class Benodigdheden {
    private int groeiTijdWeken;
    private int Luchtvochtigheid;
    private int Temperatuur;

    public Benodigdheden(){
    }

    public Benodigdheden(int groeiTijdWeken, int Luchtvochtigheid,int Temperatuur){
    this.groeiTijdWeken = groeiTijdWeken;
    this.Luchtvochtigheid = Luchtvochtigheid;
    this.Temperatuur = Temperatuur;
    }

    public Benodigdheden maakBenodigdheden(){
        beginTekst();
        this.groeiTijdWeken = maakWekenAan();
        this.Luchtvochtigheid = maakLuchtvochtighiedAan();
        this.Temperatuur = maakTemperatuurAan();
        return this;
    }

    public abstract void beginTekst();

    public abstract int maakWekenAan();

    public abstract int maakLuchtvochtighiedAan();

    public abstract int maakTemperatuurAan();

    public void setBenodigdheden() throws KasEigenaarNietIngelogdException {
    if(Login.getInstance().kasEigenaarIngelogd()){
    maakBenodigdheden();
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
