package com.company.Exceptions;

public class NietInDeKasException extends Exception{
    public NietInDeKasException() {
        super("De plant staat niet in de kas");
    }
}
