package com.company.Planten;

import com.company.AskForInput;

public class Datum {
   String Datum;

   public Datum(int Dag, int Maand, int Jaar)  {//Voor testen
 this.Datum = datumOrganizer(Dag,Maand,Jaar);
    }

    public Datum(){
    this.Datum = maakDatum();
    }

private String maakDatum(){
    System.out.print("Voer de dag in: ");
    int dag2 = AskForInput.vraagEenInt();
    System.out.print("Voer de maand in: ");
    int maand2 = AskForInput.vraagEenInt();
    System.out.print("Voer het jaar in: ");
    int jaar2 = AskForInput.vraagEenInt();
    return datumOrganizer(dag2,maand2,jaar2);
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

    public void setDatum(int Dag, int Maand, int Jaar) {
        this.Datum = datumOrganizer(Dag,Maand,Jaar);
    }
}
