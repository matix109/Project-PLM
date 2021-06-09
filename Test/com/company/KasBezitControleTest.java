package com.company;

import com.company.DeKas.Kas;
import com.company.Exceptions.KasBestaatNietException;
import com.company.KasEigenaar.KasBezitControle;
import com.company.KasEigenaar.KasEigenaarKassen;
import com.company.Planten.Benodigdheden;
import com.company.Planten.Groente;
import com.company.VoedingPlanten.GroenteVoeding;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KasBezitControleTest {
    static Kas kas = null;
    static Groente wortel = null;
    static Groente courgette = null;
    KasEigenaarKassenTest kasEigenaarBezit = new KasEigenaarKassenTest();

    static class KasEigenaarKassenTest extends KasEigenaarKassen {
        private ArrayList<Kas> Kassen = new ArrayList<>();

        @Override
        public ArrayList<Kas> getKassenLijst(){
            ArrayList<Kas> dummy = new ArrayList<>();
            dummy.addAll(Kassen);
            return dummy;
        }
        @Override
        public void addKas(Kas kas) {
            Kassen.add(kas);
        }
    }

    @BeforeEach
    void initialize(){
        kas = new Kas("kas");
        kasEigenaarBezit.addKas(kas);
        wortel = new Groente("Wortel",0.20,new Benodigdheden(7,60,21),new GroenteVoeding(3,4));
        courgette = new Groente("Courgette",0.30,new Benodigdheden(7,60,21),new GroenteVoeding(3,4));
        kas.getKasPlanten().addPlant(wortel);
    }

    @Test
    void bezitDeKas() {
    assertTrue(new KasBezitControle(kasEigenaarBezit).bezitDeKas("kas"));
    assertFalse(new KasBezitControle(kasEigenaarBezit).bezitDeKas("kas2"));
    }

    @Test
    public void getKasInBezit_ZorgtVoorExceptionTest() {
        Exception exception = assertThrows(KasBestaatNietException.class, () -> {
            new KasBezitControle(kasEigenaarBezit).getKasInBezit("kas2");
        });
        String expected = "De kas kas2 betaat niet.";
        String actual = exception.getMessage();
        assertTrue(actual.contains(expected));
    }

    @Test
    void getKasInBezit() throws KasBestaatNietException {
    assertEquals(kas,new KasBezitControle(kasEigenaarBezit).getKasInBezit("kas"));
    }

    @AfterEach
    void reset(){
        kas = null;
        wortel = null;
        courgette = null;
    }
}