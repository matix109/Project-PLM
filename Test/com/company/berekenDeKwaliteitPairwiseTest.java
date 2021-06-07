package com.company;

import com.company.DeKas.*;
import com.company.Oogsten.*;
import com.company.Planten.*;
import com.company.VoedingPlanten.BloemVoeding;
import com.company.VoedingPlanten.GeefPlantVoeding;
import com.company.VoedingPlanten.GroenteVoeding;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class berekenDeKwaliteitPairwiseTest {
    static Kas kas = null;
    static Kwaliteit kwaliteit1 = null;
    static Kwaliteit kwaliteit2 = null;
    static Kwaliteit kwaliteit3 = null;
    static Kwaliteit kwaliteit4 = null;
    static Kwaliteit kwaliteit5 = null;
    static Kwaliteit kwaliteit6 = null;
    static BerekenPrijsPerStuk PPS1 = null;
    static BerekenPrijsPerStuk PPS2 = null;
    static BerekenPrijsPerStuk PPS3 = null;
    static BerekenPrijsPerStuk PPS4 = null;
    static BerekenPrijsPerStuk PPS5 = null;
    static BerekenPrijsPerStuk PPS6 = null;
    static Bloem madeliefje = null;
    static Bloem tulp = null;
    static Bloem lotus = null;
    static Bloem iris = null;
    static Groente aardappel = null;
    static Groente courgette = null;
    static Groente wortel = null;
    static Groente prei = null;

    @BeforeAll
    static void setup(){
        kas = new Kas("Kas");
        //Bloemen
        madeliefje = new Bloem("Madeliefje", 0.20,new Benodigdheden(0,60,21), new BloemVoeding(3, 4, 6));//Goed
        tulp = new Bloem("Tulp", 0.31, new Benodigdheden(0,60,21), new BloemVoeding(3, 4, 6));//Goed
        lotus = new Bloem("Lotus", 0.31, new Benodigdheden(0,60,21), new BloemVoeding(3, 4, 6));//Goed
        //Groente
        aardappel = new Groente("Aardappel", 0.31, new Benodigdheden(0,60,21), new GroenteVoeding(3, 4));//Goed
        courgette = new Groente("Courgette", 0.20, new Benodigdheden(0,60,21),new GroenteVoeding( 3, 4));//Goed
        wortel = new Groente("Wortel", 0.20, new Benodigdheden(0,60,21), new GroenteVoeding(3, 4));//Goed
        //In de kas
        kas.getKasPlanten().addPlant(madeliefje);
        kas.getKasPlanten().addPlant(tulp);
        kas.getKasPlanten().addPlant(lotus);
        kas.getKasPlanten().addPlant(iris);
        kas.getKasPlanten().addPlant(aardappel);
        kas.getKasPlanten().addPlant(courgette);
        kas.getKasPlanten().addPlant(wortel);
        kas.getKasPlanten().addPlant(prei);
        //Niet bio planten
        new GeefPlantVoeding(tulp).geefVoeding(new Datum(4,5,2021));
        new GeefPlantVoeding(aardappel).geefVoeding(new Datum(4,5,2021));
        new GeefPlantVoeding(wortel).geefVoeding(new Datum(4,5,2021));
        //Kwaliteit
        //Door middel van een BerekenPrijsPerStuk object aan te maken wordt de methode met 4 parameters(3,2,2,2) getest.
        //Onder elke BerekenPrijsPerStuk staat de ingevulde methode als voorbeeld.
        kwaliteit1 = new TesselaarKwaliteit("Slecht");
        PPS1 = new TesselaarBerekeningPPS(kwaliteit1,new PPSBerekeningPlantCalls(madeliefje),1);
        //PPS1.berekenPrijsPerStuk("Slecht",aardappel,true,false);
        kwaliteit2 = new TesselaarKwaliteit("Slecht");
        PPS2 = new TesselaarBerekeningPPS(kwaliteit2,new PPSBerekeningPlantCalls(aardappel),1);
        //PPS2.berekenPrijsPerStuk("Slecht",aardappel,false,true);
        kwaliteit3 = new TesselaarKwaliteit("Algemeen");
        PPS3 = new TesselaarBerekeningPPS(kwaliteit3,new PPSBerekeningPlantCalls(tulp),1);
        //PPS3.berekenPrijsPerStuk("Algemeen",tulp,false,true);
        kwaliteit4 = new TesselaarKwaliteit("Algemeen");
        PPS4 = new TesselaarBerekeningPPS(kwaliteit4,new PPSBerekeningPlantCalls(courgette),1);
        //PPS4.berekenPrijsPerStuk("Algemeen",courgette,true,false);
        kwaliteit5 = new TesselaarKwaliteit("Goed");
        PPS5 = new TesselaarBerekeningPPS(kwaliteit5,new PPSBerekeningPlantCalls(lotus),1);
        //PPS5.berekenPrijsPerStuk("Goed",lotus,true,true)
        kwaliteit6 = new TesselaarKwaliteit("Goed");
        PPS6 = new TesselaarBerekeningPPS(kwaliteit6,new PPSBerekeningPlantCalls(wortel),1);
        //PPS6.berekenPrijsPerStuk("Goed",wortel,false,false)
    }

    @Test
    @DisplayName("Prijs Per Stuk Test")
    void nettoWinstTest() {
        assertEquals(0.77,PPS1.getPrijsPerStuk(),0.01);
        assertEquals(0.84,PPS2.getPrijsPerStuk(),0.01);
        assertEquals(1.05,PPS3.getPrijsPerStuk(),0.01);
        assertEquals(1.1,PPS4.getPrijsPerStuk(),0.01);
        assertEquals(1.5,PPS5.getPrijsPerStuk(),0.01);
        assertEquals(1.2,PPS6.getPrijsPerStuk(),0.01);
    }

    @AfterAll
    static void reset(){
        kas = null;
        kwaliteit1 = null;
        kwaliteit2 = null;
        kwaliteit3 = null;
        kwaliteit4 = null;
        kwaliteit5 = null;
        kwaliteit6 = null;
        madeliefje = null;
        PPS1 = null;
        PPS2 = null;
        PPS3 = null;
        PPS4 = null;
        PPS5 = null;
        PPS6 = null;
        tulp = null;
        lotus = null;
        iris = null;
        aardappel = null;
        courgette = null;
        wortel = null;
        prei = null;
    }
}