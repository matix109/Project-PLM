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
            wortel = new Groente("Wortel",7,0.20, 60,21,3,4);
            courgette = new Groente("Courgette",7,0.30, 60,21,3,4);
            kas.addPlant(wortel);
        }

        @Test
        @DisplayName("MC/DC Test1")
        void oogstPlantSoortTest1() {
            wortel.setHuidigeGroeiTijdWeken(7);
            kas.oogstPlantSoort(wortel,6,2,"Algemeen");
            int expected = 1;
            int actual = kas.getHoeveelheidSoortenOogst();
            assertEquals(expected,actual);
        }

    @Test
    @DisplayName("MC/DC Test2")
    void oogstPlantSoortTest2() {
        wortel.setHuidigeGroeiTijdWeken(7);
        kas.oogstPlantSoort(courgette,10,2,"Algemeen");
        int expected = 0;
        int actual = kas.getHoeveelheidSoortenOogst();
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("MC/DC Test3")
    void oogstPlantSoortTest3() {
        wortel.setHuidigeGroeiTijdWeken(7);
        kas.oogstPlantSoort(wortel,0,2,"Algemeen");
        int expected = 0;
        int actual = kas.getHoeveelheidSoortenOogst();
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("MC/DC Test4")
    void oogstPlantSoortTest4() {
        wortel.setHuidigeGroeiTijdWeken(5);
        kas.oogstPlantSoort(wortel,9,2,"Algemeen");
        int expected = 0;
        int actual = kas.getHoeveelheidSoortenOogst();
        assertEquals(expected,actual);
    }

        @AfterEach
        void reset(){
            kas = null;
            wortel = null;
            courgette = null;
        }
    }
