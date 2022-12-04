package ru.evolenta.course.oop;

public class Multiply implements Calculator {
    @Override
    public double getResult(double a, double b) {
        return a * b;
    }
}
