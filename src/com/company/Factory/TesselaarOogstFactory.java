package com.company.Factory;

import com.company.Oogsten.*;
import com.company.Planten.Plant;

public class TesselaarOogstFactory implements TesselaarOogstenFactory{
    @Override
    public Kwaliteit maakKwaliteit(String kwaliteit) {
        return new TesselaarKwaliteit(kwaliteit);
    }

    @Override
    public BerekenPrijsPerStuk maakBerekening(Kwaliteit kwaliteit, Plant plant, double pps) {
        return new TesselaarBerekeningPPS(kwaliteit,plant,pps);
    }
}
