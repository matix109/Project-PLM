package com.company;

class Bloem extends Plant {
    private String Voeding;

    Bloem(String naam, double prijsPerStuk,Benodigdheden benodigheid, double Gro, double MiGro, double Bloom) {
        super(naam,prijsPerStuk,benodigheid);
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

    public String getVoeding() {
        return Voeding;
    }

    public void setStringVoeding(double Gro, double MiGro, double Bloom) {
        Voeding =Gro + "ml Gro, " + MiGro + "ml MiGro en " + Bloom + "ml Bloom.";
    }

}
