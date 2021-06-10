package com.company.KasEigenaar;

import com.company.Menu.AskForInput;

public class Login {
    private static Login singleton;
    private KasEigenaar kasEigenaar;
    private boolean ingelogd;

    private Login(){
        this.kasEigenaar = null;
        this.ingelogd = false;
    }

    public static Login getInstance(){
        if(singleton == null){
singleton = new Login();
        }
    return singleton;
    }

    private boolean bestaatKasEigenaar(String Gebruikersnaam) {
        if (kasEigenaar != null) {
            return true;
        } else {
            if (KasEigenaar.getInstance().getAccount().getGebruikersnaam() != null) {
                if (KasEigenaar.getInstance().getAccount().getGebruikersnaam().equals(Gebruikersnaam)) {
                    this.kasEigenaar = KasEigenaar.getInstance();
                    return true;
                }
            }
        }
        return false;
    }

    private boolean gebruikersnaamControle(String gebruikersnaam){
            if (kasEigenaar != null) {
                return kasEigenaar.getAccount().getGebruikersnaam().equals(gebruikersnaam);
            }

        return false;
    }

    public boolean kasEigenaarIngelogd(){
        return ingelogd;
    }

    public boolean Inloggen(){
        if(kasEigenaarIngelogd()){
            return true; }
        else{
            for(int i = 0; i < 3;i++) {
                System.out.println("=======================================");
                System.out.print("Voer u gebruikersnaam in: ");
                String gebruikersnaam = AskForInput.vraagEenString();
                if(bestaatKasEigenaar(gebruikersnaam)){
                System.out.print("Voer u wachtword in: ");
                String wachtwoord = AskForInput.vraagEenString();
                System.out.println("=======================================");
                if (gebruikersnaamControle(gebruikersnaam) && kasEigenaar.getAccount().wachtwoordControle(wachtwoord)) {
                    System.out.println();
                    this.ingelogd = true;
                    System.out.println("Succesvol ingelogd!");
                    return true; }
                else {
                    System.out.println("Onjuiste combinatie van gebruikersnaam en wachtwoord");
                    System.out.println(); } }
                else{
                    System.out.println("Kas eigenaar bestaat nog niet of heeft geen account.");
                    System.out.println();
                    break; } } }
        System.out.println("=======================================");
        return false; }


}
