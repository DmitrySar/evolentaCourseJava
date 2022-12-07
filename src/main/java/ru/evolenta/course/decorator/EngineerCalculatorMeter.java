package ru.evolenta.course.decorator;

class EngineerCalculatorMeter implements Calculator {

    private Calculator calculator;

    public EngineerCalculatorMeter(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double getResult(double a, double b) {
        long startTime = System.nanoTime();
        double result = calculator.getResult(a, b);
        long stopTime = System.nanoTime();
        System.out.printf("calculate time: %s ns\n", stopTime - startTime);
        return result;
    }
}
