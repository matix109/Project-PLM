package com.company.Menu;

import com.company.*;
import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.DeKas.PrintOogsten;
import com.company.DeKas.PrintPlanten;
import com.company.Exceptions.KasBestaatNietException;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.Exceptions.NietInDeKasException;
import com.company.Factory.PlantenFactory;
import com.company.KasEigenaar.KasBezitControle;
import com.company.KasEigenaar.KasEigenaar;
import com.company.KasEigenaar.Login;
import com.company.Planten.*;
import com.company.VoedingPlanten.GeefPlantVoeding;

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
                new PrintPlanten(kas).printHoeveelheidPlanten();
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
                    kas.getKasOogsten().oogstPlantSoort();
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 2:
                try {
                    new GeefPlantVoeding(kas).geefVoeding();
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 3:
                try {
                    Plant plant1 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    plant1.getHandelingen().newHandeling();
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 4:
                try {
                    Plant plant2 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    plant2.getPlantLevensduur().volgendeWeek();
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
                    new PrintBenodigdheden(kas).printString();
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 2:
                try {
                    new PrintHandelingen(kas).printLijst();
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 3:
                try {
                    Plant plant3 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    System.out.println(plant3.getPlantLevensduur().getHuidigeGroeiTijdWeken());
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
                kas.getKasPlanten().addPlant(PlantenFactory.Bloem_Factory.maakPlant());
                System.out.println();
                break;
            case 2:
                kas.getKasPlanten().addPlant(PlantenFactory.Groente_Factory.maakPlant());
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
                System.out.println("De totale winst van " + kas.getKasNaam() + " is €" + kas.getKasWinst().getTotaleWinst() + ".");
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
                try {
                    Plant plant = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    try {
                        plant.getBenodigdheden().setBenodigdheden();
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
                try {
                    Plant plant2 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
                    try {
                        plant2.getSoortVoeding().setVoeding();
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
            case 3:
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
            System.out.println("De kas eigenaar is niet ingelogd. Log eerst in om kas te switchen");
        }
        return currentKas;
    }
}
