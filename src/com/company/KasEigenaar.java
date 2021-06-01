package com.company;

import com.company.Exceptions.KasBestaatNietException;
import com.company.Exceptions.KasEigenaarNietIngelogdException;

import java.util.ArrayList;
import java.util.Scanner;

public class KasEigenaar {
    private static KasEigenaar singleton;
    private KasEigenaarAccount Account;
    private ArrayList<Kas> Bezit;


    private KasEigenaar(){
        Account = new KasEigenaarAccount();
        Bezit = new ArrayList<>();
        Bezit.add(new Kas("Dummy"));
    }

    public static KasEigenaar getInstance(){
        if(singleton == null){
            singleton = new KasEigenaar();
        }
        return singleton;
    }

    public int getKassenSize(){
        return Bezit.size();
    }

    public KasEigenaarAccount getAccount(){
        return Account;
    }

    public boolean bezitDeKas(String kas){
        for (int i = 0; i < Bezit.size(); i++) {
            if (Bezit.get(i).getKasNaam().equals(kas)) {
                return true;
            }
        }
        return false;
    }

    public Kas getKasInBezit(String name) throws KasBestaatNietException {
        for (int i = 0; i < Bezit.size(); i++) {
            if (Bezit.get(i).getKasNaam().equals(name)) {
                return Bezit.get(i);
            }
        }
throw new KasBestaatNietException(name);
    }

    public void addKas(Kas kas) throws KasEigenaarNietIngelogdException {
        if(Login.getInstance().kasEigenaarIngelogd()) {
            Bezit.add(kas);
        }
        else {
            throw new KasEigenaarNietIngelogdException();
        }
    }

    public void removeKas(Kas kas){
    if(bezitDeKas(kas.getKasNaam())){
        Bezit.remove(kas);
    }
    }
}
