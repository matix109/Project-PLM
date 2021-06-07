package com.company.Oogsten;

public class TesselaarKwaliteit extends Kwaliteit {

    public TesselaarKwaliteit(String Kwaliteit) {
        super(Kwaliteit);
    }

    public String geldigeKwaliteitSoortenString(){
        return "Dat is geen geldige Kwaliteit. Voer Slecht,Algemeen of Goed in: ";
    }

    public boolean kwaliteitStringVoorwaarden(String kwaliteit){
        return kwaliteit.equalsIgnoreCase("slecht") || kwaliteit.equalsIgnoreCase("algemeen") || kwaliteit.equalsIgnoreCase("goed");
    }
}
