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

    public void newHandeling(Datum datum, String handeling){//Voor testen
    handelingenLijst.add(new Handeling(datum,handeling));
    }

    public void newHandeling(){
        handelingenLijst.add(new Handeling());
    }

    public ArrayList<Handeling> getHandelingenLijst(){
        ArrayList<Handeling> dummy = new ArrayList<>();
        dummy.addAll(handelingenLijst);
        return dummy;
    }
}
