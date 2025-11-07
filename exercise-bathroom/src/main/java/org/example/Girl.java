package org.example;

public class Girl extends People {
    public Girl(Bathroom bathroom) {
        super(bathroom);
    }

    @Override
    boolean isGirl() {
        return true;
    }
}
