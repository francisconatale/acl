package org.example;

import java.util.concurrent.Semaphore;

public class Bathroom {
    Semaphore semaphore;
    int amountGirls;
    int amountBoys;

    public Bathroom(int capacity) {
        semaphore = new Semaphore(capacity);
        amountBoys = 0;
        amountGirls = 0;
    }

    public void requireJoin(People people) throws InterruptedException {
        semaphore.acquire();
        boolean pass = checkIfItCanPass(people);
        if (pass) {
            if(people.isGirl()){
                amountGirls++;
            } else {
                amountBoys++;
            }
            people.changeStepToTheBathroom();
            Thread.sleep(200);
            System.out.println("you were able to go to the bathroom, hurry up");
        } else {
            System.out.println("you couldn't go to the bathroom, hold on.");
        }
        semaphore.release();
    }

    public boolean checkIfItCanPass(People people) {
        return (people.isGirl() && amountBoys == 0) || (!people.isGirl() && amountGirls == 0);
    }
}
