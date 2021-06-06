package com.company.VoedingPlanten;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.KasEigenaar.Login;

public class BloemVoeding extends Voeding{


    public BloemVoeding(double Gro, double MiGro, double Bloom){
        super(Gro, MiGro, Bloom);
    }


   public void setVoeding(double Gro, double MiGro, double Bloom) throws KasEigenaarNietIngelogdException {
       if(Login.getInstance().kasEigenaarIngelogd()) {
           super.setGro(Gro);
           super.setMiGro(MiGro);
           super.setBloom(Bloom);
       }
       else {
           throw new KasEigenaarNietIngelogdException();
       }
    }

    @Override
    public String hoeveelGro() {
        return getGro() + "ml Gro, ";
    }

    @Override
    public String hoeveelMiGro() {
        return getMiGro() + "ml MiGro en ";
    }

    @Override
    public String hoeveelBloom() {
        return getBloom() + "ml Bloom.";
    }
}
