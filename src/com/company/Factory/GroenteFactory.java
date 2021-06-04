package com.company.Factory;
import com.company.Planten.GroenteSoort;
import com.company.Planten.*;
import com.company.VoedingPlanten.GroenteVoeding;
import com.company.VoedingPlanten.Voeding;

public class GroenteFactory implements PlantenFactory {
    @Override
    public String soortPlant() {
        return new GroenteSoort().getSoort();
    }

    @Override
    public Benodigdheden plantBenodighdheden() {
        return new GroenteBenodigdheden().maakBenodigdheden();
    }

    @Override
    public Voeding plantVoeding() {
        return new GroenteVoeding();
    }
}
