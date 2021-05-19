package com.company;
class Oogst {
    private String naam;
    private int Hoeveelheid;
    private double Winst;
    //private Kwaliteit isVanEenBepaalde;
    private double kosten;

    public Oogst(Plant plant, int Hoeveelheid,double PrijsPerStuk, String Kwaliteit) {
        this.naam = plant.getNaam();
        this.Hoeveelheid = Hoeveelheid;
        //this.kwaliteit = new Kwaliteit(Kwaliteit, plant, PrijsPerStuk).getPrijsPerStuk();
        this.Winst = Hoeveelheid * new Kwaliteit(Kwaliteit, plant, PrijsPerStuk).getPrijsPerStuk();
        this.kosten = plant.getPrijsOmTeGroeien() * Hoeveelheid + extraKosten();
    }

private int extraKosten(){
    if (this.Hoeveelheid >= 500){
        return 70;
    }
    else if (this.Hoeveelheid >= 100){
        return 38;
    }
return 0;
}
    public void addWinstKas(Kas kas) {
            kas.addWinst(getNettoWinst());
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
