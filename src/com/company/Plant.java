package com.company;

import java.util.ArrayList;
abstract class Plant {
    private ArrayList<Handelingen> Ondergaat;
    private String naam;
    private int huidigeGroeiTijdWeken;
    private double prijsOmTeGroeien;
    //Benodigheiden miss een apparte klasse
    private Benodigdheden Heeft;
    // miss voeding een apparte klasse maken om de parameter lijst kleiner te maken bij het
    // aanmaken van een bloem of een groente.

    Plant(String naam, double prijsOmTeGroeien, Benodigdheden benodigheid) {
        Ondergaat = new ArrayList<>();
        this.naam = naam;
        this.prijsOmTeGroeien = prijsOmTeGroeien;
        this.Heeft = benodigheid;
        this.huidigeGroeiTijdWeken = 0;
/*        this.groeiTijdWeken = groeiTijdWeken;
        this.Luchtvochtigheid = Luchtvochtigheid;
        this.Temperatuur = Temperatuur;*/
    }
    abstract public double getBerekekningKwaliteit(String Kwaliteit, double prijsPerStuk);

    abstract public boolean getBio();

    abstract public String getVoeding();

    abstract public void geefVoeding(int dag, int maand, int jaar);

    private String handelingenString(int i) {
        return this.Ondergaat.get(i).getDatum() + " " + this.Ondergaat.get(i).getHandeling() + "\n";
    }

    public void setHuidigeGroeiTijdWeken(int huidigeGroeiTijdWeken) {
        this.huidigeGroeiTijdWeken = huidigeGroeiTijdWeken;
    }

    public String getHandelingen() {
        String handelingenString = "";
        for (int i = 0; i < this.Ondergaat.size(); i++) {
             handelingenString = handelingenString + handelingenString(i);
        }
        return handelingenString;
    }

    public void nieuweHandeling(int dag,int maand, int jaar, String handeling) {
        Handelingen add = new Handelingen(dag,maand,jaar,handeling);
        this.Ondergaat.add(add);
    }
    public Benodigdheden getBenodigdheden(){
        return Heeft;
    }
    public String getBenodighedenString() {
        return "Plantensoort " + this.getNaam() + " moet staan in " + Heeft.getTemperatuur() + " graden celcius met " +
                Heeft.getLuchtvochtigheid() + "% luchtvochtigheid en heeft de volgende hoeveelheden voeding nodig: " + this.getVoeding();
    }

     public void addHandeling(Handelingen handleing){
        this.Ondergaat.add(handleing);
}

    public void resetHandelingen(){
    this.Ondergaat = new ArrayList<>();
    }

    public int getHoeveelheidHandelingen() {
        int i;
        for (i = 0; i < Ondergaat.size(); i++) {
        }
        return i;
    }
    public int getHuidigeGroeiTijdWeken() {
        return this.huidigeGroeiTijdWeken;
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

    public void volgendeWeek(){
        this.huidigeGroeiTijdWeken = huidigeGroeiTijdWeken + 1;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
