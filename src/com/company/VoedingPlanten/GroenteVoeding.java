package com.company.VoedingPlanten;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.KasEigenaar.Login;

public class GroenteVoeding extends Voeding{

    public GroenteVoeding(double Gro, double MiGro){
    super(Gro,MiGro,0);
    }

    public void setVoeding(double Gro, double MiGro, double Blank) throws KasEigenaarNietIngelogdException {
        if(Login.getInstance().kasEigenaarIngelogd()) {
            super.setGro(Gro);
            super.setMiGro(MiGro);
        }
        else {
            throw new KasEigenaarNietIngelogdException();
        }
    }

    @Override
    public String hoeveelGro() {
        return getGro() + "ml Gro en ";
    }

    @Override
    public String hoeveelMiGro() {
        return getMiGro() + "ml MiGro";
    }

    @Override
    public String hoeveelBloom() {
        return ".";
    }

}
