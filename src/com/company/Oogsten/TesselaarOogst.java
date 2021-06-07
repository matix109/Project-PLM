package com.company.Oogsten;
import com.company.Factory.TesselaarOogstenFactory;
import com.company.Planten.Plant;

public class TesselaarOogst extends Oogst {
    private double kosten;
    private double Winst;

    public TesselaarOogst(Plant plant, int Hoeveelheid, double PrijsPerStuk, String Kwaliteit, TesselaarOogstenFactory oogst) {
        super(plant, Hoeveelheid, PrijsPerStuk);
        Kwaliteit kwaliteit = oogst.maakKwaliteit(Kwaliteit);
        this.Winst = Hoeveelheid * oogst.maakBerekening(kwaliteit,plant,PrijsPerStuk).getPrijsPerStuk();
        this.kosten = plant.getPrijsOmTeGroeien() * Hoeveelheid + extraKosten();
    }

    public int extraKosten(){
        if (getHoeveelheid() >= 500){
            return 70;
        }
        else if (getHoeveelheid() >= 100){
            return 38;
        }
        return 0;
    }

    public double getNettoWinst() {
        return getWinst() - kosten;
    }

    public double getWinst() {
        return Winst;
    }

}
