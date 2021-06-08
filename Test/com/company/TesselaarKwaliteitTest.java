package com.company;

import com.company.Oogsten.Kwaliteit;
import com.company.Oogsten.TesselaarKwaliteit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesselaarKwaliteitTest {
    static TesselaarKwaliteitStringVoorwaardenTest tester;

    @BeforeAll
    static void setup() {
        tester = new TesselaarKwaliteitStringVoorwaardenTest();
    }

    static class TesselaarKwaliteitStringVoorwaardenTest{
        public boolean kwaliteitStringVoorwaarden(String kwaliteit){
            return kwaliteit.equalsIgnoreCase("slecht") || kwaliteit.equalsIgnoreCase("algemeen") || kwaliteit.equalsIgnoreCase("goed");
        }
    }

    @Test
    void kwaliteitStringVoorwaarden() {
        assertTrue(new TesselaarKwaliteitStringVoorwaardenTest().kwaliteitStringVoorwaarden("Slecht"));
        assertTrue(new TesselaarKwaliteitStringVoorwaardenTest().kwaliteitStringVoorwaarden("Algemeen"));
        assertTrue(new TesselaarKwaliteitStringVoorwaardenTest().kwaliteitStringVoorwaarden("Goed"));
        assertFalse(new TesselaarKwaliteitStringVoorwaardenTest().kwaliteitStringVoorwaarden("Heel Slecht"));
    }

    @AfterAll
    static void cleanup(){
        tester = null;
    }
}