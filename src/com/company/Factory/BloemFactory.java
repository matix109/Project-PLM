package com.company.Factory;
import com.company.Planten.Bloem;
import com.company.Planten.Plant;

public class BloemFactory extends PlantenFactory {
    @Override
    public Plant maakPlant() {
        return new Bloem();
    }
}
