package com.company.Planten;

import com.company.AskForInput;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.KasEigenaar.Login;

public class Benodigdheden {
    private int groeiTijdWeken;
    private int Luchtvochtigheid;
    private int Temperatuur;

    public Benodigdheden(){
    maakBenodigdheden();
    }
    public Benodigdheden(int groeiTijdWeken, int Luchtvochtigheid,int Temperatuur){
    this.groeiTijdWeken = groeiTijdWeken;
    this.Luchtvochtigheid = Luchtvochtigheid;
    this.Temperatuur = Temperatuur;
    }

    private void maakBenodigdheden(){
        System.out.println("Wat zijn de benodigdheden?");
    System.out.print("Voer de groei tijd in weken in: ");
    this.groeiTijdWeken = AskForInput.vraagEenInt();
    System.out.print("Voer de nodige luchtvochtigheid in(%): ");
    this.Luchtvochtigheid = AskForInput.vraagEenInt();
    System.out.print("Voer de nodige temperatuur in(°C): ");
    this.Temperatuur = AskForInput.vraagEenInt();
    }

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
