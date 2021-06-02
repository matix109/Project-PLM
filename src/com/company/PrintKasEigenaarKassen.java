package com.company;

public class PrintKasEigenaarKassen {
    private KasEigenaarKassen kasEigenaarKassen;

    PrintKasEigenaarKassen(KasEigenaarKassen kasEigenaarKassen){
        this.kasEigenaarKassen = kasEigenaarKassen;
    }

    public void printHoeveelheidKassen(){
        System.out.println(kasEigenaarKassen.getKassenLijst().size());
    }
}
