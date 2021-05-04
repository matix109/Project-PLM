package com.company;

import java.util.ArrayList;

class Groente extends Plant {
    private ArrayList<Handelingen> Ondergaat;
    private String naam;
    private int groeiTijdWeken;
    private int huidigeGroeiTijdWeken = 0;
    private double prijsOmTeGroeien;
    private int Luchtvochtigheid;
    private int Temperatuur;
    private String Voeding;

    Groente(String naam, int groeiTijdWeken, double prijsOmTeGroeien, int Luchtvochtigheid, int Temperatuur, int Gro, int MiGro) {
        super(naam,groeiTijdWeken,prijsOmTeGroeien,Luchtvochtigheid,Temperatuur);
        Ondergaat = new ArrayList<>();
        this.naam = naam;
        this.groeiTijdWeken = groeiTijdWeken;
        this.prijsOmTeGroeien = prijsOmTeGroeien;
        this.Luchtvochtigheid = Luchtvochtigheid;
        this.Temperatuur = Temperatuur;
        this.huidigeGroeiTijdWeken = 0;
        setStringVoeding(Gro,MiGro);
    }

    public void geefVoeding(int Dag,int Maand,int Jaar) {
        Handelingen add = new Handelingen(Dag,Maand,Jaar, "Krijgt: "+ Voeding);
        addHandeling(add);
    }

public void volgendeWeek(){
        this.huidigeGroeiTijdWeken = huidigeGroeiTijdWeken + 1;
}

    public void setHuidigeGroeiTijdWeken(int huidigeGroeiTijdWeken) {
        this.huidigeGroeiTijdWeken = huidigeGroeiTijdWeken;
    }

    public int getHuidigeGroeiTijdWeken() {
        return this.huidigeGroeiTijdWeken;
    }

    public String getNaam(){
        return naam;
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

    public void setStringVoeding(int Gro, int MiGro) {
        Voeding = Gro + "ml Gro en " + MiGro + "ml MiGro.";
    }
}
