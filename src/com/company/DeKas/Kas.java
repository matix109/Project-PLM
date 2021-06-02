package com.company.DeKas;

public class Kas {
    private String Naam;
    private KasOogsten oogst;
    private KasPlanten plant;
    private KasWinst winst;

public Kas(String naam){
    this.Naam = naam;
    this.oogst = new KasOogsten(this);
    this.plant = new KasPlanten();
    this.winst = new KasWinst();
}
public KasPlanten getKasPlanten(){
    return plant;
}

public KasOogsten getKasOogsten(){
    return oogst;
}

public KasWinst getKasWinst(){
    return winst;
}

public String getKasNaam(){
    return Naam;
}

}

