package com.company;

import com.company.Exceptions.KasEigenaarNietIngelogdException;

public class Voeding {
    double Gro =0;
    double MiGro=0;
    double Bloom=0;

    Voeding(double Gro, double MiGro, double Bloom){
        this.Gro =Gro;
        this.MiGro = MiGro;
        this.Bloom =Bloom;
    }

    Voeding(double Gro, double MiGro){
    this.Gro =Gro;
    this.MiGro = MiGro;
    }

    public void setVoeding(double Gro, double MiGro, double Bloom) throws KasEigenaarNietIngelogdException {
        if(Login.getInstance().kasEigenaarIngelogd()) {
            this.Gro = Gro;
            this.MiGro = MiGro;
            this.Bloom = Bloom;
        }
        else {
            throw new KasEigenaarNietIngelogdException();
        }
    }

    public String getStringVoeding(){
            if (Bloom == 0) {
                return Gro + "ml Gro en " + MiGro + "ml MiGro.";
            } else {
                return Gro + "ml Gro, " + MiGro + "ml MiGro en " + Bloom + "ml Bloom.";
            }
    }

    }
