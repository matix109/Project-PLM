package com.company;

import java.util.ArrayList;
abstract class Plant {
    private ArrayList<Handelingen> Ondergaat;
    private Benodigdheden Heeft;
    private String naam;
    private int huidigeGroeiTijdWeken;
    private double prijsOmTeGroeien;
    boolean Bio = true;

    Plant(String naam, double prijsOmTeGroeien, Benodigdheden benodigheid) {
        Ondergaat = new ArrayList<>();
        this.naam = naam;
        this.prijsOmTeGroeien = prijsOmTeGroeien;
        this.Heeft = benodigheid;
        this.huidigeGroeiTijdWeken = 0;
    }
    abstract public double getBerekekningKwaliteit(String Kwaliteit, double prijsPerStuk);

    abstract public String getVoeding();

    public void geefVoeding(int Dag,int Maand,int Jaar) {
        addHandeling(new Handelingen(Dag,Maand,Jaar, "Krijgt: "+ getVoeding()));
        this.Bio = false;
    }

    public boolean getBio(){
        return Bio;
    }

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
