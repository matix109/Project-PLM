package com.company;

import com.company.DeKas.Kas;
import com.company.Menu.AskForInput;
import com.company.Exceptions.KasBestaatNietException;
import com.company.KasEigenaar.KasBezitControle;
import com.company.KasEigenaar.KasEigenaar;
import com.company.Menu.Menu;


public class Main {

    public static void main(String[] args){
/*        Kas kas = new Kas("kas");
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

        courgette.getHandelingen().newHandeling(new Datum(2,9,1999),"Blaadjes geaaid x 2");
        courgette.getHandelingen().newHandeling(new Datum(2, 9, 1999), "Blaadjes geaaid x 2");
        wortel.getHandelingen().newHandeling(new Datum(9, 11, 1999), "de blaadjes onderhouden");
        aardappel.getHandelingen().newHandeling(new Datum(11, 9, 1999), "Bol geaaid");
        System.out.println(aardappel.getPrijsOmTeGroeien());
        System.out.println("Plantensoort "+aardappel.getNaam()+aardappel.getBenodigdheden().toString()+aardappel.getVoeding().getStringVoeding());
        System.out.println("Plantensoort "+madeliefje.getNaam()+madeliefje.getBenodigdheden().toString()+madeliefje.getVoeding().getStringVoeding());
        System.out.println(madeliefje.getVoeding().getStringVoeding());
        madeliefje.getHandelingen().newHandeling(new Datum(11, 12, 2000), "Blaadjes controleren");
        System.out.println(kas.getKasWinst().getTotaleWinst());
        System.out.println(kas.getKasWinst().getTotaleWinst());
        System.out.println(kas.getKasWinst().getTotaleWinst());
        Kas kas2 = new Kas("kas");
        System.out.println(kas2.getKasWinst().getTotaleWinst());
        kas.getKasOogsten().oogstPlantSoort(new TesselaarOogst(courgette,7,2,"Goed",new TesselaarOogstFactory()));
        System.out.println(kas.getKasWinst().getTotaleWinst());
        courgette.getHandelingen().newHandeling(new Datum(1, 1, 1999), "Testertje");
        System.out.println("Plantensoort "+madeliefje.getNaam()+madeliefje.getBenodigdheden().toString()+madeliefje.getVoeding().getStringVoeding());
        System.out.println(kas.getKasWinst().getTotaleWinst());
        kas.getKasOogsten().oogstPlantSoort(new TesselaarOogst(courgette, 10, 1, "Algemeen",new TesselaarOogstFactory()));
        System.out.println(kas.getKasWinst().getTotaleWinst());
        System.out.println("Plantensoort "+madeliefje.getNaam()+madeliefje.getBenodigdheden().toString()+madeliefje.getVoeding().getStringVoeding());
        System.out.println(courgette.getBenodigdheden().getGroeiTijdWeken());
        System.out.println(madeliefje.getNaam());
        madeliefje.setNaam("Moodeliefje");
        Plant astronemeria = new Bloem("Astronemeria", 0.31, new Benodigdheden(7, 60, 21), new BloemVoeding(3, 4, 6));
        kas.getKasPlanten().addPlant(astronemeria);
        astronemeria.getPlantLevensduur().setHuidigeGroeiTijdWeken(6);
        astronemeria.getPlantLevensduur().volgendeWeek();
        astronemeria.getPlantLevensduur().volgendeWeek();
        System.out.println(kas.getKasWinst().getTotaleWinst());
        kas.getKasOogsten().oogstPlantSoort(new TesselaarOogst(astronemeria, 10, 4, "Goed",new TesselaarOogstFactory()));
        System.out.println(kas.getKasWinst().getTotaleWinst());
        madeliefje.getHandelingen().newHandeling(new Datum(1, 1, 2021), "Test nieuwe aanpassingen");
        madeliefje.getHandelingen().newHandeling(new Datum(1, 1, 2021), "Test nieuwe aanpassingen2");
        System.out.println("Kijk hier");
        System.out.println(kas.getKasWinst().getTotaleWinst());
        System.out.println(madeliefje.getHandelingen().getHandelingenLijst().size());
        System.out.println("Plantensoort "+madeliefje.getNaam()+madeliefje.getBenodigdheden().toString()+madeliefje.getVoeding().getStringVoeding());
        System.out.println(madeliefje.getHandelingen().getHandelingenLijst().size());

        // Hier zou ik eiggenlijk gegevens willen opvragen uit de database over de kas eigenaar.
        //Zodat ik eerst niet de kas hoef toe te voegen op deze manier en zo voort.
        // Haal de comments hier weg en boven weg en voer kas in bij bezit voor een volle kas.

        KasEigenaar.getInstance().getAccount().maakAccount();
        Login.getInstance().Inloggen();
        try {
            KasEigenaar.getInstance().getBezit().addKas(kas);
        } catch (KasEigenaarNietIngelogdException e) {
            System.out.println(e);
        }*/

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
