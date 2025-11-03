package org.example;

public class Cuenta {
    private int saldo;
    public Cuenta(int saldoInicial) {
        saldo = saldoInicial;
    }
    public synchronized void deposita(int monto) {
        System.out.println("Saldo antes de depositar: " + saldo);
        saldo += monto;
        System.out.println("Saldo despues de depositar: " + saldo);
    }
    public synchronized void retira(int monto) {
        System.out.println("Saldo antes de retirar: " + saldo);
        saldo -= monto;
        System.out.println("Saldo despues de retirar: " + saldo);

    }
    public int getSaldo() { return saldo; }
}