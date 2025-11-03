package org.example;

public class Consumer<T> extends Thread {
    private final SharedBuffer<T> sharedBuffer;

    public Consumer(SharedBuffer<T> sharedBuffer){
        this.sharedBuffer = sharedBuffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
               T item =  sharedBuffer.take_element();
               System.out.println(item.toString());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
