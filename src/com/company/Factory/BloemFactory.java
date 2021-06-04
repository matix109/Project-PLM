package com.company.Factory;
import com.company.Planten.BloemSoort;
import com.company.Planten.Benodigdheden;
import com.company.Planten.BloemBenodigdheden;
import com.company.VoedingPlanten.BloemVoeding;
import com.company.VoedingPlanten.Voeding;

public class BloemFactory implements PlantenFactory {

    @Override
    public String soortPlant() {
     return new BloemSoort().getSoort();
    }

    @Override
    public Benodigdheden plantBenodighdheden() {
        return new BloemBenodigdheden().maakBenodigdheden();
    }

    @Override
    public Voeding plantVoeding() {
        return new BloemVoeding();
    }
}
