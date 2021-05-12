package com.company;

class Bloem extends Plant {
    private String Voeding;
    boolean Bio = true;

    Bloem(String naam, int groeiTijdWeken, double prijsOmTeGroeien, int Luchtvochtigheid, int Temperatuur, double Gro, double MiGro, double Bloom) {
        super(naam,groeiTijdWeken,prijsOmTeGroeien,Luchtvochtigheid,Temperatuur);
        setStringVoeding(Gro,MiGro,Bloom);
    }

    public double getBerekekningKwaliteit(String Kwaliteit, double prijsPerStuk){
        if (Kwaliteit.equalsIgnoreCase("slecht")) {
            return (prijsPerStuk / 100) * 30;
        } else if (Kwaliteit.equalsIgnoreCase("goed")) {
            return (prijsPerStuk / 100) * 30;
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

    public void setStringVoeding(double Gro, double MiGro, double Bloom) {
        Voeding =Gro + "ml Gro, " + MiGro + "ml MiGro en " + Bloom + "ml Bloom.";
    }

}
