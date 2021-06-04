package com.company;

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
}
