package com.company;

class Handelingen {
    private String datum;
    private String Handeling;

    public Handelingen(int Dag, int Maand , int Jaar, String handleing) {
        this.datum = datumOrganizer(Dag,Maand,Jaar);
        this.Handeling = handleing;
    }

    private String datumOrganizer(int Dag, int Maand, int Jaar){
        String datum;
        if (Dag < 10){
            datum =""+0+Dag+"/";
        }
        else{
            datum = Dag + "/";
        }
        if (Maand < 10 ){
            datum = datum + 0 +Maand+"/";
        }
        else{
            datum = datum + Maand + "/";
        }
       return datum + Jaar;
    }

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
