package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuKeuzes {

    public static int vraagEenInt() {
        Scanner welEenCijfer = new Scanner(System.in);
        while (true) {
            try {
                return welEenCijfer.nextInt();
            }
            catch (InputMismatchException e) {
                welEenCijfer.next();
                System.out.print("Dat is geen cijfer. Probeer opnieuw: ");
            }
        }
    }

    public static double vraagEenDouble() {
        Scanner welEenDouble = new Scanner(System.in);
        while (true) {
            try {
                return welEenDouble.nextDouble();
            }
            catch (InputMismatchException e) {
                welEenDouble.next();
                System.out.print("Dat is geen commagetal. Probeer opnieuw: ");
            }
        }
    }

    public static String vraagEenString() {
        Scanner welEenString = new Scanner(System.in);
        while (true) {
            try {
                return welEenString.nextLine();
            }
            catch (InputMismatchException e) {
                welEenString.next();
                System.out.print("Voer wat in: ");
            }
        }
    }

    public static int printKeuzes() {
        System.out.println("Menu");
        System.out.println("1) Lijst met planten");// keuze uit/ hele lijst met planten/ bloemen/groentes/
        System.out.println("2) Handeling uitvoeren op een plant");// oogsten/voeding geven/nieuwe handeling maken/
        System.out.println("3) Plant informatie");//de benodigdheden/handelingen/
        System.out.println("4) Nieuwe plant toevoegen");//gewoon plant toevoegen/
        System.out.println("5) Oogst informatie");// Alle oogst/Totale winst/
        System.out.println("6) Aanpassingen invoeren");// Alleen als ingelogd // benodigheden/string voeding/addKas //
        System.out.println("7) Inloggen (kas eigenaar)");// Inlog optie
        System.out.println("8) Registreren (kas eigenaar)");// Registratie
        System.out.println("9) Verander van kas.");
        System.out.println("0) Exit");
        System.out.print("Uw keuze: ");
            int choice = vraagEenInt();
        System.out.println();
            return choice;
    }

    public static int printHandelingKeuzes(){
        System.out.println("1) Ik wil een plant oogsten.");
        System.out.println("2) Ik wil een plant voeding geven.");
        System.out.println("3) Ik wil een aparte handeling verrichten op een plant.");
        System.out.println("4) Ik wil een plant 1 week vooruit zetten in zijn groei.");
        System.out.println("0) Terug");
        System.out.print("Uw keuze: ");
        int choiceHandeling = vraagEenInt();
        System.out.println();
        return choiceHandeling;
    }

    public static int printPlantInfo(){
        System.out.println("1) Ik wil de benodigdheden weten van een plant.");
        System.out.println("2) Ik wil de handelingen inzien die op een plant zijn verricht.");
        System.out.println("3) Ik wil weten hoe lang een plant al groeit.");
        System.out.println("0) Terug");
        System.out.print("Uw keuze: ");
        int choicePlantInfo = vraagEenInt();
        System.out.println();
        return choicePlantInfo;
    }
    public static int printPlantToevoegen(){
        System.out.println("1) Ik wil een bloem toevoegen.");
        System.out.println("2) Ik wil een groente toevoegen.");
        System.out.println("0) Terug");
        System.out.print("Uw keuze: ");
        int choicePlantToevoegen = vraagEenInt();
        System.out.println();
        return choicePlantToevoegen;
    }
    public static int printPlantOogst(){
        System.out.println("1) Ik een lijst met oogsten zien.");
        System.out.println("2) Ik wil de hoeveelheid oogsten zien.");
        System.out.println("3) Ik wil de totale winst zien.");
        System.out.println("0) Terug");
        System.out.print("Uw keuze: ");
        int choiceOogst = vraagEenInt();
        System.out.println();
        return choiceOogst;
    }
    public static int printKasEigenaarHandelingen(){
        System.out.println("1) Ik wil de benodigdheden van een plant veranderen.");
        System.out.println("2) Ik wil de voorgestelde voeding van een plant veranderen.");
        System.out.println("3) Ik wil een kas toevoegen.");
        System.out.println("0) Terug");
        System.out.print("Uw keuze: ");
        int choiceKasEigenaar = vraagEenInt();
        System.out.println();
        return choiceKasEigenaar;
    }
    public static int printLijstKeuzes(){
        System.out.println("1) Ik wil alle planten zien.");
        System.out.println("2) Ik wil de hoeveelheid planten in de kas zien.");
        System.out.println("0) Terug");
        System.out.print("Uw keuze: ");
        int choiceLijst = vraagEenInt();
        System.out.println();
        return choiceLijst;
    }

}
