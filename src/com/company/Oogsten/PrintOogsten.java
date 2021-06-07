package com.company.Oogsten;

import com.company.DeKas.Kas;

public class PrintOogsten {
    private KasOogsten kasOogsten;

    public PrintOogsten(Kas kas){
        this.kasOogsten = kas.getKasOogsten();
    }

    public void printOogstenKas () {
        for (int i = 0; i < kasOogsten.getOogstenLijst().size(); i++) {
            System.out.print("De plant " + kasOogsten.getOogstenLijst().get(i).getPlant().getNaam() + " had een oogst van " + kasOogsten.getOogstenLijst().get(i).getOogstDetails().getHoeveelheid() +
                    " wat €");
            System.out.printf("%.2f opleverde.\n",kasOogsten.getOogstenLijst().get(i).getNettoWinst());
        }
    }

    public void printHoeveelheidSoortenOogst() {
        System.out.print(kasOogsten.getOogstenLijst().size());
    }

}
