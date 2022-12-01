package oop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printResult(new Divide(), 9, 7);
    }

    static void printResult(Calculator calculator, double a, double b) {
        System.out.println(calculator.getResult(a, b));
    }
}
