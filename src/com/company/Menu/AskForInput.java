package com.company.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AskForInput {

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

    public static String vraagNaamVanDePlant(){
        System.out.print("Voer de naam van de plant in:");
        return vraagEenString();
    }
    public static int vraagDeHoeveelheidPlanten(){
        System.out.print("Wat is de hoeveelheid planten?: ");
        return vraagEenInt();
    }
    public static double vraagDePPS(){
        System.out.print("Wat is de prijs per stuk?(€): ");
        return vraagEenDouble();
    }

    public static int vraagDeDag(){
        System.out.print("Voer de dag in: ");
        return vraagEenInt();
    }

    public static int vraagDeMaand(){
        System.out.print("Voer de maand in: ");
        return vraagEenInt();
    }

    public static int vraagHetJaar(){
        System.out.print("Voer het jaar in: ");
        return vraagEenInt();
    }

    public static double vraagDePrijsOmTeGroeien(){
        System.out.print("Wat is de prijs om te groeien?(€): ");
        return vraagEenDouble();
    }

    public static int vraagDeGroeiTijdWeken(){
        System.out.print("Voer de groei tijd in weken in: ");
        return vraagEenInt();
    }

    public static int vraagDeLuchtvochtigheid(){
        System.out.print("Voer de nodige luchtvochtigheid in(%): ");
        return vraagEenInt();
    }

    public static int vraagDeTemperatuur(){
        System.out.print("Voer de nodige temperatuur in(°C): ");
        return vraagEenInt();
    }

    public static double vraagDeGro(){
        System.out.print("Voer de Gro in ml in: ");
        return vraagEenDouble();
    }

    public static double vraagDeMi_Gro(){
        System.out.print("Voer de Mi-Gro in ml in: ");
        return vraagEenDouble();
    }

    public static double vraagDeBloom(){
        System.out.print("Voer de Bloom in ml in: ");
        return vraagEenDouble();
    }

}
