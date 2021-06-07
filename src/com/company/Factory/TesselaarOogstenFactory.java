package com.company.Factory;

import com.company.Oogsten.BerekenPrijsPerStuk;
import com.company.Oogsten.Kwaliteit;
import com.company.Planten.Plant;

public interface TesselaarOogstenFactory {
    Kwaliteit maakKwaliteit(String kwaliteit);
    BerekenPrijsPerStuk maakBerekening(Kwaliteit kwaliteit, Plant plant, double pps);
}
