package com.company.DeKas;

import com.company.Oogsten.Oogst;

public class KasWinst {
    private double totaleWinst;

    KasWinst(){
    }

    public double getTotaleWinst() {
        return totaleWinst;
    }

    public void addWinst (Oogst oogst){
        totaleWinst += oogst.getNettoWinst();
    }
}
