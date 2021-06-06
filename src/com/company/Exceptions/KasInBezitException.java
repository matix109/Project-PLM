package com.company.Exceptions;

public class KasInBezitException extends Exception{
    public KasInBezitException() {
        super("De kas die u probeert tie te voegen is al in u bezit.");
    }
}
