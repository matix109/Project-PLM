package com.company;

public class Menu {

        public static void printMenu(Kas kas) {
            int choice = 1;
            while (choice != 0) {
                choice = MenuKeuzes.printKeuzes();
                switch (choice) {
                    case 0:
                        return;
                    case 1:
                        MenuCases.case1(kas);
                        break;
                    case 2:
                       MenuCases.case2(kas);
                        break;
                    case 3:
                        MenuCases.case3(kas);
                        break;
                    case 4:
                        MenuCases.case4(kas);
                        break;
                    case 5:
                        MenuCases.case5(kas);
                        break;
                    case 6:
                        MenuCases.case6(kas);
                        break;
                    case 7:
                        if(Login.getInstance().kasEigenaarIngelogd()){
                            System.out.println("De kas eigenaar is al ingelogd.");
                        }
                        else {
                            Login.getInstance().Inloggen();
                        }
                        break;
                    case 8:
                        KasEigenaar.maakAccount();
                        break;
                    default:
                        System.out.println("Kies cijfer 1 t/m 8 of 0");
                }
            }
        }

    }
