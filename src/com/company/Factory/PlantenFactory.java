package com.company.Factory;
import com.company.Planten.Plant;


public abstract class PlantenFactory {
    public static BloemFactory Bloem_Factory = new BloemFactory();
    public static GroenteFactory Groente_Factory = new GroenteFactory();

    public abstract Plant maakPlant();
}
