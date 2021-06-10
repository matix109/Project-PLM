package com.company.Exceptions;

import com.company.Planten.Plant;

public class KanNietGeoogstWordenException extends Exception{
    public KanNietGeoogstWordenException(Plant plant) {
        super("De oogst van "+plant.getNaam()+" voldoet niet aan de eisen.");
    }
}
