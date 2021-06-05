package com.company.Menu;

import com.company.*;
import com.company.DeKas.*;
import com.company.Exceptions.KasBestaatNietException;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.Exceptions.NietInDeKasException;
import com.company.Factory.TesselaarOogstFactory;
import com.company.Factory.TesselaarOogstMetParadijsBerekeningFactory;
import com.company.KasEigenaar.KasBezitControle;
import com.company.KasEigenaar.KasEigenaar;
import com.company.KasEigenaar.Login;
import com.company.Oogsten.PrintOogsten;
import com.company.Oogsten.PrintPlanten;
import com.company.Oogsten.TesselaarOogst;
import com.company.Planten.*;
import com.company.VoedingPlanten.BloemVoeding;
import com.company.VoedingPlanten.GeefPlantVoeding;
import com.company.VoedingPlanten.GroenteVoeding;

public class MenuCases { // bij de cases die alleen een nummer returnen ff een string toevoegen zodat het voor de user duidelijk is.
    public static void case1(Kas kas) {
        int choicelijst = MenuKeuzes.printLijstKeuzes();
        switch (choicelijst) {
            case 0:
                return;
            case 1:
                new PrintPlanten(kas).printPlantenLijst();
                System.out.println();
                break;
            case 2:
                System.out.print("In de kas staan ");
                new PrintPlanten(kas).printHoeveelheidPlanten();
                System.out.println(" planten.");
                System.out.println();
                break;
            default:
                System.out.println("Kies 1,2 of 0");
        }
    }

    public static void case2(Kas kas) {
        int choiceHendeling = MenuKeuzes.printHandelingKeuzes();
        switch (choiceHendeling) {
            case 0:
                return;
            case 1:
                try {
                    Plant plant = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    System.out.print("Wat is de hoeveelheid planten?: ");
                    int hoeveelheid = AskForInput.vraagEenInt();
                    System.out.print("Wat is de prijs per stuk?(€): ");
                    double PPS = AskForInput.vraagEenDouble();
                    System.out.print("Wat is de kwaliteit?(Goed/Algemeen/Slecht): ");
                    String kwaliteit = AskForInput.vraagEenString();
                    kas.getKasOogsten().oogstPlantSoort(new TesselaarOogst(plant, hoeveelheid, PPS, kwaliteit,new TesselaarOogstFactory()));
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 2:
                try {
                    Plant plant2 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    System.out.print("Wat is de hoeveelheid planten?: ");
                    int hoeveelheid = AskForInput.vraagEenInt();
                    System.out.print("Wat is de prijs per stuk?(€): ");
                    double PPS = AskForInput.vraagEenDouble();
                    System.out.print("Wat is de kwaliteit?(Uitstekend/Matig/Bedorven): ");
                    String kwaliteit = AskForInput.vraagEenString();
                    kas.getKasOogsten().oogstPlantSoort(new TesselaarOogst(plant2, hoeveelheid, PPS, kwaliteit,new TesselaarOogstMetParadijsBerekeningFactory()));
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 3:
                try {
                    Plant plant3 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    System.out.print("Voer de dag in: ");
                    int dag = AskForInput.vraagEenInt();
                    System.out.print("Voer de maand in: ");
                    int maand = AskForInput.vraagEenInt();
                    System.out.print("Voer het jaar in: ");
                    int jaar = AskForInput.vraagEenInt();
                    new GeefPlantVoeding(plant3).geefVoeding(new Datum(dag, maand, jaar));
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 4:
                try {
                    Plant plant4 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    System.out.print("Voer de dag in: ");
                    int dag2 = AskForInput.vraagEenInt();
                    System.out.print("Voer de maand in: ");
                    int maand2 = AskForInput.vraagEenInt();
                    System.out.print("Voer het jaar in: ");
                    int jaar2 = AskForInput.vraagEenInt();
                    System.out.print("Wat voor handleing gaat u verrichten?: ");
                    String handleing = AskForInput.vraagEenString();
                    plant4.getHandelingen().newHandeling(new Datum(dag2, maand2, jaar2), handleing);
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 5:
                try {
                    Plant plant5 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    plant5.getPlantLevensduur().volgendeWeek();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            default:
                System.out.println("Kies 1 t/m 4");
        }
    }

    public static void case3(Kas kas){
        int choicePlantInfo = MenuKeuzes.printPlantInfo();
        switch (choicePlantInfo) {
            case 0:
                return;
            case 1:
                try {
                    Plant plant = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    new PrintBenodigdheden(plant).printString();
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 2:
                try {
                    Plant plant2 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    new PrintHandelingen(plant2).printLijst();
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 3:
                try {
                    Plant plant3 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    System.out.println("De plant is in de groei voor "+plant3.getPlantLevensduur().getHuidigeGroeiTijdWeken()+" weken.");
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

    public static void case4(Kas kas){
        int choicePlantToevoegen = MenuKeuzes.printPlantToevoegen();
        switch (choicePlantToevoegen) {
            case 0:
                return;
            case 1:
                System.out.print("Wat is de naam van de bloem?: ");
                String naam = AskForInput.vraagEenString();
                System.out.print("Wat is de prijs om te groeien?(€): ");
                double prijs = AskForInput.vraagEenDouble();
                System.out.println("Wat zijn de benodigdheden?");
                System.out.print("Voer de groei tijd in weken in: ");
                int groeiTijdWeken = AskForInput.vraagEenInt();
                System.out.print("Voer de nodige luchtvochtigheid in(%): ");
                int luchtvochtigheid = AskForInput.vraagEenInt();
                System.out.print("Voer de nodige temperatuur in(°C): ");
                int temperatuur = AskForInput.vraagEenInt();
                System.out.println("Wat voor voeding krijgt de bloem?");
                System.out.print("Voer de Gro in ml in: ");
                double gro = AskForInput.vraagEenDouble();
                System.out.print("Voer de Mi-Gro in ml in: ");
                double miGro = AskForInput.vraagEenDouble();
                System.out.print("Voer de Bloom in ml in: ");
                double bloom = AskForInput.vraagEenDouble();
                kas.getKasPlanten().addPlant(new Bloem(naam, prijs, new Benodigdheden(groeiTijdWeken, luchtvochtigheid, temperatuur), new BloemVoeding(gro, miGro, bloom)));

                System.out.println();
                break;
            case 2:
                System.out.print("Wat is de naam van de groente?: ");
                String naam2 = AskForInput.vraagEenString();
                System.out.print("Wat is de prijs om te groeien?(€): ");
                double prijs2 = AskForInput.vraagEenDouble();
                System.out.println("Wat zijn de benodigdheden?");
                System.out.print("Voer de groei tijd in weken in: ");
                int groeiTijdWeken2 = AskForInput.vraagEenInt();
                System.out.print("Voer de nodige luchtvochtigheid in(%): ");
                int luchtvochtigheid2 = AskForInput.vraagEenInt();
                System.out.print("Voer de nodige temperatuur in(°C): ");
                int temperatuur2 = AskForInput.vraagEenInt();
                System.out.println("Wat voor voeding krijgt de groente?");
                System.out.print("Voer de Gro in ml in: ");
                double gro2 = AskForInput.vraagEenDouble();
                System.out.print("Voer de Mi-Gro in ml in: ");
                double miGro2 = AskForInput.vraagEenDouble();
                kas.getKasPlanten().addPlant(new Groente(naam2, prijs2, new Benodigdheden(groeiTijdWeken2, luchtvochtigheid2, temperatuur2), new GroenteVoeding(gro2, miGro2)));
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
                new PrintOogsten(kas).printOogstenKas();
                System.out.println();
                break;
            case 2:
                System.out.print("In totaal zijn er ");
                new PrintOogsten(kas).printHoeveelheidSoortenOogst();
                System.out.println(" oogsten");
                System.out.println();
                break;
            case 3:
                System.out.printf("De totale winst van " + kas.getKasNaam() + " is €%.2f\n",kas.getKasWinst().getTotaleWinst());
                System.out.println();
                break;
            default:
                System.out.println("Kies 1 t/m 3");
        }
    }

    public static void case6(Kas kas){
        int choiceKasEigenaar = MenuKeuzes.printKasEigenaarHandelingen();
        switch (choiceKasEigenaar) {
            case 0:
                return;
            case 1:
                try{
                Plant plant = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                System.out.println("Wat zijn de nieuwe benodigdheden?");
                System.out.print("Voer de groei tijd in weken in: ");
                int groeiTijdWeken = AskForInput.vraagEenInt();
                System.out.print("Voer de nodige luchtvochtigheid in(%): ");
                int luchtvochtigheid = AskForInput.vraagEenInt();
                System.out.print("Voer de nodige temperatuur in(°C): ");
                int temperatuur = AskForInput.vraagEenInt();
                System.out.println();
                try {
                    plant.getBenodigdheden().setBenodigdheden(groeiTijdWeken, luchtvochtigheid, temperatuur);
                        System.out.println();
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
                try{
                Plant plant2 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                try {
                        System.out.println("Wat voor voeding krijgt de bloem?");
                        System.out.print("Voer de Gro in ml in: ");
                        double Gro = AskForInput.vraagEenDouble();
                        System.out.print("Voer de Mi-Gro in ml in: ");
                        double MiGro = AskForInput.vraagEenDouble();
                        System.out.print("Voer de Bloom in ml in: ");
                        double Bloom = AskForInput.vraagEenDouble();
                        System.out.println();
                        plant2.getVoeding().setVoeding(Gro,MiGro,Bloom);
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
                try{
                    Plant plant3 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    try {
                        System.out.println("Wat voor voeding krijgt de Groente?");
                        System.out.print("Voer de Gro in ml in: ");
                        double Gro = AskForInput.vraagEenDouble();
                        System.out.print("Voer de Mi-Gro in ml in: ");
                        double MiGro = AskForInput.vraagEenDouble();
                        System.out.println();
                        plant3.getVoeding().setVoeding(Gro,MiGro,0);
                    } catch (KasEigenaarNietIngelogdException e) {
                        System.out.println(e);
                        System.out.println();
                    }
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Welke kas wilt u toevoegen?");
                String kasToevoegen = AskForInput.vraagEenString();
                if (new KasBezitControle(KasEigenaar.getInstance().getBezit()).bezitDeKas(kasToevoegen)) {
                    System.out.println("De kas die u probeert tie te voegen is al in u bezit.");
                    System.out.println();
                } else {
                    Kas nieuweKas = new Kas(kasToevoegen);
                    System.out.println();
                    try {
                        KasEigenaar.getInstance().getBezit().addKas(nieuweKas);
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
            String kasString = AskForInput.vraagEenString();
            try {
                if (new KasBezitControle(KasEigenaar.getInstance().getBezit()).bezitDeKas(kasString)) {
                    return currentKas = new KasBezitControle(KasEigenaar.getInstance().getBezit()).getKasInBezit(kasString);
                } else {
                    System.out.println("Niet in bezit van de kas.");
                }
            } catch (KasBestaatNietException e) {
                System.out.println(e);
                System.out.println();
            }
        } else {
            System.out.println("De kas eigenaar is niet ingelogd. Log eerst in om kas te switchen van kas.");
        }
        return currentKas;
    }
}
