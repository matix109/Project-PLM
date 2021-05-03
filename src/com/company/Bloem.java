package com.company;

import java.util.ArrayList;

class Bloem extends Plant {
    private ArrayList<Handelingen> Ondergaat;
    private String naam;
    private int groeiTijdWeken;
    private double prijsOmTeGroeien;
    private int Luchtvochtigheid;
    private int Temperatuur;
    private String Voeding;

    Bloem(String naam, int groeiTijdWeken, double prijsOmTeGroeien, int Luchtvochtigheid, int Temperatuur, int Gro, int MiGro, int Bloom) {
        super(naam,groeiTijdWeken,prijsOmTeGroeien,Luchtvochtigheid,Temperatuur);
        Ondergaat = new ArrayList<>();
        this.naam = naam;
        this.groeiTijdWeken = groeiTijdWeken;
        this.prijsOmTeGroeien = prijsOmTeGroeien;
        this.Luchtvochtigheid = Luchtvochtigheid;
        this.Temperatuur = Temperatuur;
        setStringVoeding(Gro,MiGro,Bloom);
    }

    public void geefVoeding(int Dag,int Maand,int Jaar) {
        Handelingen eten = new Handelingen(Dag,Maand,Jaar, "Krijgt: "+ Voeding);
        addHandeling(eten);
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

    public String getVoeding() {
        return Voeding;
    }

    public void setStringVoeding(int Gro, int MiGro, int Bloom) {
        Voeding =Gro + "ml Gro, " + MiGro + "ml MiGro en " + Bloom + "ml Bloom.";
    }

}
