package com.company;

import com.company.DeKas.Kas;
import com.company.Exceptions.KanNietGeoogstWordenException;
import com.company.Factory.TesselaarOogstFactory;
import com.company.Oogsten.OogstDePlant;
import com.company.Oogsten.OogstDePlantTesselaar;
import com.company.Oogsten.OogstDetails;
import com.company.Oogsten.TesselaarOogst;
import com.company.Planten.Benodigdheden;
import com.company.Planten.Bloem;
import com.company.Planten.Datum;
import com.company.VoedingPlanten.GeefPlantVoeding;
import com.company.VoedingPlanten.BloemVoeding;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EquivalentieklassenEnRandwaardenTest {
    Bloem madeliefje = null;
    Kas kas = null;

    @BeforeEach
    void setup(){
        kas = new Kas("Kas");
        madeliefje = new Bloem("Madeliefje", 0.20, new Benodigdheden(7,60,21), new BloemVoeding(3, 4, 6));
        new GeefPlantVoeding(madeliefje).geefVoeding(new Datum(1,1,2021));
        madeliefje.getPlantLevensduur().setHuidigeGroeiTijdWeken(7);
        kas.getKasPlanten().addPlant(madeliefje);
    }

    static Stream<Arguments> parametersHoeveelheid() {
        return Stream.of(
                Arguments.of(1, 0.8),
                Arguments.of(2, 1.60),
                Arguments.of(99, 79.2),
                Arguments.of(100, 42),
                Arguments.of(101, 42.8),
                Arguments.of(499, 361.2),
                Arguments.of(500, 330),
                Arguments.of(501, 330.8)
        );
    }

    @ParameterizedTest
    @MethodSource("parametersHoeveelheid")
    @DisplayName("Extra kosten test")
    void nettoWinstTest(int input, double input2) throws KanNietGeoogstWordenException {
        new OogstDePlantTesselaar(kas).oogstPlantSoort(new TesselaarOogst(madeliefje,new OogstDetails(input,1.0),"Algemeen",new TesselaarOogstFactory()));
        double Expected = input2;
        double Actual = kas.getKasWinst().getTotaleWinst();
        assertEquals(Expected,Actual,0.0001);
    }

    @AfterEach
    void reset(){
        madeliefje = null;
        kas = null;
    }
}
