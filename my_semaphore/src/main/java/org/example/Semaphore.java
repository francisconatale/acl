package org.example;

public class Semaphore {
    private int permits;
    private final int maxPermits;
    private final int initPermits;

    public Semaphore(int maxPermits, int initPermits) {
        this.maxPermits = maxPermits;
        this.permits = initPermits;
        this.initPermits = initPermits;
    }

    public int getPermits() {
        return permits;
    }

    // Operación P (request)
    public synchronized void request() throws InterruptedException {
        while (permits == 0) {
            wait(); // se bloquea hasta que haya permisos disponibles
        }
        permits--;
        notifyAll(); // opcional: despierta a otros posibles hilos
    }

    // Operación V (release)
    public synchronized void release() {
        while (permits == maxPermits) {
            try {
                wait(); // espera si está lleno (raro, pero posible)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        permits++;
        notifyAll(); // despierta a hilos que estaban esperando en request()
    }
}
