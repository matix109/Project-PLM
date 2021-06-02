package com.company;

import com.company.Exceptions.NietInDeKasException;

public class GetPlant {
private KasPlanten kasPlanten;

    GetPlant(KasPlanten kasPlanten){
        this.kasPlanten = kasPlanten;
    }

    public Plant getTargetPlant() throws NietInDeKasException {
        Plant dummy;
        System.out.print("Voer de naam van de plant in:");
        String plantNaam = AskForInput.vraagEenString();
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
