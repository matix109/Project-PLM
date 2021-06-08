package com.company;

import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.Exceptions.NietInDeKasException;
import com.company.Factory.TesselaarOogstFactory;
import com.company.Oogsten.OogstDePlant;
import com.company.Oogsten.OogstDePlantTesselaar;
import com.company.Oogsten.OogstDetails;
import com.company.Oogsten.TesselaarOogst;
import com.company.Planten.Benodigdheden;
import com.company.Planten.Groente;
import com.company.VoedingPlanten.GroenteVoeding;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OogstDePlantTesselaarTest {
    static Kas kas = null;
    static Groente wortel = null;
    static Groente courgette = null;
    static Groente aardappel = null;
    static Groente tomaat = null;
    static Groente prei = null;

    @BeforeEach
    void initialize(){
        kas = new Kas("kas");
        wortel = new Groente("Wortel",0.20,new Benodigdheden(7,60,21),new GroenteVoeding(3,4));
        courgette = new Groente("Courgette",0.30,new Benodigdheden(7,60,21),new GroenteVoeding(3,4));
        aardappel = new Groente("Aardappel",0.30,new Benodigdheden(7,60,21),new GroenteVoeding(3,4));
        tomaat = new Groente("Tomaat",0.30,new Benodigdheden(7,60,21),new GroenteVoeding(3,4));
        prei = new Groente("Prei",0.20,new Benodigdheden(7,60,21),new GroenteVoeding(3,4));

        kas.getKasPlanten().addPlant(wortel);
        kas.getKasPlanten().addPlant(courgette);
        kas.getKasPlanten().addPlant(aardappel);
        kas.getKasPlanten().addPlant(prei);

        wortel.getPlantLevensduur().setHuidigeGroeiTijdWeken(6);
        courgette.getPlantLevensduur().setHuidigeGroeiTijdWeken(7);
        aardappel.getPlantLevensduur().setHuidigeGroeiTijdWeken(9);
        tomaat.getPlantLevensduur().setHuidigeGroeiTijdWeken(6);
        prei.getPlantLevensduur().setHuidigeGroeiTijdWeken(8);
    }

    @Test
    void kanGeoogstWorden() {
    assertTrue(new OogstDePlantTesselaar(kas).oogstPlantSoort(new TesselaarOogst(wortel,new OogstDetails(1,2),"Algemeen",new TesselaarOogstFactory())));
    assertTrue(new OogstDePlantTesselaar(kas).oogstPlantSoort(new TesselaarOogst(courgette,new OogstDetails(1,2),"Algemeen",new TesselaarOogstFactory())));
    assertTrue(new OogstDePlantTesselaar(kas).oogstPlantSoort(new TesselaarOogst(prei,new OogstDetails(1,2),"Algemeen",new TesselaarOogstFactory())));
    }

    @Test
    void kanNietGeoogstWorden(){
        assertFalse(new OogstDePlantTesselaar(kas).oogstPlantSoort(new TesselaarOogst(tomaat,new OogstDetails(1,2),"Algemeen",new TesselaarOogstFactory())));
        assertFalse(new OogstDePlantTesselaar(kas).oogstPlantSoort(new TesselaarOogst(aardappel,new OogstDetails(1,2),"Algemeen",new TesselaarOogstFactory())));
        assertFalse(new OogstDePlantTesselaar(kas).oogstPlantSoort(new TesselaarOogst(wortel,new OogstDetails(0,2),"Algemeen",new TesselaarOogstFactory())));
    }

    @Test
    void naDeOogst() {
        new OogstDePlantTesselaar(kas).oogstPlantSoort(new TesselaarOogst(prei,new OogstDetails(1,2),"Algemeen",new TesselaarOogstFactory()));
        assertEquals(2,kas.getKasWinst().getTotaleWinst());
//De plant staat niet meer in de kas.
        Exception exception = assertThrows(NietInDeKasException.class, () -> {
            new GetPlant(kas.getKasPlanten()).getTargetPlant("Prei");
        });
        String expected = "De plant staat niet in de kas";
        String actual = exception.getMessage();
        assertTrue(actual.contains(expected));
//De oogst is toegevoegd aan de oogsten in de kas.
        assertEquals(1,kas.getKasOogsten().getOogstenLijst().size());
    }

    @AfterEach
    void reset(){
        kas = null;
        wortel = null;
        courgette = null;
        aardappel = null;
        tomaat = null;
        prei = null;
    }
}