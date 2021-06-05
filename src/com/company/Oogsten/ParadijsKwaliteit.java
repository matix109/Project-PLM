package com.company.Oogsten;

public class ParadijsKwaliteit extends Kwaliteit {
    public ParadijsKwaliteit(String Kwaliteit) {
        super(Kwaliteit);
    }

    public String geldigeKwaliteitSoortenString(){
        return "Dat is geen geldige Kwaliteit. Voer Uitstekend, Matig of Bedorven in: ";
    }

    public boolean kwaliteitStringVoorwaarden(String kwaliteit){
        return kwaliteit.equalsIgnoreCase("uitstekend") || kwaliteit.equalsIgnoreCase("matig") || kwaliteit.equalsIgnoreCase("bedorven");
    }
}

