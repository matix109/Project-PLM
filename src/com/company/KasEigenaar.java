package com.company;

public class KasEigenaar {
    private static KasEigenaar singleton;
    private KasEigenaarAccount Account;
    private KasEigenaarKassen Bezit;

    private KasEigenaar(){
        Account = new KasEigenaarAccount();
        Bezit = new KasEigenaarKassen();
    }

    public KasEigenaarKassen getBezit(){
        return Bezit;
    }

    public static KasEigenaar getInstance(){
        if(singleton == null){
            singleton = new KasEigenaar();
        }
        return singleton;
    }

    public KasEigenaarAccount getAccount(){
        return Account;
    }
}
