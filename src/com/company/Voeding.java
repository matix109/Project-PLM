package com.company;

import com.company.Exceptions.KasEigenaarNietIngelogdException;

public abstract class Voeding {
    Voeding(){}

    public String getStringVoeding(){
        return setStringVoeding();
    }

    public abstract String setStringVoeding();

    public abstract void setVoeding() throws KasEigenaarNietIngelogdException;
}
