package com.company;

public class Phone <K extends Number,Y extends Number> implements Phonable<Y> {

    private K code;
    private Y number;

    public Phone(K code) {
        this.code = code;
    }

    @Override
    public void phone(Y number) {
        this.number = number;
        System.out.println("Звоним на номер: " + code + number);
    }

}
