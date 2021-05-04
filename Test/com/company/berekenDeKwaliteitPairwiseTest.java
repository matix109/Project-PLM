package com.company;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class berekenDeKwaliteitPairwiseTest {
    static Kas kas = null;
    static Kwaliteit kwaliteit = null;
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
        tulp = new Bloem("Tulp", 0, 0.41, 60, 21, 3, 4, 6);//Goed
        lotus = new Bloem("Lotus", 0, 0.41, 60, 21, 3, 4, 6);//Goed
        //Groente
        aardappel = new Groente("Aardappel", 0, 0.41, 60, 21, 3, 4);//Goed
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
    }
    @Test
    @DisplayName("Prijs Per Stuk Test")
    void nettoWinstTest() {
        assertEquals(0,kwaliteit.berekenPrijsPerStuk("Slecht",madeliefje,true,false),0.000000001);
        assertEquals(0,kwaliteit.berekenPrijsPerStuk("Slecht",aardappel,false,true),0.000000001);
        assertEquals(0,kwaliteit.berekenPrijsPerStuk("Algemeen",tulp,false,true),0.000000001);
        assertEquals(0,kwaliteit.berekenPrijsPerStuk("Algemeen",courgette,true,false),0.000000001);
        assertEquals(0,kwaliteit.berekenPrijsPerStuk("Goed",lotus,true,true),0.000000001);
        assertEquals(0,kwaliteit.berekenPrijsPerStuk("Goed",wortel,false,false),0.000000001);
    }

    @AfterAll
    static void reset(){
        kas = null;
        kwaliteit = null;
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