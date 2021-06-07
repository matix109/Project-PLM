package com.company.Planten;

public class PlantLevensduur {
    private int huidigeGroeiTijdWeken;

    PlantLevensduur(){
        huidigeGroeiTijdWeken = 0;
    }

    public void volgendeWeek(){
        this.huidigeGroeiTijdWeken = huidigeGroeiTijdWeken + 1;
    }

    public void setHuidigeGroeiTijdWeken(int huidigeGroeiTijdWeken) {
        this.huidigeGroeiTijdWeken = huidigeGroeiTijdWeken;
    }
    public int getHuidigeGroeiTijdWeken() {
        return this.huidigeGroeiTijdWeken;
    }
}
