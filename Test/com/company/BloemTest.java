package com.company;

import com.company.Planten.Benodigdheden;
import com.company.Planten.Bloem;
import com.company.VoedingPlanten.GeefPlantVoeding;
import com.company.VoedingPlanten.BloemVoeding;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloemTest {
    @Test
    @DisplayName("Voeding geven test")
    void geefVoedingTest(){
        Bloem madeliefje = new Bloem("Madeliefje",0.20,new Benodigdheden(7,60,21),new BloemVoeding(3,4,6));
        new GeefPlantVoeding(madeliefje).geefVoeding(1,1,1999);
        int Expected = 1;
        int Actual = madeliefje.getHandelingen().getHandelingenLijst().size();
        assertEquals(Expected,Actual);
    }

}