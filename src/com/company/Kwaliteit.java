package com.company;


class Kwaliteit {
    private double prijsPerStuk;
    private String kwaliteit;

    public Kwaliteit(String Kwaliteit, double PrijsPerStuk) {//als er x stuks zijn komen er extra kosten voor een krat
        this.kwaliteit = Kwaliteit;
        if (this.kwaliteit.equalsIgnoreCase("slecht")) {
                this.prijsPerStuk = PrijsPerStuk - ((PrijsPerStuk/100) * 30);
            } else if (this.kwaliteit.equalsIgnoreCase("algemeen")) {
                this.prijsPerStuk = PrijsPerStuk;
            } else if (this.kwaliteit.equalsIgnoreCase("goed")) {
                this.prijsPerStuk = PrijsPerStuk + ((PrijsPerStuk/100) * 30);
            }

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
