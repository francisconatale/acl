package org.example;

import java.util.Collections;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SharedBuffer<String> sharedBuffed = new SharedBuffer<>(5);
        LinkedList<String> suiteOfItems = new LinkedList<>();
        suiteOfItems.add("hola");
        suiteOfItems.add("como");
        suiteOfItems.add("estas");
        suiteOfItems.add("buen");
        suiteOfItems.add("dia");
        Collections.shuffle(suiteOfItems);
        Producer<String> producer = new Producer<>(sharedBuffed, suiteOfItems);
        Consumer<String> consumer = new Consumer<>(sharedBuffed);
        producer.start();
        consumer.start();
    }
}