package com.company;

import java.util.Scanner;


public class KasEigenaarAccount {// Kan een lege wachtwoord of username bevatten dat is niet de bedoeling.
    private String Gebruikersnaam;
    private String Wachtwoord;

    public KasEigenaarAccount(){
    Gebruikersnaam = null;
    Wachtwoord = null;
    }

    public void maakAccount(){
        if(this.Gebruikersnaam == null && this.Wachtwoord == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Maak een account aan.");
            System.out.print("Voer u nieuwe Gebruikersnaam in: ");
            String Gebruikernsaam = scanner.nextLine();
            setGebruikersnaam(Gebruikernsaam);
            System.out.print("Voer u nieuwe Wachtwoord in: ");
            String Wachtwoord = scanner.nextLine();
            setWachtwoord(Wachtwoord);
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
        return Wachtwoord.equals(wachtwoord);
    }

    private void setGebruikersnaam(String gebruikersnaam) {
        Gebruikersnaam = gebruikersnaam;
    }

    private void setWachtwoord(String wachtwoord) {
        Wachtwoord = wachtwoord;
    }
}
