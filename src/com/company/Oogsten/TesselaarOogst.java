package com.company.Oogsten;
import com.company.Factory.TesselaarOogstenFactory;
import com.company.Planten.Plant;

public class TesselaarOogst extends Oogst {
    private double kosten;
    private double Winst;

    public TesselaarOogst(Plant plant, OogstDetails details, String Kwaliteit, TesselaarOogstenFactory oogst) {
        super(plant,details);
        Kwaliteit kwaliteit = oogst.maakKwaliteit(Kwaliteit);
        this.Winst = details.getHoeveelheid() * oogst.maakBerekening(kwaliteit,plant,details.getPrijsPerStuk()).getPrijsPerStuk();
        this.kosten = plant.getPrijsOmTeGroeien() * details.getHoeveelheid() + extraKosten();
    }

    public int extraKosten(){
        if (getOogstDetails().getHoeveelheid() >= 500){
            return 70;
        }
        else if (getOogstDetails().getHoeveelheid() >= 100){
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
