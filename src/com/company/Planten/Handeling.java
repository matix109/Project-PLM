package com.company.Planten;

import com.company.AskForInput;

public class Handeling{// deze abstract maken voor andere handelingen bijvoorbeeld zo als voeding geven dan doet die iets anders
    private Datum datum;
    private String Handeling;

    public Handeling(Datum datum, String Handeling){//Voor testen
        this.datum = datum;
        this.Handeling = Handeling;
    }

    public Handeling(){
    maakHandeling();
    }

    private void maakHandeling(){
        this.datum = new Datum();
        System.out.print("Wat voor handleing gaat u verrichten?: ");
        this.Handeling = AskForInput.vraagEenString();
    }

    @Override
    public String toString() {
       return datum.getDatumString() +" "+ Handeling;
    }

    public Datum getDatum() {
        return datum;
    }

    public String getHandeling() {
        return Handeling;
    }

    public void setDatum(int Dag, int Maand, int Jaar) {
        this.datum = new Datum(Dag,Maand,Jaar);
    }

    public void setHandeling(String handeling) {
        this.Handeling = handeling;
    }
}
