package com.company;

import java.util.Scanner;

public class MenuKeuzes {
    public static int printKeuzes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1) Lijst met planten");// keuze uit/ hele lijst met planten/ bloemen/groentes/
        System.out.println("2) Handeling uitvoeren op een plant");// oogsten/voeding geven/nieuwe handeling maken/
        System.out.println("3) Plant informatie");//de benodigdheden/handelingen/
        System.out.println("4) Nieuwe plant toevoegen");//gewoon plant toevoegen/
        System.out.println("5) Oogst informatie");// Alle oogst/Totale winst/
        System.out.println("6) Aanpassingen invoeren");// Alleen als ingelogd // benodigheden/string voeding/addKas //
        System.out.println("7) Inloggen (kas eigenaar)");// Inlog optie
        System.out.println("8) Registreren (kas eigenaar)");// Registratie
        System.out.println("0) Exit");
        System.out.print("Uw keuze: ");
        System.out.println();
        int choice = scanner.nextInt();
        return choice;
    }

    public static int printHandelingKeuzes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Ik wil een plant oogsten.");
        System.out.println("2) Ik wil een plant voeding geven.");
        System.out.println("3) Ik wil een aparte handeling verrichten op een plant.");
        System.out.println("0) Terug");
        System.out.print("Uw keuze: ");
        System.out.println();
        int choiceHandeling = scanner.nextInt();
        return choiceHandeling;
    }

    public static int printPlantInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Ik wil de benodigdheden weten van een plant.");
        System.out.println("2) Ik wil de handelingen inzien die op een plant zijn verricht.");
        System.out.println("0) Terug");
        System.out.print("Uw keuze: ");
        System.out.println();
        int choicePlantInfo = scanner.nextInt();
        return choicePlantInfo;
    }
    public static int printPlantToevoegen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Ik wil een bloem toevoegen.");
        System.out.println("2) Ik wil een groente toevoegen.");
        System.out.println("0) Terug");
        System.out.print("Uw keuze: ");
        System.out.println();
        int choicePlantToevoegen = scanner.nextInt();
        return choicePlantToevoegen;
    }
    public static int printPlantOogst(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Ik alle oogst zien.");
        System.out.println("2) Ik wil de totale winst zien.");
        System.out.println("0) Terug");
        System.out.print("Uw keuze: ");
        System.out.println();
        int choiceOogst = scanner.nextInt();
        return choiceOogst;
    }
    public static int printKasEigenaarHandelingen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Ik wil de benodigdheden van een plant veranderen.");
        System.out.println("2) Ik wil de voorgestelde voeding van een plant veranderen.");
        System.out.println("3) Ik wil een kas toevoegen.");
        System.out.println("0) Terug");
        System.out.print("Uw keuze: ");
        System.out.println();
        int choiceKasEigenaar = scanner.nextInt();
        return choiceKasEigenaar;
    }
    public static int printLijstKeuzes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Ik wil alle planten zien.");
        System.out.println("2) Ik wil alle bloemen zien.");
        System.out.println("3) IK wil alle groentes zien.");
        System.out.println("0) Terug");
        System.out.print("Uw keuze: ");
        System.out.println();
        int choiceLijst = scanner.nextInt();
        return choiceLijst;
    }

}
