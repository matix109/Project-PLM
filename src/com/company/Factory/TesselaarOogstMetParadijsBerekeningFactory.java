package com.company.Factory;

import com.company.Oogsten.*;
import com.company.Planten.Plant;

public class TesselaarOogstMetParadijsBerekeningFactory implements TesselaarOogstenFactory{
    @Override
    public Kwaliteit maakKwaliteit(String kwaliteit) {
        return new ParadijsKwaliteit(kwaliteit);
    }

    @Override
    public BerekenPrijsPerStuk maakBerekening(Kwaliteit kwaliteit, PPSBerekeningPlantCalls calls, double pps) {
        return new ParadijsBerekeningPPS(kwaliteit,calls,pps);
    }
}
