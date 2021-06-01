package com.company;

public class Handeling{
    private Datum datum;
    private String Handeling;

    public Handeling(Datum datum, String Handeling){
        this.datum = datum;
        this.Handeling = Handeling;
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
