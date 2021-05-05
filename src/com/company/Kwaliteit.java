package com.company;


class Kwaliteit {
    private double prijsPerStuk;
    private String kwaliteit;

    public Kwaliteit(String Kwaliteit, Plant plant, double PrijsPerStuk) {
        this.kwaliteit = Kwaliteit;
        this.prijsPerStuk = PrijsPerStuk;
        boolean isDePlantBio = plant.getBio();
        boolean isDePlantLuxe = plant.getPrijsOmTeGroeien() > 0.30;
        double nieuwePrijsPerStuk = berekenPrijsPerStuk(Kwaliteit,plant,isDePlantBio,isDePlantLuxe);
        this.prijsPerStuk = nieuwePrijsPerStuk;
    }
    //als de groeikosten van de plant meer zijn dan 0.40 cent gaat het om een luxere plant daardoor komt er 10% boven op de prijs.
    //als de plant een groente is andere berekening van kwaliteit 2 variabelen (Groente, Bloem)// get die berekening uit bloem of groente
    //Kwaliteit 3 variabelen (Goed,Algemeen,Slecht) waarop de initiele prijs per stuk wordt gebaseerd.
    //Boolean Bio als de plant 0 keer voeding heeft gekregen is die bio anders niet 2 variabelen (Bio of niet Bio) als die bio is wordt de prijs hoger

        public double berekenPrijsPerStuk(String Kwaliteit, Plant plant, boolean Bio, boolean Luxe){
            double tijdelijkePrijsPerStuk = 0;
            if (this.kwaliteit.equalsIgnoreCase("slecht")) {
                tijdelijkePrijsPerStuk = this.prijsPerStuk - plant.getBerekekningKwaliteit(Kwaliteit,this.prijsPerStuk);
            } else if (this.kwaliteit.equalsIgnoreCase("algemeen")) {
                tijdelijkePrijsPerStuk = prijsPerStuk;
            } else if (this.kwaliteit.equalsIgnoreCase("goed")) {
                tijdelijkePrijsPerStuk = this.prijsPerStuk + plant.getBerekekningKwaliteit(Kwaliteit,this.prijsPerStuk);
            }
            if (Bio){
                tijdelijkePrijsPerStuk = tijdelijkePrijsPerStuk + ((tijdelijkePrijsPerStuk/100)*10);
            }
            if(Luxe){
                tijdelijkePrijsPerStuk = tijdelijkePrijsPerStuk + ((tijdelijkePrijsPerStuk/100)*5);
            }
            return tijdelijkePrijsPerStuk;
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
