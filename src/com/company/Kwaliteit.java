package com.company;


class Kwaliteit {
    private double prijsPerStuk;
    private String kwaliteit;

    public Kwaliteit(String Kwaliteit, Plant plant, double PrijsPerStuk) {
        this.kwaliteit = Kwaliteit;
        this.prijsPerStuk = berekenPrijsPerStuk(plant, PrijsPerStuk, plant.getBio(),plant.getPrijsOmTeGroeien() > 0.30);
    }

        private double berekenPrijsPerStuk(Plant plant, double PrijsPerStuk, boolean Bio, boolean Luxe){
            double tijdelijkePrijsPerStuk = kwaliteitPrijs(plant, PrijsPerStuk);
            if (Bio){
                tijdelijkePrijsPerStuk = tijdelijkePrijsPerStuk + ((tijdelijkePrijsPerStuk/100)*10);
            }
            if(Luxe){
                tijdelijkePrijsPerStuk = tijdelijkePrijsPerStuk + ((tijdelijkePrijsPerStuk/100)*5);
            }
            return tijdelijkePrijsPerStuk;
        }

private double kwaliteitPrijs(Plant plant, double PrijsPerStuk){
    if (this.kwaliteit.equalsIgnoreCase("slecht")) {
        return PrijsPerStuk - plant.getBerekekningKwaliteit(this.kwaliteit,PrijsPerStuk);
    } else if (this.kwaliteit.equalsIgnoreCase("algemeen")) {
        return PrijsPerStuk;
    } else if (this.kwaliteit.equalsIgnoreCase("goed")) {
        return PrijsPerStuk + plant.getBerekekningKwaliteit(this.kwaliteit,PrijsPerStuk);
    }
    return PrijsPerStuk;
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
