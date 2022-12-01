package oop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ExtCalculator calculator = new ExtCalculator();
        System.out.println(calculator.divide(9.0, 7.0));
        System.out.println(calculator.divide(9, 7));
    }
}
