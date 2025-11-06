package org;

public class FactorialWithThreads {
    int toCalculate;
    static int firstPartRes;
    static int secondPartRes;
    public FactorialWithThreads(int n){
        this.toCalculate = n;
    }
    public int calculate(){
        int firstPartInf = 1;
        int firstPartSup = toCalculate/2;
        int secondPartInf = firstPartSup + 1;
        int secondPartSup = toCalculate;

        Thread firstPart = new Thread(() -> {
            firstPartRes = calculateFactorialBounded(firstPartInf, firstPartSup);
        });

        Thread secondPart = new Thread(() -> {
            secondPartRes = calculateFactorialBounded(secondPartInf, secondPartSup);
        });

        firstPart.start();
        secondPart.start();
        try {
            firstPart.join();
            secondPart.join();
        } catch (InterruptedException e) {}
        return  firstPartRes * secondPartRes;
    }

    public int calculateFactorialBounded(int inf, int sup){
        int res = 1;
        for(int i = inf; i <= sup; i++){
            res *= i;
        }
        return res;
    }
}
