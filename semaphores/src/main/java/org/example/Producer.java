package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Producer<T> extends Thread {
    SharedBuffer<T> sharedBuffer;
    List<T> suiteOfItems;

    public Producer(SharedBuffer<T> sharedBuffer, List<T> suiteOfItems ) {
        this.sharedBuffer = sharedBuffer;
        this.suiteOfItems = suiteOfItems;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            try {
                sharedBuffer.append_element(suiteOfItems.removeFirst());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
