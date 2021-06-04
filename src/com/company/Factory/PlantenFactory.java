package com.company.Factory;
import com.company.Planten.Benodigdheden;
import com.company.Planten.Plant;
import com.company.VoedingPlanten.Voeding;


public interface PlantenFactory {// interface maken en niet een plant latten aanmaken maar onderdelen van een plant
    String soortPlant();
    Benodigdheden plantBenodighdheden();
    Voeding plantVoeding();
}
