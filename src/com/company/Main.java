package com.company;

import com.company.DeKas.Kas;
import com.company.DeKas.PrintOogsten;
import com.company.DeKas.PrintPlanten;
import com.company.Exceptions.KasBestaatNietException;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.KasEigenaar.KasBezitControle;
import com.company.KasEigenaar.KasEigenaar;
import com.company.KasEigenaar.Login;
import com.company.Menu.Menu;
import com.company.Planten.*;
import com.company.VoedingPlanten.BloemVoeding;
import com.company.VoedingPlanten.GeefPlantVoeding;
import com.company.VoedingPlanten.GroenteVoeding;


public class Main {
    public static void main(String[] args){
        Kas kas = new Kas("kas");
        Groente wortel = new Groente("Wortel", 0.20, new Benodigdheden(7, 60, 21), new GroenteVoeding(3, 4));
        Groente aardappel = new Groente("Aardappel", 0.20, new Benodigdheden(7, 60, 21), new GroenteVoeding(3, 4));
        Groente courgette = new Groente("Courgette", 0.20, new Benodigdheden(7, 60, 21), new GroenteVoeding(3, 4));
        Bloem madeliefje = new Bloem("Madeliefje", 0.20, new Benodigdheden(7, 60, 21), new BloemVoeding(3, 4, 6));
        Bloem tulp = new Bloem("Tulp", 0.20, new Benodigdheden(7, 60, 21), new BloemVoeding(3, 4, 6));


        kas.getKasPlanten().addPlant(wortel);
        kas.getKasPlanten().addPlant(aardappel);
        kas.getKasPlanten().addPlant(courgette);
        kas.getKasPlanten().addPlant(madeliefje);
        kas.getKasPlanten().addPlant(tulp);

        wortel.getPlantLevensduur().setHuidigeGroeiTijdWeken(7);
        aardappel.getPlantLevensduur().setHuidigeGroeiTijdWeken(7);
        courgette.getPlantLevensduur().setHuidigeGroeiTijdWeken(7);
        madeliefje.getPlantLevensduur().setHuidigeGroeiTijdWeken(7);
        tulp.getPlantLevensduur().setHuidigeGroeiTijdWeken(7);

        /*        System.out.println(kas.getHoeveelheidGroentes());*/
        /*        kas.getGroenteLijst();*/
        System.out.println();
        new PrintPlanten(kas.getKasPlanten()).printPlantenLijst();
        System.out.println();
        /*        kas.getBloemenLijst();*/
        System.out.println();
        new PrintPlanten(kas.getKasPlanten()).printHoeveelheidPlanten();
        /*        System.out.println(kas.getHoeveelheidBloemen());*/
        courgette.getHandelingen().newHandeling(2,9,1999,"Blaadjes geaaid x 2");
        courgette.getHandelingen().newHandeling(2, 9, 1999, "Blaadjes geaaid x 2");
        wortel.getHandelingen().newHandeling(9, 11, 1999, "de blaadjes onderhouden");
        aardappel.getHandelingen().newHandeling(11, 9, 1999, "Bol geaaid");
        System.out.println();
        new PrintHandelingen(tulp).printLijst();
        System.out.println(aardappel.getPrijsOmTeGroeien());
        System.out.println("Plantensoort "+aardappel.getNaam()+aardappel.getBenodigdheden().toString()+aardappel.getVoeding().getStringVoeding());
        new PrintHandelingen(wortel).printLijst();
        System.out.println("Plantensoort "+madeliefje.getNaam()+madeliefje.getBenodigdheden().toString()+madeliefje.getVoeding().getStringVoeding());
        new GeefPlantVoeding(madeliefje).geefVoeding(11, 12, 1999);
        System.out.println(madeliefje.getVoeding().getStringVoeding());
        madeliefje.getHandelingen().newHandeling(11, 12, 2000, "Blaadjes controleren");
        new PrintHandelingen(madeliefje).printLijst();
        new PrintHandelingen(courgette).printLijst();
        new GeefPlantVoeding(courgette).geefVoeding(20, 20, 1999);
        new GeefPlantVoeding(madeliefje).geefVoeding(11, 12, 1999);
        new PrintHandelingen(courgette).printLijst();
        new PrintHandelingen(madeliefje).printLijst();
        new PrintPlanten(kas.getKasPlanten()).printHoeveelheidPlanten();
        /*        kas.getGroenteLijst();*/
        System.out.println(kas.getKasWinst().getTotaleWinst());
/*        Oogst oogst = new Oogst(courgette,2,3,"algemeen");
        Oogst madeliefjeOogst = new Oogst(madeliefje,2,5.50,"algemeen");*/
        System.out.println(kas.getKasWinst().getTotaleWinst());
        System.out.println(kas.getKasWinst().getTotaleWinst());
        Kas kas2 = new Kas("kas");
        System.out.println(kas2.getKasWinst().getTotaleWinst());
        new PrintPlanten(kas.getKasPlanten()).printPlantenLijst();
        System.out.println();
        /*        kas.getGroenteLijst();*/
        System.out.println();
        /*        kas.getBloemenLijst();*/
        System.out.println();
        //kas.oogstPlantSoort(aardappel,10,0.50,"algemeen");
        System.out.println();
        //kas.oogstPlantSoort(madeliefje,1,2.50,"algemeen");
        System.out.println();
        new PrintPlanten(kas.getKasPlanten()).printPlantenLijst();
        System.out.println();
        /*        kas.getGroenteLijst();*/
        System.out.println();
        /*        kas.getBloemenLijst();*/
        System.out.println();
        kas.getKasOogsten().oogstPlantSoort(courgette,7,2,"Goed");
        //KIJK HIER
        new PrintOogsten(kas.getKasOogsten()).printOogstenKas();
        System.out.println();
        System.out.println(kas.getKasWinst().getTotaleWinst());
        courgette.getHandelingen().newHandeling(1, 1, 1999, "Testertje");
        new PrintHandelingen(courgette).printLijst();
        new PrintHandelingen(wortel).printLijst();
        System.out.println("Plantensoort "+madeliefje.getNaam()+madeliefje.getBenodigdheden().toString()+madeliefje.getVoeding().getStringVoeding());
        /*        kas.getBloemenLijst();*/
        new PrintHandelingen(madeliefje).printLijst();
        System.out.println(kas.getKasWinst().getTotaleWinst());
        new PrintHandelingen(courgette).printLijst();
        kas.getKasOogsten().oogstPlantSoort(courgette, 10, 1, "Algemeen");
        System.out.println(kas.getKasWinst().getTotaleWinst());
        System.out.println("Plantensoort "+madeliefje.getNaam()+madeliefje.getBenodigdheden().toString()+madeliefje.getVoeding().getStringVoeding());
        System.out.println(courgette.getBenodigdheden().getGroeiTijdWeken());
        new PrintHandelingen(courgette).printLijst();
        System.out.println(madeliefje.getNaam());
        madeliefje.setNaam("Moodeliefje");
/*        kas.getBloemenLijst();
        kas.getBloemenLijst();*/
        System.out.println();
        Plant astronemeria = new Bloem("Astronemeria", 0.31, new Benodigdheden(7, 60, 21), new BloemVoeding(3, 4, 6));
        kas.getKasPlanten().addPlant(astronemeria);
        astronemeria.getPlantLevensduur().setHuidigeGroeiTijdWeken(6);
        astronemeria.getPlantLevensduur().volgendeWeek();
        astronemeria.getPlantLevensduur().volgendeWeek();
        new GeefPlantVoeding(astronemeria).geefVoeding(1, 1, 2021);
        System.out.println();
        new PrintPlanten(kas.getKasPlanten()).printPlantenLijst();
        System.out.println();
        /*        kas.getBloemenLijst();*/
        System.out.println();
//        kas.getGroenteLijst();
/*        System.out.println(kas.getHoeveelheidBloemen());
        System.out.println(kas.getHoeveelheidGroentes());*/
        new PrintPlanten(kas.getKasPlanten()).printHoeveelheidPlanten();
        System.out.println(kas.getKasWinst().getTotaleWinst());
        kas.getKasOogsten().oogstPlantSoort(astronemeria, 10, 4, "Goed");
        new PrintOogsten(kas.getKasOogsten()).printOogstenKas();
        System.out.println(kas.getKasWinst().getTotaleWinst());
        new PrintOogsten(kas.getKasOogsten()).printHoeveelheidSoortenOogst();
        new PrintHandelingen(madeliefje).printLijst();
        new PrintOogsten(kas.getKasOogsten()).printOogstenKas();
        madeliefje.getHandelingen().newHandeling(1, 1, 2021, "Test nieuwe aanpassingen");
        madeliefje.getHandelingen().newHandeling(1, 1, 2021, "Test nieuwe aanpassingen2");
        System.out.println("Kijk hier");
        // kas.oogstPlantSoort(madeliefje,2,2,"Goed");
        new PrintHandelingen(courgette).printLijst();
        new PrintHandelingen(wortel).printLijst();
        new PrintHandelingen(madeliefje).printLijst();
        System.out.println(kas.getKasWinst().getTotaleWinst());
        System.out.println(madeliefje.getHandelingen().getHandelingenLijst().size());
        new PrintOogsten(kas.getKasOogsten()).printOogstenKas();
        System.out.println("Plantensoort "+madeliefje.getNaam()+madeliefje.getBenodigdheden().toString()+madeliefje.getVoeding().getStringVoeding());
        new PrintHandelingen(madeliefje).printLijst();
        new GeefPlantVoeding(madeliefje).geefVoeding(1, 1, 2021);
        System.out.println("");
        new PrintHandelingen(madeliefje).printLijst();
        System.out.println(madeliefje.getHandelingen().getHandelingenLijst().size());

        // Hier zou ik eiggenlijk gegevens willen opvragen uit de database over de kas eigenaar.
        //Zodat ik dit niet hoef te doen...

/*
        KasEigenaar.getInstance().getAccount().maakAccount();
        Login.getInstance().Inloggen();
        try {
            KasEigenaar.getInstance().getBezit().addKas(kas);
        } catch (KasEigenaarNietIngelogdException e) {
            System.out.println(e);
        }
*/


     if (KasEigenaar.getInstance().getBezit().getKassenLijst().size() == 1 && new KasBezitControle(KasEigenaar.getInstance().getBezit()).bezitDeKas("Dummy")) {
            System.out.println("De kas eigenaar bezit nog geen kassen. Gebruik:(Dummy) om verder te gaan.");
        }
            System.out.println("In welke kas werkt u?");
            String kasString = AskForInput.vraagEenString();
            try {
                Kas currentkas = new KasBezitControle(KasEigenaar.getInstance().getBezit()).getKasInBezit(kasString);
                if (new KasBezitControle(KasEigenaar.getInstance().getBezit()).bezitDeKas(currentkas.getKasNaam())) {
                    int verder = 1;
                    while (verder != 0) {
                        Menu.printMenu(currentkas);
                        System.out.println("Wilt u echt stoppen?");
                        System.out.println("1) Nee");
                        System.out.println("0) Stoppen");
                        verder = AskForInput.vraagEenInt();
                    }

                }
            } catch (KasBestaatNietException e) {
                System.out.println(e);
                System.out.println("Controleer de kas naam en probeer opnieuw.");
            }

        }
    }
