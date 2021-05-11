package com.company;
class Oogst {
    private String naam;
    private int Hoeveelheid;
    private double Winst;
    private Kwaliteit kwaliteit;
    private double kosten;

    public Oogst(Plant plant, int Hoeveelheid,double PrijsPerStuk, String Kwaliteit) {
        this.naam = plant.getNaam();
        this.Hoeveelheid = Hoeveelheid;
        this.kwaliteit = new Kwaliteit(Kwaliteit, plant, PrijsPerStuk);
        this.Winst = Hoeveelheid * kwaliteit.getPrijsPerStuk();
        this.kosten = plant.getPrijsOmTeGroeien() * Hoeveelheid;
    }

    public void addWinstKas(Kas kas) {
        if (this.Hoeveelheid >= 500){
            kas.addWinst(Winst - (kosten + 70));//Kist
        }
        else if (this.Hoeveelheid >= 100){
            kas.addWinst(Winst - (kosten + 38));//Pallet
        }
        else {//if (this.Hoeveelheid < 100)
            kas.addWinst(Winst - kosten);
        }
    }

    public int getHoeveelheid() {
        return Hoeveelheid;
    }

    public double getWinst() {
        return Winst;
    }

    public String getNaam(){
        return naam;
    }

    public double getNettoWinst() {
        return Winst - kosten;
    }

    public void setWinst(int winst) {
        this.Winst = winst;
    }

    public void setHoeveelheid(int hoeveelheid) {
        this.Hoeveelheid = hoeveelheid;
    }
}
