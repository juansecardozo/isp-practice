package org.example.isp;

public class Bird implements Animal, Runnable, Flyable {
    @Override
    public void run() {
        System.out.println("Bird is running");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bird is chirping");
    }
}
