package ru.evolenta.course.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class FunctionComposition {
    public static void main(String[] args) {
        //Composing functions
        {
            //Функция функционального интерфейса<T, R> имеет два метода по умолчанию
            // compose и andThen для создания новых функций.
            // Основное различие между этими методами заключается в порядке выполнения.
            //
            //Как правило, f.compose(g).apply(x) совпадает с f(g(x)), а f.andThen(g).apply(x) совпадает с g(f(x)).

            Function<Integer, Integer> adder = x -> x + 10;
            Function<Integer, Integer> multiplier = x -> x * 5;

            // compose: adder(multiplier(5))
            System.out.println("result: " + adder.compose(multiplier).apply(5));

            // andThen: multiplier(adder(5))
            System.out.println("result: " + adder.andThen(multiplier).apply(5));
        }

        //Composing predicates
        {
            //Все функциональные интерфейсы, представляющие предикаты (Predicate<T>, IntPredicate и другие),
            // имеют три метода для составления новых предикатов: and, or и negate.
            IntPredicate isOdd = n -> n % 2 != 0; // it's true for 1, 3, 5, 7, 9, 11 and so on
            IntPredicate lessThan11 = n -> n < 11; // it's true for all numbers < 11

            IntPredicate isEven = isOdd.negate(); // it's true for 0, 2, 4, 6, 8, 10 and so on
            System.out.println(isEven.test(10)); // prints "true"
            System.out.println(isEven.test(11)); // prints "false"


            //эти методы эквивалентны логическим операторам && и ||, но они работают с функциями, а не с их значениями.
            IntPredicate isOddOrLessThan11 = isOdd.or(lessThan11);

            System.out.println(isOddOrLessThan11.test(10)); // prints "true"
            System.out.println(isOddOrLessThan11.test(11)); // prints "true"
            System.out.println(isOddOrLessThan11.test(12)); // prints "false"
            System.out.println(isOddOrLessThan11.test(13)); // prints "true"

            IntPredicate isOddAndLessThan11 = isOdd.and(lessThan11);

            System.out.println(isOddAndLessThan11.test(8));  // prints "false"
            System.out.println(isOddAndLessThan11.test(9));  // prints "true"
            System.out.println(isOddAndLessThan11.test(10)); // prints "false"
            System.out.println(isOddAndLessThan11.test(11)); // prints "false"

        }

        //Composing consumers
        {
            Consumer<String> consumer = System.out::println;
            Consumer<String> doubleConsumer = consumer.andThen(System.out::println);
            doubleConsumer.accept("Hi!");
        }
    }
}
