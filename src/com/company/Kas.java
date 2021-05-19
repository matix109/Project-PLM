package com.company;

import java.util.ArrayList;

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
    oogst.addWinstKas(this);
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

    public void getBloemenLijst() {
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
    }

    public void getOogstenKas(){
        for (int i = 0; i < Bewaart.size(); i++) {
            System.out.print("De plant "+ Bewaart.get(i).getNaam() +" had een oogst van "+ Bewaart.get(i).getHoeveelheid()+
                    " wat "+ Bewaart.get(i).getNettoWinst()+" euro opleverde\n");
        }
    }

    public int getHoeveelheidBloemen() {
        int a =0;
        for (int i = 0; i < groeitIn.size(); i++) {

            if (groeitIn.get(i) instanceof Bloem) {
                a++;
            }
        }
        return a;
    }
public void addPlant(Plant plant){
groeitIn.add(plant);
}

    public int getHoeveelheidGroentes() {
        int a = 0;
        for (int i = 0; i < groeitIn.size(); i++) {
            if (groeitIn.get(i) instanceof Groente) {
                a++;
            }
        }
        return a;
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

    public void addWinst(double Winst) {
    totaleWinst += Winst;

    }

    public void removePlant(Plant plant) {
            if (inDeKas(plant)) {
                groeitIn.remove(plant);
                plant.resetHandelingen();
            }
        }
    }

