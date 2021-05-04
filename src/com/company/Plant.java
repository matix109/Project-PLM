package com.company;

import java.util.ArrayList;
// Kijken of ik de variabelen hier kan weghalen en ook meer dingen naar hier halen uit plant en groente om
// codeduplicatie te voorkomen.
//Een Boolean volgroeid toevoegen met een methode waarin er gecontroleerd wordt of de groeitijd weken het zelfde is als de
//voorgestelde groeitijd +/- en vervolgens die boolean met true of false setten|| Volgroeid moet dan als een
//voorwaarde in de oogst methode als een plant niet volgrroeid is kan die niet geoogst worden.
abstract class Plant {
    private ArrayList<Handelingen> Ondergaat;
    private String naam;
    private int groeiTijdWeken;
    private int huidigeGroeiTijdWeken;
    private double prijsOmTeGroeien;
    private int Luchtvochtigheid;
    private int Temperatuur;
    private String Voeding;
    //boolean BIO

    Plant(String naam, int groeiTijdWeken, double prijsOmTeGroeien, int Luchtvochtigheid, int Temperatuur) {
        Ondergaat = new ArrayList<>();
        this.naam = naam;
        this.groeiTijdWeken = groeiTijdWeken;
        this.prijsOmTeGroeien = prijsOmTeGroeien;
        this.Luchtvochtigheid = Luchtvochtigheid;
        this.Temperatuur = Temperatuur;
    }

    abstract public void volgendeWeek();
    abstract public void setHuidigeGroeiTijdWeken(int huidigeGroeiTijdWeken);
    abstract public int getHuidigeGroeiTijdWeken();

    abstract public String getNaam();

    abstract public int getGroeiTijdWeken();

    abstract public double getPrijsOmTeGroeien();

    abstract public int getLuchtvochtigheid();

    abstract public int getTemperatuur();

    abstract public String getVoeding();


    public String getHandelingen() {
        String handelingenString = "";
        for (int i = 0; i < this.Ondergaat.size(); i++) {
            handelingenString = handelingenString + "" + this.Ondergaat.get(i).getDatum() + " " + this.Ondergaat.get(i).getHandeling() + "\n";
        }
        return handelingenString;
    }

    public void nieuweHandeling(int dag,int maand, int jaar, String handeling) {
        Handelingen add = new Handelingen(dag,maand,jaar,handeling);
        this.Ondergaat.add(add);
    }

    public String getBenodigheden() {
        String Benodigheden = "";
        Benodigheden = "Plantensoort " + this.getNaam() + " moet staan in " + this.getTemperatuur() + " graden celcius met " +
                this.getLuchtvochtigheid() + "% luchtvochtigheid en heeft de volgende hoeveelheden voeding nodig: " + this.getVoeding();
        return Benodigheden;
    }

     public void addHandeling(Handelingen handleing){
        this.Ondergaat.add(handleing);
}

    public void geefVoeding(int dag, int maand, int jaar)
    {
        Handelingen add = new Handelingen(dag,maand,jaar,  Voeding);
        addHandeling(add);
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
// De setters moeten zo aangepast worden dat alleen de gene met de Rol KAS EIGENAAR het aan kan passen.
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
