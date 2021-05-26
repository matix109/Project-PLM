package com.company;


import com.company.Exceptions.KasBestaatNietException;
import com.company.Exceptions.KasEigenaarNietIngelogdException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kas kas = new Kas("kas");
        Groente wortel = new Groente("Wortel", 0.20, new Benodigdheden(7, 60, 21), new Voeding(3, 4));
        Groente aardappel = new Groente("Aardappel", 0.20, new Benodigdheden(7, 60, 21), new Voeding(3, 4));
        Groente courgette = new Groente("Courgette", 0.20, new Benodigdheden(7, 60, 21), new Voeding(3, 4));
        Bloem madeliefje = new Bloem("Madeliefje", 0.20, new Benodigdheden(7, 60, 21), new Voeding(3, 4, 6));
        Bloem tulp = new Bloem("Tulp", 0.20, new Benodigdheden(7, 60, 21), new Voeding(3, 4, 6));

        kas.addPlant(wortel);
        kas.addPlant(aardappel);
        kas.addPlant(courgette);
        kas.addPlant(madeliefje);
        kas.addPlant(tulp);

        wortel.setHuidigeGroeiTijdWeken(7);
        aardappel.setHuidigeGroeiTijdWeken(7);
        courgette.setHuidigeGroeiTijdWeken(7);
        madeliefje.setHuidigeGroeiTijdWeken(7);
        tulp.setHuidigeGroeiTijdWeken(7);

/*        System.out.println(kas.getHoeveelheidGroentes());*/
/*        kas.getGroenteLijst();*/
        System.out.println();
        kas.getPlantenLijst();
        System.out.println();
/*        kas.getBloemenLijst();*/
        System.out.println();
        System.out.println(kas.getHoeveelheidPlanten());
/*        System.out.println(kas.getHoeveelheidBloemen());*/
        courgette.nieuweHandeling(1, 9, 1999, "Blaadjes geaaid");
        courgette.nieuweHandeling(2, 9, 1999, "Blaadjes geaaid x 2");
        wortel.nieuweHandeling(9, 11, 1999, "de blaadjes onderhouden");
        aardappel.nieuweHandeling(11, 9, 1999, "Bol geaaid");
        System.out.println(courgette.getHandelingen());
        System.out.println(aardappel.getHandelingen());
        System.out.println(aardappel.getPrijsOmTeGroeien());
        System.out.println(aardappel.getBenodigdhedenString());
        System.out.println(wortel.getHandelingen());
        System.out.println(madeliefje.getBenodigdhedenString());
        madeliefje.geefVoeding(11, 12, 1999);
        System.out.println(madeliefje.getVoeding().getStringVoeding());
        madeliefje.nieuweHandeling(11, 12, 2000, "Blaadjes controleren");
        System.out.println(madeliefje.getHandelingen());
        System.out.println(courgette.getHandelingen());
        courgette.geefVoeding(20, 20, 1999);
        madeliefje.geefVoeding(11, 12, 1999);
        System.out.println(courgette.getHandelingen());
        System.out.println(madeliefje.getHandelingen());
        System.out.println(kas.getHoeveelheidPlanten());
/*        kas.getGroenteLijst();*/
        System.out.println(kas.getTotaleWinst());
/*        Oogst oogst = new Oogst(courgette,2,3,"algemeen");
        Oogst madeliefjeOogst = new Oogst(madeliefje,2,5.50,"algemeen");*/
        System.out.println(kas.getTotaleWinst());
        System.out.println(kas.getTotaleWinst());
        Kas kas2 = new Kas("kas");
        System.out.println(kas2.getTotaleWinst());
        kas.getPlantenLijst();
        System.out.println();
/*        kas.getGroenteLijst();*/
        System.out.println();
/*        kas.getBloemenLijst();*/
        System.out.println();
        //kas.oogstPlantSoort(aardappel,10,0.50,"algemeen");
        System.out.println();
        //kas.oogstPlantSoort(madeliefje,1,2.50,"algemeen");
        System.out.println();
        kas.getPlantenLijst();
        System.out.println();
/*        kas.getGroenteLijst();*/
        System.out.println();
/*        kas.getBloemenLijst();*/
        System.out.println();
        kas.getOogstenKas();
        System.out.println();
        System.out.println(kas.getTotaleWinst());
        courgette.nieuweHandeling(1, 1, 1999, "Testertje");
        System.out.println(courgette.getHandelingen());
        System.out.println(wortel.getHandelingen());
        System.out.println(madeliefje.getBenodigdhedenString());
/*        kas.getBloemenLijst();*/
        System.out.println(madeliefje.getHandelingen());
        System.out.println(kas.getTotaleWinst());
        System.out.println(courgette.getHandelingen());
        kas.oogstPlantSoort(courgette, 10, 1, "Algemeen");
        System.out.println(kas.getTotaleWinst());
        System.out.println(courgette.getBenodigdhedenString());
        System.out.println(courgette.getBenodigdheden().getGroeiTijdWeken());
        System.out.println(courgette.getHandelingen());
        System.out.println(madeliefje.getNaam());
        madeliefje.setNaam("Moodeliefje");
/*        kas.getBloemenLijst();
        kas.getBloemenLijst();*/
        System.out.println();
        Plant astronemeria = new Bloem("Astronemeria", 0.31, new Benodigdheden(7, 60, 21), new Voeding(3, 4, 6));
        kas.addPlant(astronemeria);
        astronemeria.setHuidigeGroeiTijdWeken(6);
        astronemeria.volgendeWeek();
        astronemeria.volgendeWeek();
        astronemeria.geefVoeding(1, 1, 2021);
        System.out.println();
        kas.getPlantenLijst();
        System.out.println();
/*        kas.getBloemenLijst();*/
        System.out.println();
//        kas.getGroenteLijst();
/*        System.out.println(kas.getHoeveelheidBloemen());
        System.out.println(kas.getHoeveelheidGroentes());*/
        System.out.println(kas.getHoeveelheidPlanten());
        System.out.println(kas.getTotaleWinst());
        kas.oogstPlantSoort(astronemeria, 10, 4, "Goed");
        kas.getOogstenKas();
        System.out.println(kas.getTotaleWinst());
        System.out.println(kas.getHoeveelheidSoortenOogst());
        System.out.println(madeliefje.getHandelingen());
        kas.getOogstenKas();
        madeliefje.nieuweHandeling(1, 1, 2021, "Test nieuwe aanpassingen");
        madeliefje.nieuweHandeling(1, 1, 2021, "Test nieuwe aanpassingen2");
        System.out.println("Kijk hier");
        // kas.oogstPlantSoort(madeliefje,2,2,"Goed");
        System.out.println(courgette.getHandelingen());
        System.out.println(wortel.getHandelingen());
        System.out.println(madeliefje.getHandelingen());
        System.out.println(kas.getTotaleWinst());
        System.out.println(madeliefje.getHoeveelheidHandelingen());
        kas.getOogstenKas();
        System.out.println(madeliefje.getBenodigdhedenString());
        System.out.println(madeliefje.getHandelingen());
        madeliefje.geefVoeding(1, 1, 2021);
        System.out.println("");
        System.out.println(madeliefje.getHandelingen());

        // Hier zou ik eiggenlijk gegevens willen opvragen uit de database over de kas eigenaar.
        //Zodat ik dit niet hoef te doen...
        KasEigenaar.maakAccount();
        Login.getInstance().Inloggen();
        try {
            KasEigenaar.getInstance().addKas(kas);
        } catch (KasEigenaarNietIngelogdException e) {
            System.out.println(e);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("In welke kas werkt u?");
        String kasString = scanner.nextLine();
        try {
            Kas currentkas = KasEigenaar.getInstance().getKasInBezit(kasString);
            if (KasEigenaar.getInstance().bezitDeKas(currentkas.getKasNaam())) {
                int verder = 1;
                while (verder != 0) {
                    Menu.printMenu(currentkas);
                    System.out.println("Wilt u echt stoppen?");
                    System.out.println("1) Nee");
                    System.out.println("0) Stoppen");
                    verder = MenuKeuzes.vraagEenInt();
                }

            }
        } catch (KasBestaatNietException e) {
            System.out.println(e);
            System.out.println("Controleer de kas naam en probeer opnieuw.");
        }
    }
}
