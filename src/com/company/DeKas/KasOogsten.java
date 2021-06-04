package com.company.DeKas;

import com.company.AskForInput;
import com.company.Exceptions.NietInDeKasException;
import com.company.Planten.Plant;

import java.util.ArrayList;

public class KasOogsten {
    private ArrayList<Oogst> Bewaart;
    private Kas kas;

    KasOogsten(Kas currentKas) {
        Bewaart = new ArrayList<>();
        this.kas = currentKas;
    }

    public ArrayList<Oogst> getOogstenLijst(){
        ArrayList<Oogst> dummy = new ArrayList<>();
        dummy.addAll(Bewaart);
        return dummy;
    }

    public boolean oogstPlantSoort(Plant plant, int Hoeveelheid, double prijsPerStuk, String Kwaliteit){// Voor testen
        if (kanGeoogstWorden(plant, Hoeveelheid)) {
            Oogst oogst = new Oogst(plant, Hoeveelheid, prijsPerStuk, Kwaliteit);
            geoogstePlant(oogst, plant);
            return true;
        }
        return false;
    }


    public boolean oogstPlantSoort() throws NietInDeKasException {
        Plant plant = new GetPlant(kas.getKasPlanten()).getTargetPlant();
        System.out.print("Wat is de hoeveelheid planten?: ");
        int hoeveelheid = AskForInput.vraagEenInt();
        System.out.print("Wat is de prijs per stuk?(€): ");
        double PPS = AskForInput.vraagEenDouble();
        System.out.print("Wat is de kwaliteit?(Goed/Algemeen/Slecht): ");
        String kwaliteit = AskForInput.vraagEenString();
        return oogstControle(plant,hoeveelheid,PPS,kwaliteit);
    }

    private boolean oogstControle(Plant plant, int Hoeveelheid, double prijsPerStuk, String Kwaliteit){
        if (kanGeoogstWorden(plant, Hoeveelheid)) {
            Oogst oogst = new Oogst(plant, Hoeveelheid, prijsPerStuk, Kwaliteit);
            geoogstePlant(oogst, plant);
            return true;
        }
        return false;
    }

    private boolean kanGeoogstWorden(Plant plant, int Hoeveelheid) {
        return new GetPlant(kas.getKasPlanten()).inDeKas(plant) && Volgroeid(plant) && Hoeveelheid >= 1;
    }

    private void geoogstePlant(Oogst oogst, Plant plant) {
        Bewaart.add(oogst);
        kas.getKasWinst().addWinst(oogst);
        kas.getKasPlanten().removePlant(plant);
    }

    private boolean Volgroeid(Plant plant) {
        return (plant.getBenodigdheden().getGroeiTijdWeken() + 1 == plant.getPlantLevensduur().getHuidigeGroeiTijdWeken()) || (plant.getBenodigdheden().getGroeiTijdWeken() - 1 == plant.getPlantLevensduur().getHuidigeGroeiTijdWeken())
                || (plant.getBenodigdheden().getGroeiTijdWeken() == plant.getPlantLevensduur().getHuidigeGroeiTijdWeken());
    }
}
