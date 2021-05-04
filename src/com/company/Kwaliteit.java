package com.company;


class Kwaliteit {
    private double prijsPerStuk;
    private String kwaliteit;

    public Kwaliteit(String Kwaliteit, double PrijsPerStuk) {
        this.kwaliteit = Kwaliteit;
        if (this.kwaliteit.equalsIgnoreCase("slecht")) {
            this.prijsPerStuk = PrijsPerStuk - ((PrijsPerStuk / 100) * 30);
        } else if (this.kwaliteit.equalsIgnoreCase("algemeen")) {
            this.prijsPerStuk = PrijsPerStuk;
        } else if (this.kwaliteit.equalsIgnoreCase("goed")) {
            this.prijsPerStuk = PrijsPerStuk + ((PrijsPerStuk / 100) * 30);
        }
    }
    //als de groeikosten van de plant meer zijn dan 0.40 cent gaat het om een luxere plant daardoor komt er 10% boven op de prijs.
    //als de plant een groente is andere berekening van kwaliteit 2 variabelen (Groente, Bloem)// get die berekening uit bloem of groente
    //Kwaliteit 3 variabelen (Goed,Algemeen,Slecht) waarop de initiele prijs per stuk wordt gebaseerd.
    //Boolean Bio als de plant 0 keer voeding heeft gekregen is die bio anders niet 2 variabelen (Bio of niet Bio) als die bio is wordt de prijs hoger

    public double berekenPrijsPerStuk(String Kwaliteit, Plant plant, boolean Bio, boolean Luxe){
        return 0;
    }

    public String getKwaliteit() {
        return kwaliteit;
    }

    public void setKwaliteit(String kwaliteit) {
        this.kwaliteit = kwaliteit;
    }

    public double getPrijsPerStuk() {
        return prijsPerStuk;
    }
}
