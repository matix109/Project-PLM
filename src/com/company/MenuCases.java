package com.company;

import com.company.Exceptions.KasBestaatNietException;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.Exceptions.NietInDeKasException;

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
        }
    }

    public static void case2(Kas kas) {
        int choiceHendeling = MenuKeuzes.printHandelingKeuzes();
        switch (choiceHendeling) {
            case 0:
                return;
            case 1:
                try {
                    Plant plant = kas.getTargetPlant();
                    System.out.print("Wat is de hoeveelheid planten?: ");
                    int hoeveelheid = MenuKeuzes.vraagEenInt();
                    System.out.print("Wat is de prijs per stuk?: ");
                    double PPS = MenuKeuzes.vraagEenDouble();
                    System.out.print("Wat is de kwaliteit?(Goed/Algemeen/Slecht): ");
                    String kwaliteit = MenuKeuzes.vraagEenString();
                    kas.oogstPlantSoort(plant, hoeveelheid, PPS, kwaliteit);
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 2:
                try {
                    Plant plant2 = kas.getTargetPlant();
                    System.out.print("Voer de dag in: ");
                    int dag = MenuKeuzes.vraagEenInt();
                    System.out.print("Voer de maand in: ");
                    int maand = MenuKeuzes.vraagEenInt();
                    System.out.print("Voer het jaar in: ");
                    int jaar = MenuKeuzes.vraagEenInt();
                    plant2.geefVoeding(dag, maand, jaar);
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 3:
                try {
                    Plant plant3 = kas.getTargetPlant();
                    System.out.print("Voer de dag in: ");
                    int dag2 = MenuKeuzes.vraagEenInt();
                    System.out.print("Voer de maand in: ");
                    int maand2 = MenuKeuzes.vraagEenInt();
                    System.out.print("Voer het jaar in: ");
                    int jaar2 = MenuKeuzes.vraagEenInt();
                    System.out.print("Wat voor handleing gaat u verrichten?: ");
                    String handleing = MenuKeuzes.vraagEenString();
                    plant3.nieuweHandeling(dag2, maand2, jaar2, handleing);
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
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
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 2:
                try {
                    Plant plant2 = kas.getTargetPlant();
                    System.out.println(plant2.getHandelingen());
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            default:
                System.out.println("Kies 1 of 2");
        }
    }

    public static void case4(Kas kas){
        int choicePlantToevoegen = MenuKeuzes.printPlantToevoegen();
        switch (choicePlantToevoegen) {
            case 0:
                return;
            case 1:
                System.out.print("Wat is de naam van de bloem?: ");
                String naam = MenuKeuzes.vraagEenString();
                System.out.print("Wat is de prijs om te groeien?: ");
                double prijs = MenuKeuzes.vraagEenDouble();
                System.out.println("Wat zijn de benodigdheden?");
                System.out.print("Voer de groei tijd in weken in: ");
                int groeiTijdWeken = MenuKeuzes.vraagEenInt();
                System.out.print("Voer de nodige luchtvochtigheid in(%): ");
                int luchtvochtigheid = MenuKeuzes.vraagEenInt();
                System.out.print("Voer de nodige temperatuur in(°C): ");
                int temperatuur = MenuKeuzes.vraagEenInt();
                System.out.println("Wat voor voeding krijgt de bloem?");
                System.out.print("Voer de Gro in ml in: ");
                double gro = MenuKeuzes.vraagEenDouble();
                System.out.print("Voer de Mi-Gro in ml in: ");
                double miGro = MenuKeuzes.vraagEenDouble();
                System.out.print("Voer de Bloom in ml in: ");
                double bloom = MenuKeuzes.vraagEenDouble();
                Bloem bloem = new Bloem(naam, prijs, new Benodigdheden(groeiTijdWeken, luchtvochtigheid, temperatuur), new Voeding(gro, miGro, bloom));
                kas.addPlant(bloem);
                System.out.println();
                break;
            case 2:
                System.out.print("Wat is de naam van de groente?: ");
                String naam2 = MenuKeuzes.vraagEenString();
                System.out.print("Wat is de prijs om te groeien?: ");
                double prijs2 = MenuKeuzes.vraagEenDouble();
                System.out.println("Wat zijn de benodigdheden?");
                System.out.print("Voer de groei tijd in weken in: ");
                int groeiTijdWeken2 = MenuKeuzes.vraagEenInt();
                System.out.print("Voer de nodige luchtvochtigheid in(%): ");
                int luchtvochtigheid2 = MenuKeuzes.vraagEenInt();
                System.out.print("Voer de nodige temperatuur in(°C): ");
                int temperatuur2 = MenuKeuzes.vraagEenInt();
                System.out.println("Wat voor voeding krijgt de groente?");
                System.out.print("Voer de Gro in ml in: ");
                double gro2 = MenuKeuzes.vraagEenDouble();
                System.out.print("Voer de Mi-Gro in ml in: ");
                double miGro2 = MenuKeuzes.vraagEenDouble();
                Groente groente = new Groente(naam2, prijs2, new Benodigdheden(groeiTijdWeken2, luchtvochtigheid2, temperatuur2), new Voeding(gro2, miGro2));
                kas.addPlant(groente);
                System.out.println();
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
                System.out.println();
                break;
            case 2:
                System.out.println("De totale winst van " + kas.getKasNaam() + " is €" + kas.getTotaleWinst() + ".");
                System.out.println();
                break;
            default:
                System.out.println("Kies 1 of 2");
        }
    }

    public static void case6(Kas kas){
        int choiceKasEigenaar = MenuKeuzes.printKasEigenaarHandelingen();
        switch (choiceKasEigenaar) {
            case 0:
                return;
            case 1:
                try {
                    Plant plant = kas.getTargetPlant();
                    System.out.println("Wat zijn de nieuwe benodigdheden?");
                    System.out.print("Voer de groei tijd in weken in: ");
                    int groeiTijdWeken = MenuKeuzes.vraagEenInt();
                    System.out.print("Voer de nodige luchtvochtigheid in(%): ");
                    int luchtvochtigheid = MenuKeuzes.vraagEenInt();
                    System.out.print("Voer de nodige temperatuur in(°C): ");
                    int temperatuur = MenuKeuzes.vraagEenInt();
                    System.out.println();
                    try {
                        plant.getBenodigdheden().setBenodigdheden(groeiTijdWeken, luchtvochtigheid, temperatuur);
                    } catch (KasEigenaarNietIngelogdException e) {
                        System.out.println(e);
                        System.out.println();
                    }
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 2:
                try {
                    Plant plant2 = kas.getTargetPlant();
                    System.out.println("Wat voor nieuwe voeding krijgt de plant?");
                    System.out.println("Als de plant een bepaalde soort voeding niet krijgt vul dan 0 in.");
                    System.out.print("Voer de Gro in ml in: ");
                    double gro = MenuKeuzes.vraagEenDouble();
                    System.out.print("Voer de Mi-Gro in ml in: ");
                    double miGro = MenuKeuzes.vraagEenDouble();
                    System.out.print("Voer de Bloom in ml in: ");
                    double bloom = MenuKeuzes.vraagEenDouble();
                    System.out.println();
                    try {
                        plant2.getVoeding().setVoeding(gro, miGro, bloom);
                    } catch (KasEigenaarNietIngelogdException e) {
                        System.out.println(e);
                        System.out.println();
                    }
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Welke kas wilt u toevoegen?");
                String kasToevoegen = MenuKeuzes.vraagEenString();
                if (KasEigenaar.getInstance().bezitDeKas(kasToevoegen)) {
                    System.out.println("De kas die u probeert tie te voegen is al in u bezit.");
                    System.out.println();
                } else {
                    Kas nieuweKas = new Kas(kasToevoegen);
                    System.out.println();
                    try {
                        KasEigenaar.getInstance().addKas(nieuweKas);
                    } catch (KasEigenaarNietIngelogdException e) {
                        System.out.println(e);
                        System.out.println();
                    }
                }
                break;
            default:
                System.out.println("Kies 1 t/m 3");
        }
    }

    public static Kas case9(Kas currentKas) {
        if (Login.getInstance().kasEigenaarIngelogd()) {
            System.out.print("Voer de naam van de kas in die u wilt beheren: ");
            String kasString = MenuKeuzes.vraagEenString();
            try {
                if (KasEigenaar.getInstance().bezitDeKas(kasString)) {
                    return currentKas = KasEigenaar.getInstance().getKasInBezit(kasString);
                } else {
                    System.out.println("Niet in bezit van de kas.");
                }
            } catch (KasBestaatNietException e) {
                System.out.println(e);
                System.out.println();
            }
        } else {
            System.out.println("De kas eigenaar is niet ingelogd. Log eerst in om kas te switchen");
        }
        return currentKas;
    }
}
