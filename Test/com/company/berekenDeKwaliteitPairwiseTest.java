package com.company;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class berekenDeKwaliteitPairwiseTest {
    static Kas kas = null;
    static Kwaliteit kwaliteit1 = null;
    static Kwaliteit kwaliteit2 = null;
    static Kwaliteit kwaliteit3 = null;
    static Kwaliteit kwaliteit4 = null;
    static Kwaliteit kwaliteit5 = null;
    static Kwaliteit kwaliteit6 = null;
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
        madeliefje = new Bloem("Madeliefje", 0, 0.20, 60, 21, 3, 4, 6);//Goed
        tulp = new Bloem("Tulp", 0, 0.31, 60, 21, 3, 4, 6);//Goed
        lotus = new Bloem("Lotus", 0, 0.31, 60, 21, 3, 4, 6);//Goed
        //Groente
        aardappel = new Groente("Aardappel", 0, 0.31, 60, 21, 3, 4);//Goed
        courgette = new Groente("Courgette", 0, 0.20, 60, 21, 3, 4);//Goed
        wortel = new Groente("Wortel", 0, 0.20, 60, 21, 3, 4);//Goed
        //In de kas
        kas.addPlant(madeliefje);
        kas.addPlant(tulp);
        kas.addPlant(lotus);
        kas.addPlant(iris);
        kas.addPlant(aardappel);
        kas.addPlant(courgette);
        kas.addPlant(wortel);
        kas.addPlant(prei);
        //Niet bio planten
        tulp.geefVoeding(4,5,2021);
        aardappel.geefVoeding(4,5,2021);
        wortel.geefVoeding(4,5,2021);
        //Kwaliteit
        //Door middel van een Kwaliteit object aan te maken wordt de methode met 4 parameters(3,2,2,2) getest.
        //Onder elke kwaliteit staat de ingevulde methode als voorbeeld.
        kwaliteit1 = new Kwaliteit("Slecht",madeliefje,1);
        //kwaliteit1.berekenPrijsPerStuk("Slecht",aardappel,true,false);
        kwaliteit2 = new Kwaliteit("Slecht",aardappel,1);
        //kwaliteit2.berekenPrijsPerStuk("Slecht",aardappel,false,true);
        kwaliteit3 = new Kwaliteit("Algemeen",tulp,1);
        //kwaliteit3.berekenPrijsPerStuk("Algemeen",tulp,false,true);
        kwaliteit4 = new Kwaliteit("Algemeen",courgette,1);
        //kwaliteit4.berekenPrijsPerStuk("Algemeen",courgette,true,false);
        kwaliteit5 = new Kwaliteit("Goed",lotus,1);
        //kwaliteit5.berekenPrijsPerStuk("Goed",lotus,true,true)
        kwaliteit6 = new Kwaliteit("Goed",wortel,1);
        //kwaliteit6.berekenPrijsPerStuk("Goed",wortel,false,false)
    }

    @Test
    @DisplayName("Prijs Per Stuk Test")
    void nettoWinstTest() {
        assertEquals(0.77,kwaliteit1.getPrijsPerStuk(),0.01);
        assertEquals(0.84,kwaliteit2.getPrijsPerStuk(),0.01);
        assertEquals(1.05,kwaliteit3.getPrijsPerStuk(),0.01);
        assertEquals(1.1,kwaliteit4.getPrijsPerStuk(),0.01);
        assertEquals(1.5,kwaliteit5.getPrijsPerStuk(),0.01);
        assertEquals(1.2,kwaliteit6.getPrijsPerStuk(),0.01);
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
        tulp = null;
        lotus = null;
        iris = null;
        aardappel = null;
        courgette = null;
        wortel = null;
        prei = null;
    }
}