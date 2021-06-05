package com.company.Factory;

import com.company.Oogsten.BerekenPrijsPerStuk;
import com.company.Oogsten.Kwaliteit;
import com.company.Planten.Plant;

public interface TesselaarOogstenFactory {
    public Kwaliteit maakKwaliteit(String kwaliteit);
    public BerekenPrijsPerStuk maakBerekening(Kwaliteit kwaliteit, Plant plant, double pps);
}
