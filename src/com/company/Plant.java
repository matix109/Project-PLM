package com.company;

import java.util.ArrayList;
abstract class Plant {
    private ArrayList<Handelingen> Ondergaat;
    private String naam;
    private int groeiTijdWeken;
    private int huidigeGroeiTijdWeken;
    private double prijsOmTeGroeien;
    private int Luchtvochtigheid;
    private int Temperatuur;

    Plant(String naam, int groeiTijdWeken, double prijsOmTeGroeien, int Luchtvochtigheid, int Temperatuur) {
        Ondergaat = new ArrayList<>();
        this.naam = naam;
        this.groeiTijdWeken = groeiTijdWeken;
        this.prijsOmTeGroeien = prijsOmTeGroeien;
        this.Luchtvochtigheid = Luchtvochtigheid;
        this.Temperatuur = Temperatuur;
        this.huidigeGroeiTijdWeken = 0;
    }
    abstract public double getBerekekningKwaliteit(String Kwaliteit, double prijsPerStuk);

    abstract public boolean getBio();

    abstract public String getVoeding();

    abstract public void geefVoeding(int dag, int maand, int jaar);

    private String handelingenString(int i){
        return this.Ondergaat.get(i).getDatum() + " " + this.Ondergaat.get(i).getHandeling() + "\n";
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

    public String getBenodigheden() {
        return "Plantensoort " + this.getNaam() + " moet staan in " + this.getTemperatuur() + " graden celcius met " +
                this.getLuchtvochtigheid() + "% luchtvochtigheid en heeft de volgende hoeveelheden voeding nodig: " + this.getVoeding();
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

    public int getGroeiTijdWeken() {
        return this.groeiTijdWeken;
    }

    public double getPrijsOmTeGroeien() {
        return this.prijsOmTeGroeien;
    }

    public int getLuchtvochtigheid() {
        return this.Luchtvochtigheid;
    }

    public int getTemperatuur() {
        return this.Temperatuur;
    }

    public void volgendeWeek(){
        this.huidigeGroeiTijdWeken = huidigeGroeiTijdWeken + 1;
    }

    public void setHuidigeGroeiTijdWeken(int huidigeGroeiTijdWeken) {
        this.huidigeGroeiTijdWeken = huidigeGroeiTijdWeken;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setGroeiTijdWeken(int groeiTijdWeken) {
        this.groeiTijdWeken = groeiTijdWeken;
    }

    public void setPrijsOmTeGroeien(double prijsOmTeGroeien) {
        this.prijsOmTeGroeien = prijsOmTeGroeien;
    }

    public void setLuchtvochtigheid(int luchtvochtigheid) {
        this.Luchtvochtigheid = luchtvochtigheid;
    }

    public void setTemperatuur(int temperatuur) {
        this.Temperatuur = temperatuur;
    }

}
