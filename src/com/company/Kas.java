package com.company;

import com.company.Exceptions.KasBestaatNietException;
import com.company.Exceptions.NietInDeKasException;

import java.util.ArrayList;
import java.util.Scanner;

class Kas {
    private String Naam;
    private ArrayList<Oogst> Bewaart;
    private ArrayList<Plant> groeitIn;
    private double totaleWinst;

Kas(String naam){
    this.Naam = naam;
    Bewaart = new ArrayList<>();
    groeitIn = new ArrayList<>();
}

public String getKasNaam(){
    return Naam;
}

    public Kas getKas(String name) throws KasBestaatNietException {
        if(name.equals(getKasNaam())){
            return this;
        }
        else {
            throw new KasBestaatNietException(name);
        }
    }

    public Plant getTargetPlant() throws NietInDeKasException {
        Scanner scanner = new Scanner(System.in);
        Plant dummy;
        System.out.print("Voer de naam van de plant in:");
        String plantNaam = scanner.nextLine();
        for (int i = 0; i < groeitIn.size(); i++) {
            if(groeitIn.get(i).getNaam().equalsIgnoreCase(plantNaam)){
            dummy = groeitIn.get(i);
            return dummy;
            }
        }
        throw new NietInDeKasException();
    }

    public boolean oogstPlantSoort(Plant plant, int Hoeveelheid, double prijsPerStuk, String Kwaliteit) {
        if (kanGeoogstWorden(plant,Hoeveelheid)) {
            Oogst oogst = new Oogst(plant, Hoeveelheid, prijsPerStuk, Kwaliteit);
            geoogstePlant(oogst,plant);
            return true;
        }
            return false;
    }


    private boolean kanGeoogstWorden(Plant plant, int Hoeveelheid){
    return inDeKas(plant) && Volgroeid(plant) && Hoeveelheid >= 1;
    }

private void geoogstePlant(Oogst oogst, Plant plant){
    Bewaart.add(oogst);
    addWinst(oogst);
    removePlant(plant);
}

    private boolean Volgroeid(Plant plant){
       return (plant.getBenodigdheden().getGroeiTijdWeken() + 1 == plant.getHuidigeGroeiTijdWeken()) || (plant.getBenodigdheden().getGroeiTijdWeken() - 1 == plant.getHuidigeGroeiTijdWeken())
                || (plant.getBenodigdheden().getGroeiTijdWeken() == plant.getHuidigeGroeiTijdWeken());
    }

    private boolean inDeKas(Plant plant){
        for (int i = 0; i < groeitIn.size(); i++) {
            if (groeitIn.get(i).getNaam().equals(plant.getNaam())) {
                return true;
            }
        }
        return false;
    }

    public void getPlantenLijst() {
         for (int i = 0; i < groeitIn.size(); i++) {
             System.out.println(groeitIn.get(i).getNaam());
         }
   }

/*    public void getBloemenLijst() {
        for (int i = 0; i < groeitIn.size(); i++) {
            if (groeitIn.get(i) instanceof Bloem) {
                System.out.println(groeitIn.get(i).getNaam());
            }
        }
    }

    public void getGroenteLijst() {
        for (int i = 0; i < groeitIn.size(); i++) {
            if(groeitIn.get(i) instanceof Groente) {
                System.out.println(groeitIn.get(i).getNaam());
            }
        }
    }*/

    /*    public int getHoeveelheidBloemen() {
        int a =0;
        for (int i = 0; i < groeitIn.size(); i++) {

            if (groeitIn.get(i) instanceof Bloem) {
                a++;
            }
        }
        return a;
    }

    public int getHoeveelheidGroentes() {
        int a = 0;
        for (int i = 0; i < groeitIn.size(); i++) {
            if (groeitIn.get(i) instanceof Groente) {
                a++;
            }
        }
        return a;
    }*/

    public void getOogstenKas(){
        for (int i = 0; i < Bewaart.size(); i++) {
            System.out.print("De plant "+ Bewaart.get(i).getNaam() +" had een oogst van "+ Bewaart.get(i).getHoeveelheid()+
                    " wat €"+ Bewaart.get(i).getNettoWinst()+" opleverde\n");
        }
    }
    public void addPlant(Plant plant){
        groeitIn.add(plant);
    }



    public int getHoeveelheidPlanten() {
        int i;
       for (i = 0; i < groeitIn.size(); i++) {
        }
        return i;
    }

    public int getHoeveelheidSoortenOogst() {
        int i;
        for (i = 0; i < Bewaart.size(); i++) {
        }
        return i;
    }

    public double getTotaleWinst() {
        return totaleWinst;
    }

    private void addWinst(Oogst oogst) {
    totaleWinst += oogst.getNettoWinst();
    }

    public void removePlant(Plant plant) {
            if (inDeKas(plant)) {
                groeitIn.remove(plant);
                plant.resetHandelingen();
            }
        }
    }

