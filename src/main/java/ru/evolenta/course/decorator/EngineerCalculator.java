package ru.evolenta.course.decorator;

class EngineerCalculator implements Calculator {

    @Override
    public double getResult(double a, double b) {
        return Math.pow(a, b);
    }
}