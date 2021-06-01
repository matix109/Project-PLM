package com.company;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class KasTest {
   static Kas kas = null;
   static Groente wortel = null;
   static Groente courgette = null;

    @BeforeAll
    static void initialize(){
        kas = new Kas("kas");
        wortel = new Groente("Wortel",0.20,new Benodigdheden(7,60,21),new GroenteVoeding(3,4));
        courgette = new Groente("Courgette",0.30,new Benodigdheden(7,60,21),new GroenteVoeding(3,4));
        kas.addPlant(wortel);
        kas.addPlant(courgette);
        wortel.getPlantLevensduur().setHuidigeGroeiTijdWeken(7);
        courgette.getPlantLevensduur().setHuidigeGroeiTijdWeken(7);
        wortel.getHandelingen().newHandeling(9,11,1999,"de blaadjes onderhouden");
        kas.oogstPlantSoort(wortel,10,2,"Algemeen");
    }

    @Test
    @Order(2)
    @DisplayName("Hoeveelheid Groente")
    void oogstPlantSoortTest() {
        int expected = 1;
        int actual = kas.getHoeveelheidPlanten();
        assertEquals(expected,actual);
        }

    @Test
    @Order(1)
    @DisplayName("Soorten Oogst")
    void oogstPlantSoortTest2() {
        int expected = 1;
        int actual = kas.getHoeveelheidSoortenOogst();
        assertEquals(expected,actual);
    }

    @Test
    @Order(3)
    @DisplayName("Handelingen")
    void oogstPlantSoortTest3() {
        int expected = 0;
        int actual = wortel.getHandelingen().getLijst().size();
        assertEquals(expected,actual);
    }

    @AfterAll
    static void reset(){
        kas = null;
        wortel = null;
        courgette = null;
    }
}