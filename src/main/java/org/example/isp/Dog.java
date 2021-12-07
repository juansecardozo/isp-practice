package org.example.isp;

public class Dog implements Animal, Runnable {
    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is barking");
    }
}
