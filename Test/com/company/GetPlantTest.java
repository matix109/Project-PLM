package com.company;

import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.Exceptions.NietInDeKasException;
import com.company.Planten.Benodigdheden;
import com.company.Planten.Groente;
import com.company.VoedingPlanten.GroenteVoeding;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetPlantTest {
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
    void getTargetPlant() throws NietInDeKasException {
assertEquals(wortel,new GetPlant(kas.getKasPlanten()).getTargetPlant("Wortel"));
    }

    @Test
    public void getTargetPlant_ZorgtVoorExceptionTest() {
        Exception exception = assertThrows(NietInDeKasException.class, () -> {
            new GetPlant(kas.getKasPlanten()).getTargetPlant("Courgette");
        });
        String expected = "De plant staat niet in de kas";
        String actual = exception.getMessage();
        assertTrue(actual.contains(expected));
    }

    @Test
    void inDeKas() {
assertTrue(new GetPlant(kas.getKasPlanten()).inDeKas(wortel));
assertFalse(new GetPlant(kas.getKasPlanten()).inDeKas(courgette));
    }

    @AfterEach
    void reset(){
        kas = null;
        wortel = null;
        courgette = null;
    }
}