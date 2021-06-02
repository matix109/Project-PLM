package com.company.Planten;

import java.util.ArrayList;

public class HandelingenList{
    private ArrayList<Handeling> handelingenLijst;

    HandelingenList(){
        this.handelingenLijst = new ArrayList<>();
    }

    public void resetHandelingen(){
        this.handelingenLijst = new ArrayList<>();
    }

    public void newHandeling(int dag,int maand,int jaar, String handeling){
    handelingenLijst.add(new Handeling(new Datum(dag,maand,jaar),handeling));
    }

    public ArrayList<Handeling> getHandelingenLijst(){
        ArrayList<Handeling> dummy = new ArrayList<>();
        dummy.addAll(handelingenLijst);
        return dummy;
    }
}
