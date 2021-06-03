package com.company;

import com.company.DeKas.Oogst;
import com.company.Planten.Benodigdheden;
import com.company.Planten.Bloem;
import com.company.Planten.Datum;
import com.company.VoedingPlanten.GeefPlantVoeding;
import com.company.VoedingPlanten.BloemVoeding;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OogstTest {
    Bloem madeliefje = null;

    @BeforeEach
     void setup(){
        madeliefje = new Bloem("Madeliefje", 0.20, new Benodigdheden(0,60,21), new BloemVoeding(3, 4, 6));
        new GeefPlantVoeding(madeliefje).geefVoeding(new Datum(1,1,2021));
    }

    static Stream<Arguments> parametersPlanten() {
        return Stream.of(
                Arguments.of("Goed", 2.20),
                Arguments.of("Algemeen", 1.60),
                Arguments.of("Slecht", 1.0)
        );
    }

    @ParameterizedTest
    @MethodSource("parametersPlanten")
    @DisplayName("Netto Winst Test")
    //@CsvSource({"Goed,2.20","Algemeen, 1.60","Slecht,1.0"})
    void nettoWinstTest(String input, double input2) {
        Oogst testOogst = new Oogst(madeliefje,2,1.0,input);
        double Expected = input2;
        double Actual = testOogst.getNettoWinst();
        assertEquals(Expected,Actual,0.00000000001);
    }

    @AfterEach
    void reset(){
        madeliefje = null;
    }
}