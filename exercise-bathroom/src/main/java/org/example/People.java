package org.example;

public abstract class People extends Thread {
    boolean stepToTheBathroom = false;
    Bathroom bathroom;
    public People(Bathroom bathroom){
        this.bathroom = bathroom;
    }
    abstract boolean isGirl();

    public void changeStepToTheBathroom(){
        this.stepToTheBathroom = true;
    }

    @Override
    public void run() {
        while(!stepToTheBathroom){
            try {
                bathroom.requireJoin(this);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
