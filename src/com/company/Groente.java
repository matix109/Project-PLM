package com.company;

class Groente extends Plant {
    private String Voeding;
    boolean Bio = true;

    Groente(String naam, double prijsPerStuk, Benodigdheden benodigheid,double Gro, double MiGro) {
        super(naam,prijsPerStuk,benodigheid);
        setStringVoeding(Gro,MiGro);
    }

    public double getBerekekningKwaliteit(String Kwaliteit, double prijsPerStuk){
        if (Kwaliteit.equalsIgnoreCase("slecht")) {
            return (prijsPerStuk / 100) * 20;
        } else if (Kwaliteit.equalsIgnoreCase("goed")) {
            return (prijsPerStuk / 100) * 20;
        }
        return 0;
    }

    public void geefVoeding(int Dag,int Maand,int Jaar) {
        addHandeling(new Handelingen(Dag,Maand,Jaar, "Krijgt: "+ Voeding));
        this.Bio = false;
    }
    public boolean getBio(){
        return Bio;
    }

    public String getVoeding() {
        return Voeding;
    }

    public void setStringVoeding(double Gro, double MiGro) {
        Voeding = Gro + "ml Gro en " + MiGro + "ml MiGro.";
    }
}
