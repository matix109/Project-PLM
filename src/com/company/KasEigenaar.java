package com.company;

import com.company.Exceptions.KasBestaatNietException;
import com.company.Exceptions.KasEigenaarNietIngelogdException;

import java.util.ArrayList;
import java.util.Scanner;

public class KasEigenaar {
    private static KasEigenaar singleton;
    private String Gebruikersnaam;
    private String Wachtwoord;
    private ArrayList<Kas> Bezit;


    private KasEigenaar(){
        Bezit = new ArrayList<>();
        Bezit.add(new Kas("Dummy"));
    }

    public static KasEigenaar getInstance(){
        if(singleton == null){
            singleton = new KasEigenaar();
        }
        return singleton;
    }

    public boolean bezitDeKas(String kas){
        for (int i = 0; i < Bezit.size(); i++) {
            if (Bezit.get(i).getKasNaam().equals(kas)) {
                return true;
            }
        }
        return false;
    }

    public Kas getKasInBezit(String name) throws KasBestaatNietException {
        for (int i = 0; i < Bezit.size(); i++) {
            if (Bezit.get(i).getKasNaam().equals(name)) {
                return Bezit.get(i);
            }
        }
throw new KasBestaatNietException(name);
    }

    public void addKas(Kas kas) throws KasEigenaarNietIngelogdException {
        if(Login.getInstance().kasEigenaarIngelogd()) {
            Bezit.add(kas);
        }
        else {
            throw new KasEigenaarNietIngelogdException();
        }
    }

    public void removeKas(Kas kas){
    if(bezitDeKas(kas.getKasNaam())){
        Bezit.remove(kas);
    }
    }

    public static void maakAccount(){
        if(KasEigenaar.getInstance().Gebruikersnaam == null && KasEigenaar.getInstance().Wachtwoord == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Maak een account aan.");
            System.out.print("Voer u nieuwe Gebruikersnaam in: ");
            String Gebruikernsaam = scanner.nextLine();
            KasEigenaar.getInstance().setGebruikersnaam(Gebruikernsaam);
            System.out.print("Voer u nieuwe Wachtwoord in: ");
            String Wachtwoord = scanner.nextLine();
            KasEigenaar.getInstance().setWachtwoord(Wachtwoord);
        }
        else{
            System.out.println("De kas eigenaar heeft al een account.");
            System.out.println();
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
