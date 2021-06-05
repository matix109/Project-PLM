package com.company.VoedingPlanten;
import com.company.Exceptions.KasEigenaarNietIngelogdException;
import com.company.KasEigenaar.Login;

public abstract class Voeding {
    private double Gro;
    private double MiGro;
    private double Bloom;

    Voeding(double Gro,double MiGro, double Bloom){
        this.Gro =  Gro;
        this.MiGro = MiGro;
        this.Bloom = Bloom;
    }


    public String getStringVoeding(){
     String Voeding = hoeveelGro() + hoeveelMiGro() + hoeveelBloom();
        return Voeding;
    }

    abstract public void setVoeding(double Gro, double MiGro, double Bloom) throws KasEigenaarNietIngelogdException;

    public abstract String hoeveelGro();
    public abstract String hoeveelMiGro();
    public abstract String hoeveelBloom();

    public double getMiGro() {
        return MiGro;
    }

    public void setGro(double gro) throws KasEigenaarNietIngelogdException {
        if(Login.getInstance().kasEigenaarIngelogd()) {
            this.Gro = gro;
        }
        else {
            throw new KasEigenaarNietIngelogdException();
        }

    }

    public double getGro() {
        return Gro;
    }

    public void setMiGro(double miGro) throws KasEigenaarNietIngelogdException {
        if(Login.getInstance().kasEigenaarIngelogd()) {
            this.MiGro = miGro;
        }
        else {
            throw new KasEigenaarNietIngelogdException();
        }

    }

    public void setBloom(double bloom) throws KasEigenaarNietIngelogdException {
        if(Login.getInstance().kasEigenaarIngelogd()) {
            this.Bloom = bloom;
        }
        else {
            throw new KasEigenaarNietIngelogdException();
        }

    }

    public double getBloom() {
        return Bloom;
    }

}
