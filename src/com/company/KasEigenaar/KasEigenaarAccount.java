package com.company.KasEigenaar;

import com.company.AskForInput;

public class KasEigenaarAccount {// Kan een lege wachtwoord of username bevatten dat is niet de bedoeling.
    private String Gebruikersnaam;
    private String Wachtwoord;

    public KasEigenaarAccount(){
    Gebruikersnaam = null;
    Wachtwoord = null;
    }

    public void maakAccount(){
        if(this.Gebruikersnaam == null && this.Wachtwoord == null) {
            System.out.println("Maak een account aan.");
            System.out.print("Voer u nieuwe Gebruikersnaam in: ");
            String Gebruikernsaam = AskForInput.vraagEenString();
            while(Gebruikernsaam.length() < 3) {
                System.out.println("Voer minimaal 3 characters in: ");
                Gebruikernsaam = AskForInput.vraagEenString();
            }
            setGebruikersnaam(Gebruikernsaam);
            System.out.print("Voer u nieuwe Wachtwoord in: ");
            String Wachtwoord = AskForInput.vraagEenString();
            while(Wachtwoord.length() < 3) {
                System.out.println("Voer minimaal 3 characters in: ");
                Wachtwoord = AskForInput.vraagEenString();
            }
            setWachtwoord(Wachtwoord);
            System.out.println("Succes! Account met de naam: "+Gebruikernsaam+" is aangemaakt.");
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
