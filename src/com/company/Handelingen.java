package com.company;

class Handelingen {
    private String datum;
    private String Handeling;

    public Handelingen(int Dag, int Maand , int Jaar, String handleing) {
        this.datum = datum;
        this.Handeling = handleing;
    }
    public String correcteDatum(int Dag,int Maand, int Jaar){return "";}
    public String getDatum() {
        return datum;
    }

    public String getHandeling() {
        return Handeling;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setHandeling(String handeling) {
        this.Handeling = handeling;
    }

}
