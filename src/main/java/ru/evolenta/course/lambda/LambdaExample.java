package ru.evolenta.course.lambda;

import ru.evolenta.course.oop.Calculator;
import ru.evolenta.course.oop.Divide;

public class LambdaExample {
    public static void main(String[] args) {
        Calculator calculator = new Divide();
        System.out.println(calculator.getResult(2, 3));

        //Реализация интерфейса с помощью анонимного класса
        calculator = new Calculator() {
            @Override
            public double getResult(double a, double b) {
                return (a + b) / 2;
            }
        };

        //Лямбда выражения () -> {...}
        //Если у интерфейса один метод, такой интерфейс является функциональным
        calculator = (a, b) -> (a + b) / 2;
        System.out.println(calculator.getResult(2, 3));

        //Передача в метод
        lambdaDemo((a, b) -> (a + b) / 2, 2, 3);

        //Прямые ссылки на метод - ::
        /*
            ссылка на статический метод;
            ссылка на метод экземпляра существующего объекта;
            ссылка на метод экземпляра объекта определенного типа;
            ссылка на конструктор.
         */
        Calculator c = LambdaExample::linkOnMethodDemo;
        System.out.println(c.getResult(2, 3));

        Calculator pow = Math::pow;
        System.out.println(pow.getResult(2, 3));
    }

    private static void lambdaDemo(Calculator calculator, double a, double b) {
        System.out.println(calculator.getResult(a, b));
    }

    private static double linkOnMethodDemo(double a, double b) {
        return (a - b) / 2;
    }
}
