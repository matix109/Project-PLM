package com.company.Exceptions;

public class KasEigenaarNietIngelogdException extends Exception{
    public KasEigenaarNietIngelogdException() {
        super("De kas eigenaar is niet ingelogd.");
    }
}
