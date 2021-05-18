package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class KasEigenaar {
    private static KasEigenaar singleton;
    private String Gebruikersnaam;
    private String Wachtwoord;
    private ArrayList<Kas> Bezit;


    private KasEigenaar(){
        Bezit = new ArrayList<>();
    }

    public static KasEigenaar getInstance(){
        if(singleton == null){
            singleton = new KasEigenaar();
        }
        return singleton;
    }

    public boolean bezitDeKas(Kas kas){
        for (int i = 0; i < Bezit.size(); i++) {
            if (Bezit.get(i).getKasNaam().equals(kas.getKasNaam())) {
                return true;
            }
        }
        return false;
    }

    public void addKas(Kas kas){
    Bezit.add(kas);
    }

    public void removeKas(Kas kas){
    if(bezitDeKas(kas)){
        Bezit.remove(kas);
    }
    }

    public static void maakAccount(){
        if(KasEigenaar.getInstance().Gebruikersnaam == null && KasEigenaar.getInstance().Wachtwoord == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Maak een account aan.");
            System.out.println("Voer u nieuwe Gebruikersnaam in:");
            String Gebruikernsaam = scanner.nextLine();
            KasEigenaar.getInstance().setGebruikersnaam(Gebruikernsaam);
            System.out.println("Voer u nieuwe Wachtwoord in:");
            String Wachtwoord = scanner.nextLine();
            KasEigenaar.getInstance().setWachtwoord(Wachtwoord);
        }
    }

    public String getGebruikersnaam() {
        return Gebruikersnaam;
    }

    public boolean wachtwoordControle(String wachtwoord){
        return this.Wachtwoord.equals(wachtwoord);
    }

    private void setGebruikersnaam(String gebruikersnaam) {
        Gebruikersnaam = gebruikersnaam;
    }

    private void setWachtwoord(String wachtwoord) {
        Wachtwoord = wachtwoord;
    }

}
