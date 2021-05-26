package com.company;

import java.util.Scanner;

public class Login {
    private static Login singleton;
    private KasEigenaar hoortBij;//Dit zou normaalgesproken een array zijn met gebruikers die kunnen inloggen
    private boolean ingelogd;

    private Login(){
        this.hoortBij = null;
        this.ingelogd = false;
    }

    public static Login getInstance(){
        if(singleton == null){
singleton = new Login();
        }
    return singleton;
    }

    private boolean bestaatKasEigenaar(String Gebruikersnaam) {
        if (hoortBij != null) {
            return true;
        } else {
            if (KasEigenaar.getInstance().getGebruikersnaam() != null) {
                if (KasEigenaar.getInstance().getGebruikersnaam().equals(Gebruikersnaam)) {
                    this.hoortBij = KasEigenaar.getInstance();
                    return true;
                }
            }
        }
        return false;
    }

    private boolean gebruikersnaamControle(String gebruikersnaam){
            if (hoortBij != null) {
                return hoortBij.getGebruikersnaam().equals(gebruikersnaam);
            }

        return false;
    }

    public boolean kasEigenaarIngelogd(){
        return ingelogd;
    }

    public boolean Inloggen(){
        if(kasEigenaarIngelogd()){
            return true;
        }
        else{
            Scanner scanner = new Scanner(System.in);
            for(int i = 0; i < 3;i++) {
                System.out.println("=======================================");
                System.out.print("Voer u gebruikersnaam in: ");
                String gebruikersnaam = scanner.nextLine();
                if(bestaatKasEigenaar(gebruikersnaam)){
                System.out.print("Voer u wachtword in: ");
                String wachtwoord = scanner.nextLine();
                System.out.println("=======================================");

                if (gebruikersnaamControle(gebruikersnaam) && hoortBij.wachtwoordControle(wachtwoord)) {
                    System.out.println();
                    this.ingelogd = true;
                    System.out.println("Succesvol ingelogd!");
                    return true;
                }
                else {
                    System.out.println("Onjuiste combinatie van gebruikersnaam en wachtwoord");
                    System.out.println();
                }
            }
                else{
                    System.out.println("Kas eigenaar bestaat nog niet of heeft geen account.");
                    System.out.println();
                    break;
                }
              }
            }
        System.out.println("=======================================");
        return false;
    }


}
