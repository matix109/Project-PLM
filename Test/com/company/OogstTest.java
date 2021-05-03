package com.company;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OogstTest {
    Bloem madeliefje = null;

    @BeforeEach
     void setup(){
        madeliefje = new Bloem("Madeliefje", 7, 0.20, 60, 21, 3, 4, 6);
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