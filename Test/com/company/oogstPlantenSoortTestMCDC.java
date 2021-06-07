package com.company;

import com.company.DeKas.Kas;
import com.company.Factory.TesselaarOogstFactory;
import com.company.Oogsten.OogstDePlantTesselaar;
import com.company.Oogsten.OogstDetails;
import com.company.Oogsten.TesselaarOogst;
import com.company.Planten.Benodigdheden;
import com.company.Planten.Groente;
import com.company.VoedingPlanten.GroenteVoeding;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class oogstPlantenSoortTestMCDC {

        static Kas kas = null;
        static Groente wortel = null;
        static Groente courgette = null;

        @BeforeEach
        void initialize(){
            kas = new Kas("kas");
            wortel = new Groente("Wortel",0.20,new Benodigdheden(7,60,21),new GroenteVoeding(3,4));
            courgette = new Groente("Courgette",0.30,new Benodigdheden(7,60,21),new GroenteVoeding(3,4));
            kas.getKasPlanten().addPlant(wortel);
        }

        @Test
        @DisplayName("MC/DC Test1")
        void oogstPlantSoortTest1() {
            wortel.getPlantLevensduur().setHuidigeGroeiTijdWeken(7);
            boolean expected = true;
            boolean actual = new OogstDePlantTesselaar(kas).oogstPlantSoort(new TesselaarOogst(wortel,new OogstDetails(6,2),"Algemeen",new TesselaarOogstFactory()));
            assertEquals(expected,actual);
        }

    @Test
    @DisplayName("MC/DC Test2")
    void oogstPlantSoortTest2() {
        courgette.getPlantLevensduur().setHuidigeGroeiTijdWeken(7);
        boolean expected = false;
        boolean actual = new OogstDePlantTesselaar(kas).oogstPlantSoort(new TesselaarOogst(courgette,new OogstDetails(10,2),"Algemeen",new TesselaarOogstFactory()));
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("MC/DC Test3")
    void oogstPlantSoortTest3() {
        wortel.getPlantLevensduur().setHuidigeGroeiTijdWeken(7);
        boolean expected = false;
        boolean actual = new OogstDePlantTesselaar(kas).oogstPlantSoort(new TesselaarOogst(wortel,new OogstDetails(0,2),"Algemeen",new TesselaarOogstFactory()));
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("MC/DC Test4")
    void oogstPlantSoortTest4() {
        wortel.getPlantLevensduur().setHuidigeGroeiTijdWeken(5);
        boolean expected = false;
        boolean actual = new OogstDePlantTesselaar(kas).oogstPlantSoort(new TesselaarOogst(wortel,new OogstDetails(9,2),"Algemeen",new TesselaarOogstFactory()));
        assertEquals(expected,actual);
    }

        @AfterEach
        void reset(){
            kas = null;
            wortel = null;
            courgette = null;
        }
    }
