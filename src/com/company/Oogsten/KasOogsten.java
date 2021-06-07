package com.company.Oogsten;

import com.company.DeKas.GetPlant;
import com.company.DeKas.Kas;
import com.company.Planten.Plant;

import java.util.ArrayList;

public class KasOogsten{
    private ArrayList<Oogst> Bewaart;

    public KasOogsten() {
        Bewaart = new ArrayList<>();
    }

    public ArrayList<Oogst> getOogstenLijst(){
        ArrayList<Oogst> dummy = new ArrayList<>();
        dummy.addAll(Bewaart);
        return dummy;
    }
    public void addOogst(Oogst oogst){
        Bewaart.add(oogst);
    }
}
