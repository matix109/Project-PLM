package com.company;

import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.Exceptions.NietInDeKasException;

import java.util.Scanner;

public class MenuCases {

    public static void case1(Kas kas) {
        int choicelijst = MenuKeuzes.printLijstKeuzes();
        switch (choicelijst) {
            case 0:
                return;
            case 1:
                kas.getPlantenLijst();
                System.out.println();
                break;
            case 2:
                kas.getBloemenLijst();
                System.out.println();
                break;
            case 3:
                kas.getGroenteLijst();
                System.out.println();
                break;
            default:
                System.out.println("Kies 1 t/m 3");
        }
    }

    public static void case2(Kas kas) {
        Scanner scanner = new Scanner(System.in);
        int choiceHendeling = MenuKeuzes.printHandelingKeuzes();
        switch (choiceHendeling) {
            case 0:
                return;
            case 1:
                try {
                    Plant plant = kas.getTargetPlant();
                    System.out.println("Wat is de hoeveelheid planten?");
                    int hoeveelheid = scanner.nextInt();
                    System.out.println("Wat is de prijs per stuk?");
                    double PPS = scanner.nextDouble();
                    System.out.println("Wat is de kwaliteit?(Goed/Algemeen/Slecht)");
                    String kwaliteit = scanner.nextLine();
                    kas.oogstPlantSoort(plant, hoeveelheid, PPS, kwaliteit);
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                }
                break;
            case 2:
                try {
                    Plant plant2 = kas.getTargetPlant();
                    System.out.println("Voer de dag in:");
                    int dag = scanner.nextInt();
                    System.out.println("Voer de maand in:");
                    int maand = scanner.nextInt();
                    System.out.println("Voer het jaar in:");
                    int jaar = scanner.nextInt();
                    plant2.geefVoeding(dag, maand, jaar);
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                }
                break;
            case 3:
                try {
                    Plant plant3 = kas.getTargetPlant();
                    System.out.println("Voer de dag in:");
                    int dag2 = scanner.nextInt();
                    System.out.println("Voer de maand in:");
                    int maand2 = scanner.nextInt();
                    System.out.println("Voer het jaar in:");
                    int jaar2 = scanner.nextInt();
                    System.out.println("Wat voor handleing gaat u verrichten?");
                    String handleing = scanner.nextLine();
                    plant3.nieuweHandeling(dag2, maand2, jaar2, handleing);
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                }
                break;
            default:
                System.out.println("Kies 1 t/m 3");
        }
    }

    public static void case3(Kas kas){
        int choicePlantInfo = MenuKeuzes.printPlantInfo();
        switch (choicePlantInfo) {
            case 0:
                return;
            case 1:
                try {
                    Plant plant = kas.getTargetPlant();
                    System.out.println(plant.getBenodigdhedenString());
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                }
                break;
            case 2:
                try {
                    Plant plant2 = kas.getTargetPlant();
                    System.out.println(plant2.getHandelingen());
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                }
                break;
            default:
                System.out.println("Kies 1 of 2");
        }
    }

    public static void case4(Kas kas){
        Scanner scanner = new Scanner(System.in);
        int choicePlantToevoegen = MenuKeuzes.printPlantToevoegen();
        switch (choicePlantToevoegen) {
            case 0:
                return;
            case 1:
                System.out.println("Wat is de naam van de bloem?");
                String naam = scanner.nextLine();
                System.out.println("Wat is de prijs om te groeien?");
                double prijs = scanner.nextDouble();
                System.out.println("Wat zijn de benodigdheden?");
                System.out.println("Voer de groei tijd in weken in:");
                int groeiTijdWeken = scanner.nextInt();
                System.out.println("Voer de nodige luchtvochtigheid in:");
                int luchtvochtigheid = scanner.nextInt();
                System.out.println("Voer de nodige temperatuur in:");
                int temperatuur = scanner.nextInt();
                System.out.println("Wat voor voeding krijgt de bloem?");
                System.out.println("Voer de Gro in ml in:");
                double gro = scanner.nextDouble();
                System.out.println("Voer de Mi-Gro in ml in:");
                double miGro = scanner.nextDouble();
                System.out.println("Voer de Bloom in ml in:");
                double bloom = scanner.nextDouble();
                Bloem bloem = new Bloem(naam, prijs, new Benodigdheden(groeiTijdWeken, luchtvochtigheid, temperatuur), new Voeding(gro, miGro, bloom));
                kas.addPlant(bloem);
                break;
            case 2:
                System.out.println("Wat is de naam van de groente?");
                String naam2 = scanner.nextLine();
                System.out.println("Wat is de prijs om te groeien?");
                double prijs2 = scanner.nextDouble();
                System.out.println("Wat zijn de benodigdheden?");
                System.out.println("Voer de groei tijd in weken in:");
                int groeiTijdWeken2 = scanner.nextInt();
                System.out.println("Voer de nodige luchtvochtigheid in:");
                int luchtvochtigheid2 = scanner.nextInt();
                System.out.println("Voer de nodige temperatuur in:");
                int temperatuur2 = scanner.nextInt();
                System.out.println("Wat voor voeding krijgt de groente?");
                System.out.println("Voer de Gro in ml in:");
                double gro2 = scanner.nextDouble();
                System.out.println("Voer de Mi-Gro in ml in:");
                double miGro2 = scanner.nextDouble();
                Groente groente = new Groente(naam2, prijs2, new Benodigdheden(groeiTijdWeken2, luchtvochtigheid2, temperatuur2), new Voeding(gro2, miGro2));
                kas.addPlant(groente);
                break;
            default:
                System.out.println("Kies 1 of 2");
        }
    }

    public static void case5(Kas kas){
        int choiceOogst = MenuKeuzes.printPlantOogst();
        switch (choiceOogst) {
            case 0:
                return;
            case 1:
                kas.getOogstenKas();
                break;
            case 2:
                System.out.println("De totale winst van " + kas.getKasNaam() + " is " + kas.getTotaleWinst() + ".");
                break;
            default:
                System.out.println("Kies 1 of 2");
        }
    }

    public static void case6(Kas kas){
        Scanner scanner = new Scanner(System.in);
        int choiceKasEigenaar = MenuKeuzes.printKasEigenaarHandelingen();
        switch (choiceKasEigenaar) {
            case 0:
                return;
            case 1:
                try {
                    Plant plant = kas.getTargetPlant();
                    System.out.println("Wat zijn de nieuwe benodigdheden?");
                    System.out.println("Voer de groei tijd in weken in:");
                    int groeiTijdWeken = scanner.nextInt();
                    System.out.println("Voer de nodige luchtvochtigheid in:");
                    int luchtvochtigheid = scanner.nextInt();
                    System.out.println("Voer de nodige temperatuur in:");
                    int temperatuur = scanner.nextInt();
                    try {
                        plant.getBenodigdheden().setBenodigdheden(groeiTijdWeken, luchtvochtigheid, temperatuur);
                    } catch (KasEigenaarNietIngelogdException e) {
                        System.out.println(e);
                    }
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                }
                break;
            case 2:
                try {
                    Plant plant2 = kas.getTargetPlant();
                    System.out.println("Wat voor nieuwe voeding krijgt de plant?");
                    System.out.println("Als de plant een bepaalde soort voeding niet krijgt vul dan 0 in");
                    System.out.println("Voer de Gro in ml in:");
                    double gro = scanner.nextDouble();
                    System.out.println("Voer de Mi-Gro in ml in:");
                    double miGro = scanner.nextDouble();
                    System.out.println("Voer de Bloom in ml in:");
                    double bloom = scanner.nextDouble();
                    try {
                        plant2.getVoeding().setVoeding(gro, miGro, bloom);
                    } catch (KasEigenaarNietIngelogdException e) {
                        System.out.println(e);
                    }
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                }
                break;
            case 3:
                System.out.println("Welke kas wilt u toevoegen?");
                String kasToevoegen = scanner.nextLine();
                if (KasEigenaar.getInstance().bezitDeKas(kasToevoegen)) {
                    System.out.println("De kas die u probeert tie te voegen is al in u bezit.");
                } else {
                    Kas nieuweKas = new Kas(kasToevoegen);
                    try {
                        KasEigenaar.getInstance().addKas(nieuweKas);
                    } catch (KasEigenaarNietIngelogdException e) {
                        System.out.println(e);
                    }
                }
                break;
            default:
                System.out.println("Kies 1 t/m 3");
        }
    }

}
