package com.company;

import java.util.ArrayList;

class Bloem extends Plant {
    private ArrayList<Handelingen> Ondergaat;
    private String naam;
    private int groeiTijdWeken;
    private int huidigeGroeiTijdWeken = 0;
    private double prijsOmTeGroeien;
    private int Luchtvochtigheid;
    private int Temperatuur;
    private String Voeding;
    boolean Bio = true;

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

    public double getBerekekningKwaliteit(String Kwaliteit, double prijsPerStuk){
        if (Kwaliteit.equalsIgnoreCase("slecht")) {
            return (prijsPerStuk / 100) * 30;
        } else if (Kwaliteit.equalsIgnoreCase("goed")) {
            return (prijsPerStuk / 100) * 30;
        }
        return 0;
    }

    public void geefVoeding(int Dag,int Maand,int Jaar) {
        Handelingen eten = new Handelingen(Dag,Maand,Jaar, "Krijgt: "+ Voeding);
        addHandeling(eten);
        this.Bio = false;
    }
    public boolean getBio(){
        return Bio;
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
