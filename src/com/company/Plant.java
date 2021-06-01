package com.company;

abstract class Plant {
    private HandelingenList Ondergaat;
    private Benodigdheden Heeft;
    private PlantLevensduur inDeGroei;
    private String naam;
    private Voeding voeding;
    private double prijsOmTeGroeien;
    private boolean Bio = true;

    Plant(String naam, double prijsOmTeGroeien, Benodigdheden benodigheid, Voeding Voeding) {
        this.Ondergaat = new HandelingenList();
        this.naam = naam;
        this.prijsOmTeGroeien = prijsOmTeGroeien;
        this.Heeft = benodigheid;
        this.voeding = Voeding;
        this.inDeGroei = new PlantLevensduur();
    }

    abstract public double getBerekekningKwaliteit(String Kwaliteit, double prijsPerStuk);

    public Voeding getVoeding(){
    return voeding;
    }

    public HandelingenList getHandelingen() {
        return Ondergaat;
    }

    public boolean getBio(){
        return Bio;
    }

    public void setBio(boolean bio){
        this.Bio = bio;
    }

    public Benodigdheden getBenodigdheden(){
        return Heeft;
    }

    public PlantLevensduur getPlantLevensduur(){
    return inDeGroei;
    }

    public String getNaam(){
        return this.naam;
    }

    public double getPrijsOmTeGroeien() {
        return this.prijsOmTeGroeien;
    }

    public void setPrijsOmTeGroeien(double prijsOmTeGroeien) {
        this.prijsOmTeGroeien = prijsOmTeGroeien;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
