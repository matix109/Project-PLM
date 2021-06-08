package com.company.DeKas;

import com.company.Menu.AskForInput;
import com.company.Exceptions.NietInDeKasException;
import com.company.Planten.Plant;

public class GetPlant {
private KasPlanten kasPlanten;

    public GetPlant(KasPlanten kasPlanten){
        this.kasPlanten = kasPlanten;
    }

    public Plant getTargetPlant(String plantNaam) throws NietInDeKasException {
        Plant dummy;
        for (int i = 0; i < kasPlanten.getPlantenLijst().size(); i++) {
            if(kasPlanten.getPlantenLijst().get(i).getNaam().equalsIgnoreCase(plantNaam)){
                dummy = kasPlanten.getPlantenLijst().get(i);
                return dummy;
            }
        }
        throw new NietInDeKasException();
    }

    public boolean inDeKas(Plant plant){
        for (int i = 0; i < kasPlanten.getPlantenLijst().size(); i++) {
            if (kasPlanten.getPlantenLijst().get(i).getNaam().equals(plant.getNaam())) {
                return true;
            }
        }
        return false;
    }

}
