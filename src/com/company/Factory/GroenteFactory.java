package com.company.Factory;
import com.company.Planten.Groente;
import com.company.Planten.Plant;

public class GroenteFactory extends PlantenFactory {
    @Override
    public Plant maakPlant() {
        return new Groente();
    }
}
