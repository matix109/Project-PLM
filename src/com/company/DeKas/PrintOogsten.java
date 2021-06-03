package com.company.DeKas;

public class PrintOogsten {
    private KasOogsten kasOogsten;

    public PrintOogsten(Kas kas){
        this.kasOogsten = kas.getKasOogsten();
    }

    public void printOogstenKas () {
        for (int i = 0; i < kasOogsten.getOogstenLijst().size(); i++) {
            System.out.print("De plant " + kasOogsten.getOogstenLijst().get(i).getNaam() + " had een oogst van " + kasOogsten.getOogstenLijst().get(i).getHoeveelheid() +
                    " wat €" + kasOogsten.getOogstenLijst().get(i).getNettoWinst() + " opleverde\n");
        }
    }

    public void printHoeveelheidSoortenOogst() {
        System.out.print(kasOogsten.getOogstenLijst().size());
    }

}
