package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloemTest {
    @Test
    @DisplayName("Voeding geven test")
    void geefVoedingTest(){
        Bloem madeliefje = new Bloem("Madeliefje",0.20,new Benodigdheden(7,60,21),new BloemVoeding(3,4,6));
        new GeefPlantVoeding().geefVoeding(madeliefje,1,1,1999);
        int Expected = 1;
        int Actual = madeliefje.getHandelingen().getLijst().size();
        assertEquals(Expected,Actual);
    }

}