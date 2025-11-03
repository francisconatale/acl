package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(5000);
        for (int i = 0; i < 50; i++) {
            new Thread(() -> cuenta.deposita(200)).start();
            new Thread(() -> cuenta.retira(200)).start();
        }
    }
}
