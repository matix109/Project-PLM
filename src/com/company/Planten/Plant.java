package com.company.Planten;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.KasEigenaar.Login;
import com.company.VoedingPlanten.Voeding;

public abstract class Plant {
    private HandelingenList Ondergaat;
    private Benodigdheden Heeft;
    private PlantLevensduur inDeGroei;
    private String naam;
    private double prijsOmTeGroeien;
    private boolean Bio = true;
    private Voeding voeding;

        Plant(String naam, double prijsOmTeGroeien, Benodigdheden benodigheid, Voeding voeding) {// Om makkelijk mee te kunnen testen
        this.Ondergaat = new HandelingenList();
        this.naam = naam;
        this.prijsOmTeGroeien = prijsOmTeGroeien;
        this.Heeft = benodigheid;
        this.inDeGroei = new PlantLevensduur();
        this.voeding = voeding;
    }

    abstract public double getBerekeningKwaliteit(double HuidigePPS);

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
