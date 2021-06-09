package com.company.Menu;


import com.company.DeKas.*;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.Exceptions.KasInBezitException;
import com.company.Exceptions.NietInDeKasException;
import com.company.KasEigenaar.KasEigenaar;
import com.company.Oogsten.OogstDePlantTesselaar;
import com.company.Oogsten.PrintOogsten;
import com.company.Oogsten.PrintPlanten;
import com.company.Planten.*;

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
                    new OogstDePlantTesselaar(kas).oogstPlantSoort(new MenuUserInput().case2_1(kas));
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 2:
                try {
                    new OogstDePlantTesselaar(kas).oogstPlantSoort(new MenuUserInput().case2_2(kas));
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 3:
                try {
                    new MenuUserInput().case2_3(kas);
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 4:
                try {
                    new MenuUserInput().case2_4(kas);
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 5:
                try {
                    Plant plant5 = new GetPlant(kas.getKasPlanten()).getTargetPlant(AskForInput.vraagNaamVanDePlant());
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

    public static void case3(Kas kas) {
        int choicePlantInfo = MenuKeuzes.printPlantInfo();
        switch (choicePlantInfo) {
            case 0:
                return;
            case 1:
                try {
                    Plant plant = new GetPlant(kas.getKasPlanten()).getTargetPlant(AskForInput.vraagNaamVanDePlant());
                    new PrintBenodigdheden(plant).printString();
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 2:
                try {
                    Plant plant2 = new GetPlant(kas.getKasPlanten()).getTargetPlant(AskForInput.vraagNaamVanDePlant());
                    new PrintHandelingen(plant2).printLijst();
                    System.out.println();
                } catch (NietInDeKasException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            case 3:
                try {
                    Plant plant3 = new GetPlant(kas.getKasPlanten()).getTargetPlant(AskForInput.vraagNaamVanDePlant());
                    System.out.println("De plant is in de groei voor " + plant3.getPlantLevensduur().getHuidigeGroeiTijdWeken() + " weken.");
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

    public static void case4(Kas kas) {
        int choicePlantToevoegen = MenuKeuzes.printPlantToevoegen();
        switch (choicePlantToevoegen) {
            case 0:
                return;
            case 1:
                kas.getKasPlanten().addPlant(new MenuUserInput().case4_1());
                System.out.println();
                break;
            case 2:

                kas.getKasPlanten().addPlant(new MenuUserInput().case4_2());
                System.out.println();
                break;
            default:
                System.out.println("Kies 1 of 2");
        }
    }

    public static void case5(Kas kas) {
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
                System.out.printf("De totale winst van " + kas.getKasNaam() + " is €%.2f\n", kas.getKasWinst().getTotaleWinst());
                System.out.println();
                break;
            default:
                System.out.println("Kies 1 t/m 3");
        }
    }

    public static void case6(Kas kas) {
        int choiceKasEigenaar = MenuKeuzes.printKasEigenaarHandelingen();
        switch (choiceKasEigenaar) {
            case 0:
                return;
            case 1:
                try {
                    try {
                        new MenuUserInput().case6_1(kas);
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
                    try {
                        new MenuUserInput().case6_2(kas);
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
                try {
                    try {
                        new MenuUserInput().case6_3(kas);
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
                try {
                    KasEigenaar.getInstance().getBezit().addKas(new MenuUserInput().case6_4());
                } catch (KasEigenaarNietIngelogdException | KasInBezitException e) {
                    System.out.println(e);
                    System.out.println();
                }
                break;
            default:
                System.out.println("Kies 1 t/m 3");
        }

    }

    public static Kas case9(Kas currentKas) {
        return new MenuUserInput().case9_0(currentKas);
    }
}
