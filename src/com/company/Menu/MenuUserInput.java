package com.company.Menu;

import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.Exceptions.KasBestaatNietException;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.Exceptions.KasInBezitException;
import com.company.Exceptions.NietInDeKasException;
import com.company.Factory.TesselaarOogstFactory;
import com.company.Factory.TesselaarOogstMetParadijsBerekeningFactory;
import com.company.KasEigenaar.KasBezitControle;
import com.company.KasEigenaar.KasEigenaar;
import com.company.KasEigenaar.Login;
import com.company.Oogsten.Oogst;
import com.company.Oogsten.OogstDetails;
import com.company.Oogsten.TesselaarOogst;
import com.company.Planten.*;
import com.company.VoedingPlanten.BloemVoeding;
import com.company.VoedingPlanten.GeefPlantVoeding;
import com.company.VoedingPlanten.GroenteVoeding;

public class MenuUserInput {

    public Oogst case2_1(Kas kas) throws NietInDeKasException {
        Plant plant = new GetPlant(kas.getKasPlanten()).getTargetPlant();
        System.out.print("Wat is de hoeveelheid planten?: ");
        int hoeveelheid = AskForInput.vraagEenInt();
        System.out.print("Wat is de prijs per stuk?(€): ");
        double PPS = AskForInput.vraagEenDouble();
        System.out.print("Wat is de kwaliteit?(Goed/Algemeen/Slecht): ");
        String kwaliteit = AskForInput.vraagEenString();
        return new TesselaarOogst(plant,new OogstDetails( hoeveelheid, PPS), kwaliteit, new TesselaarOogstFactory());
    }

    public Oogst case2_2(Kas kas) throws NietInDeKasException {
        Plant plant2 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
        System.out.print("Wat is de hoeveelheid planten?: ");
        int hoeveelheid = AskForInput.vraagEenInt();
        System.out.print("Wat is de prijs per stuk?(€): ");
        double PPS = AskForInput.vraagEenDouble();
        System.out.print("Wat is de kwaliteit?(Uitstekend/Matig/Bedorven): ");
        String kwaliteit = AskForInput.vraagEenString();
        return new TesselaarOogst(plant2,new OogstDetails( hoeveelheid, PPS), kwaliteit, new TesselaarOogstMetParadijsBerekeningFactory());
    }

    public void case2_3(Kas kas) throws NietInDeKasException {
        Plant plant3 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
        System.out.print("Voer de dag in: ");
        int dag = AskForInput.vraagEenInt();
        System.out.print("Voer de maand in: ");
        int maand = AskForInput.vraagEenInt();
        System.out.print("Voer het jaar in: ");
        int jaar = AskForInput.vraagEenInt();
        new GeefPlantVoeding(plant3).geefVoeding(new Datum(dag, maand, jaar));
    }

    public void case2_4(Kas kas) throws NietInDeKasException {
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
    }

    public Bloem case4_1() {
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
        return new Bloem(naam, prijs, new Benodigdheden(groeiTijdWeken, luchtvochtigheid, temperatuur), new BloemVoeding(gro, miGro, bloom));
    }

    public Groente case4_2() {
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
        return new Groente(naam2, prijs2, new Benodigdheden(groeiTijdWeken2, luchtvochtigheid2, temperatuur2), new GroenteVoeding(gro2, miGro2));
    }

    public void case6_1(Kas kas) throws NietInDeKasException, KasEigenaarNietIngelogdException {
        Plant plant = new GetPlant(kas.getKasPlanten()).getTargetPlant();
        System.out.println("Wat zijn de nieuwe benodigdheden?");
        System.out.print("Voer de groei tijd in weken in: ");
        int groeiTijdWeken = AskForInput.vraagEenInt();
        System.out.print("Voer de nodige luchtvochtigheid in(%): ");
        int luchtvochtigheid = AskForInput.vraagEenInt();
        System.out.print("Voer de nodige temperatuur in(°C): ");
        int temperatuur = AskForInput.vraagEenInt();
        System.out.println();
        plant.getBenodigdheden().setBenodigdheden(groeiTijdWeken, luchtvochtigheid, temperatuur);
    }

    public void case6_2(Kas kas) throws NietInDeKasException, KasEigenaarNietIngelogdException {
        Plant plant2 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
        System.out.println("Wat voor voeding krijgt de bloem?");
        System.out.print("Voer de Gro in ml in: ");
        double Gro = AskForInput.vraagEenDouble();
        System.out.print("Voer de Mi-Gro in ml in: ");
        double MiGro = AskForInput.vraagEenDouble();
        System.out.print("Voer de Bloom in ml in: ");
        double Bloom = AskForInput.vraagEenDouble();
        System.out.println();
        plant2.getVoeding().setVoeding(Gro, MiGro, Bloom);
    }

    public void case6_3(Kas kas) throws KasEigenaarNietIngelogdException, NietInDeKasException {
        Plant plant3 = new GetPlant(kas.getKasPlanten()).getTargetPlant();
        System.out.println("Wat voor voeding krijgt de Groente?");
        System.out.print("Voer de Gro in ml in: ");
        double Gro = AskForInput.vraagEenDouble();
        System.out.print("Voer de Mi-Gro in ml in: ");
        double MiGro = AskForInput.vraagEenDouble();
        System.out.println();
        plant3.getVoeding().setVoeding(Gro, MiGro, 0);
    }

    public Kas case6_4() throws KasInBezitException {
        System.out.println("Welke kas wilt u toevoegen?");
        String kasToevoegen = AskForInput.vraagEenString();
        if (new KasBezitControle(KasEigenaar.getInstance().getBezit()).bezitDeKas(kasToevoegen)) {
            throw new KasInBezitException();
        }
        return new Kas(kasToevoegen);
    }

    public Kas case9_0(Kas currentKas) {
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
