package com.company.Exceptions;

public class KasBestaatNietException extends Exception {
    public KasBestaatNietException(String kasNaam) {
        super("De kas "+ kasNaam +" betaat niet.");
    }
}
