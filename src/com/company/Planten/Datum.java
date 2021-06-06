package com.company.Planten;

public class Datum {
   String Datum;

   public Datum(int Dag, int Maand, int Jaar)  {//Voor testen
 this.Datum = datumOrganizer(Dag,Maand,Jaar);
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

    public String getDatumString() {
        return Datum;
    }
}
