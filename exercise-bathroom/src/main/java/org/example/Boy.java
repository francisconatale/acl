package org.example;

public class Boy extends People {

    public Boy(Bathroom bathroom) {
        super(bathroom);
    }

    @Override
    boolean isGirl() {
        return false;
    }
}

