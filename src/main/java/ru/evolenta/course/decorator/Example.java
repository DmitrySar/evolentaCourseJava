package ru.evolenta.course.decorator;

public class Example {
    public static void main(String[] args) {
        System.out.print("result: ");
        System.out.println(new EngineerCalculatorMeter(new EngineerCalculator()).getResult(300.3, 40.4));
    }
}


