package com.company.Planten;

public abstract class SoortString {
    SoortString(){
    }
    public String getSoort(){
     return watVoorSoort();
    }
    abstract String watVoorSoort();
}
