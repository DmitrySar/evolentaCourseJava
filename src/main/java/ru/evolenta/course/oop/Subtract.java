package ru.evolenta.course.oop;

public class Subtract implements Calculator {
    @Override
    public double getResult(double a, double b) {
        return a - b;
    }
}
