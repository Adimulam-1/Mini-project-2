package com.example;

public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Hello from Mini Maven Application!");
        System.out.println("Addition: " + add(10, 20));
        System.out.println("Subtraction: " + subtract(20, 10));
    }
}
