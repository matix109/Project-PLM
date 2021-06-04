package com.company.DeKas;

public class PrintPlanten {
    private KasPlanten kasPlanten;

    public PrintPlanten(Kas kas){
        this.kasPlanten = kas.getKasPlanten();
    }

    public void printHoeveelheidPlanten() {
        System.out.print(kasPlanten.getPlantenLijst().size());
    }

    public void printPlantenLijst() {
        for (int i = 0; i < kasPlanten.getPlantenLijst().size(); i++) {
            System.out.println(kasPlanten.getPlantenLijst().get(i).getNaam());
        }
    }
}
