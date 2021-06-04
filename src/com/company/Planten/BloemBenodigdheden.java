package com.company.Planten;

import com.company.AskForInput;

public class BloemBenodigdheden extends Benodigdheden{

    public BloemBenodigdheden(){
    }

    public BloemBenodigdheden(int groeiTijdWeken, int Luchtvochtigheid,int Temperatuur){//voor testen
    super(groeiTijdWeken,Luchtvochtigheid,Temperatuur);
    }

    public void beginTekst(){
        System.out.println("Wat zijn de bloem benodigdheden?");
    }

    public int maakWekenAan(){
        System.out.print("Voer de groei tijd ven de bloem in weken in: ");
        return AskForInput.vraagEenInt();
    }

    public int maakLuchtvochtighiedAan(){
        System.out.print("Voer de nodige luchtvochtigheid in(%): ");
        return AskForInput.vraagEenInt();
    }

    public int maakTemperatuurAan(){
        System.out.print("Voer de nodige temperatuur in(°C): ");
        return AskForInput.vraagEenInt();
    }

}
