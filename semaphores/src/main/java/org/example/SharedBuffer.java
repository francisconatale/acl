package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class SharedBuffer<T>{
    private final Semaphore full;
    private final Semaphore empty;
    private final Semaphore mutex;
    private final Queue<T> queue;

    public SharedBuffer(int capacity) {
        full = new Semaphore(capacity);
        empty = new Semaphore(0);
        mutex = new Semaphore(1);
        queue = new LinkedList<>();
    }
    public void append_element(T item) throws InterruptedException {
        full.acquire();
        mutex.acquire();
        queue.add(item);
        mutex.release();
        empty.release();
    }

    public T take_element() throws InterruptedException {
        empty.acquire();
        if(mutex.availablePermits() == 0){
            System.out.println("im waiting");
        }
        mutex.acquire();
        T element = queue.poll();
        mutex.release();
        full.release();
        return element;
    }

}
