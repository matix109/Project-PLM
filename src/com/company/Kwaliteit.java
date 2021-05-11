package com.company;


class Kwaliteit {
    private double prijsPerStuk;
    private String kwaliteit;

    public Kwaliteit(String Kwaliteit, Plant plant, double PrijsPerStuk) {
        this.kwaliteit = Kwaliteit;
        this.prijsPerStuk = PrijsPerStuk;
        boolean isDePlantBio = plant.getBio();
        boolean isDePlantLuxe = plant.getPrijsOmTeGroeien() > 0.30;
        this.prijsPerStuk = berekenPrijsPerStuk(Kwaliteit,plant,isDePlantBio,isDePlantLuxe);
    }
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
