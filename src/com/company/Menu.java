package com.company;

import com.company.Exceptions.KasBestaatNietException;

public class Menu {

        public static void printMenu(Kas kas) {
            Kas currentKas = kas;
            int choice = 1;
            while (choice != 0) {
                choice = MenuKeuzes.printKeuzes();
                switch (choice) {
                    case 0:
                        return;
                    case 1:
                        MenuCases.case1(currentKas);
                        break;
                    case 2:
                       MenuCases.case2(currentKas);
                        break;
                    case 3:
                        MenuCases.case3(currentKas);
                        break;
                    case 4:
                        MenuCases.case4(currentKas);
                        break;
                    case 5:
                        MenuCases.case5(currentKas);
                        break;
                    case 6:
                        MenuCases.case6(currentKas);
                        break;
                    case 7:
                        if(Login.getInstance().kasEigenaarIngelogd()){
                            System.out.println("De kas eigenaar is al ingelogd.");
                            System.out.println();
                        }
                        else {
                            Login.getInstance().Inloggen();
                        }
                        break;
                    case 8:
                        KasEigenaar.maakAccount();
                        break;
                    case 9:
                        currentKas = MenuCases.case9(currentKas);
                        break;
                    default:
                        System.out.println("Kies cijfer 1 t/m 8 of 0");
                }
            }
        }

    }
