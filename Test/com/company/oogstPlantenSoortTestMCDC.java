package com.company;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class oogstPlantenSoortTestMCDC {

        static Kas kas = null;
        static Groente wortel = null;
        static Groente courgette = null;

        @BeforeEach
        void initialize(){
            kas = new Kas("kas");
            wortel = new Groente("Wortel",0.20,new Benodigdheden(7,60,21),new Voeding(3,4));
            courgette = new Groente("Courgette",0.30,new Benodigdheden(7,60,21),new Voeding(3,4));
            kas.addPlant(wortel);
        }

        @Test
        @DisplayName("MC/DC Test1")
        void oogstPlantSoortTest1() {
            wortel.setHuidigeGroeiTijdWeken(7);
            boolean expected = true;
            boolean actual = kas.oogstPlantSoort(wortel,6,2,"Algemeen");
            assertEquals(expected,actual);
        }

    @Test
    @DisplayName("MC/DC Test2")
    void oogstPlantSoortTest2() {
        courgette.setHuidigeGroeiTijdWeken(7);
        boolean expected = false;
        boolean actual = kas.oogstPlantSoort(courgette,10,2,"Algemeen");
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("MC/DC Test3")
    void oogstPlantSoortTest3() {
        wortel.setHuidigeGroeiTijdWeken(7);
        boolean expected = false;
        boolean actual = kas.oogstPlantSoort(wortel,0,2,"Algemeen");
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("MC/DC Test4")
    void oogstPlantSoortTest4() {
        wortel.setHuidigeGroeiTijdWeken(5);
        boolean expected = false;
        boolean actual = kas.oogstPlantSoort(wortel,9,2,"Algemeen");
        assertEquals(expected,actual);
    }

        @AfterEach
        void reset(){
            kas = null;
            wortel = null;
            courgette = null;
        }
    }
