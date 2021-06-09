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
        Plant plant = new GetPlant(kas.getKasPlanten()).getTargetPlant(AskForInput.vraagNaamVanDePlant());
        int hoeveelheid = AskForInput.vraagDeHoeveelheidPlanten();
        double PPS = AskForInput.vraagDePPS();
        System.out.print("Wat is de kwaliteit?(Goed/Algemeen/Slecht): ");
        String kwaliteit = AskForInput.vraagEenString();
        return new TesselaarOogst(plant,new OogstDetails( hoeveelheid, PPS), kwaliteit, new TesselaarOogstFactory());
    }

    public Oogst case2_2(Kas kas) throws NietInDeKasException {
        Plant plant2 = new GetPlant(kas.getKasPlanten()).getTargetPlant(AskForInput.vraagNaamVanDePlant());
        int hoeveelheid =AskForInput.vraagDeHoeveelheidPlanten();
        double PPS =AskForInput.vraagDePPS();
        System.out.print("Wat is de kwaliteit?(Uitstekend/Matig/Bedorven): ");
        String kwaliteit = AskForInput.vraagEenString();
        return new TesselaarOogst(plant2,new OogstDetails( hoeveelheid, PPS), kwaliteit, new TesselaarOogstMetParadijsBerekeningFactory());
    }

    public void case2_3(Kas kas) throws NietInDeKasException {
        Plant plant3 = new GetPlant(kas.getKasPlanten()).getTargetPlant(AskForInput.vraagNaamVanDePlant());
        int dag = AskForInput.vraagDeDag();
        int maand = AskForInput.vraagDeMaand();
        int jaar = AskForInput.vraagHetJaar();
        new GeefPlantVoeding(plant3).geefVoeding(new Datum(dag, maand, jaar));
    }

    public void case2_4(Kas kas) throws NietInDeKasException {
        Plant plant4 = new GetPlant(kas.getKasPlanten()).getTargetPlant(AskForInput.vraagNaamVanDePlant());
        int dag = AskForInput.vraagDeDag();
        int maand =AskForInput.vraagDeMaand();
        int jaar = AskForInput.vraagHetJaar();
                System.out.print("Wat voor handleing gaat u verrichten?: ");
        String handleing = AskForInput.vraagEenString();
        plant4.getHandelingen().newHandeling(new Datum(dag, maand, jaar), handleing);
    }

    public Bloem case4_1() {
        System.out.print("Wat is de naam van de bloem?: ");
        String naam = AskForInput.vraagEenString();
        double prijs = AskForInput.vraagDePrijsOmTeGroeien();
        System.out.println("Wat zijn de benodigdheden ven de bloem?");
        int groeiTijdWeken = AskForInput.vraagDeGroeiTijdWeken();
        int luchtvochtigheid = AskForInput.vraagDeLuchtvochtigheid();
        int temperatuur = AskForInput.vraagDeTemperatuur();
        System.out.println("Wat voor voeding krijgt de bloem?");
        double gro = AskForInput.vraagDeGro();
        double miGro = AskForInput.vraagDeMi_Gro();
        double bloom = AskForInput.vraagDeBloom();
        return new Bloem(naam, prijs, new Benodigdheden(groeiTijdWeken, luchtvochtigheid, temperatuur), new BloemVoeding(gro, miGro, bloom));
    }

    public Groente case4_2() {
        System.out.print("Wat is de naam van de groente?: ");
        String naam = AskForInput.vraagEenString();
        double prijs = AskForInput.vraagDePrijsOmTeGroeien();
        System.out.println("Wat zijn de benodigdheden ven de groente?");
        int groeiTijdWeken = AskForInput.vraagDeGroeiTijdWeken();
        int luchtvochtigheid = AskForInput.vraagDeLuchtvochtigheid();
        int temperatuur = AskForInput.vraagDeTemperatuur();
        System.out.println("Wat voor voeding krijgt de groente?");
        double gro = AskForInput.vraagDeGro();
        double miGro = AskForInput.vraagDeMi_Gro();
        return new Groente(naam, prijs, new Benodigdheden(groeiTijdWeken, luchtvochtigheid, temperatuur), new GroenteVoeding(gro, miGro));
    }

    public void case6_1(Kas kas) throws NietInDeKasException, KasEigenaarNietIngelogdException {
        Plant plant = new GetPlant(kas.getKasPlanten()).getTargetPlant(AskForInput.vraagNaamVanDePlant());
        System.out.println("Wat zijn de nieuwe benodigdheden?");
        int groeiTijdWeken = AskForInput.vraagDeGroeiTijdWeken();
        int luchtvochtigheid = AskForInput.vraagDeLuchtvochtigheid();
        int temperatuur = AskForInput.vraagDeTemperatuur();
        System.out.println();
        plant.getBenodigdheden().setBenodigdheden(groeiTijdWeken, luchtvochtigheid, temperatuur);
    }

    public void case6_2(Kas kas) throws NietInDeKasException, KasEigenaarNietIngelogdException {
        Plant plant2 = new GetPlant(kas.getKasPlanten()).getTargetPlant(AskForInput.vraagNaamVanDePlant());
        System.out.println("Wat voor voeding krijgt de bloem?");
        double Gro = AskForInput.vraagDeGro();
        double MiGro = AskForInput.vraagDeMi_Gro();
        double Bloom = AskForInput.vraagDeBloom();
        System.out.println();
        plant2.getVoeding().setVoeding(Gro, MiGro, Bloom);
    }

    public void case6_3(Kas kas) throws KasEigenaarNietIngelogdException, NietInDeKasException {
        Plant plant3 = new GetPlant(kas.getKasPlanten()).getTargetPlant(AskForInput.vraagNaamVanDePlant());
        System.out.println("Wat voor voeding krijgt de groente?");
        double Gro = AskForInput.vraagDeGro();
        double MiGro = AskForInput.vraagDeMi_Gro();
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
