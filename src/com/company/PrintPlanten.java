package com.company;

public class PrintPlanten {
    private KasPlanten kasPlanten;

    PrintPlanten(KasPlanten kasPlanten){
        this.kasPlanten = kasPlanten;
    }

    public void printHoeveelheidPlanten() {
        System.out.println(kasPlanten.getPlantenLijst().size());
    }

    public void printPlantenLijst() {
        for (int i = 0; i < kasPlanten.getPlantenLijst().size(); i++) {
            System.out.println(kasPlanten.getPlantenLijst().get(i).getNaam());
        }
    }
}
