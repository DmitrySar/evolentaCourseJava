package ru.evolenta.course.lambda;

import java.util.function.*;

public class StandardFunctionalInterfaces {
    public static void main(String[] args) {
        //Functions
        {
            //Function<T, R> это универсальный интерфейс, представляющий функцию, которая принимает значение типа T и выдает результат типа R.
            //String to Integer function
            Function<String, Integer> converter = Integer::parseInt;
            converter.apply("1000"); // the result is 1000 (Integer)

            // String to int function
            ToIntFunction<String> anotherConverter = Integer::parseInt;
            anotherConverter.applyAsInt("2000"); // the result is 2000 (int)

            // (Integer, Integer) to Integer function
            BiFunction<Integer, Integer, Integer> sumFunction = (a, b) -> a + b;
            sumFunction.apply(2, 3); // it returns 5 (Integer)
        }

        //Operators
        {
            //Каждый оператор принимает и возвращает значения одного и того же типа
            // Long to Long multiplier
            UnaryOperator<Long> longMultiplier = val -> 100_000 * val;
            longMultiplier.apply(2L); // the result is 200_000L (Long)

            // int to int operator
            IntUnaryOperator intMultiplier = val -> 100 * val;
            intMultiplier.applyAsInt(10); // the result is 1000 (int)

            // (String, String) to String operator
            BinaryOperator<String> appender = (str1, str2) -> str1 + str2;
            appender.apply("str1", "str2"); // the result is "str1str2"
        }

        //Predicates
        {
            //Каждый предикат принимает значение в качестве параметра и возвращает значение true или false.
            // Character to boolean predicate
            Predicate<Character> isDigit = Character::isDigit;
            isDigit.test('h'); // the result is false (boolean)

            // int to boolean predicate
            IntPredicate isEven = val -> val % 2 == 0;
            isEven.test(10); // the result is true (boolean)
        }

        //Suppliers
        {
            //Каждый поставщик не принимает никаких параметров и возвращает одно значение
            Supplier<String> stringSupplier = () -> "Hello";
            stringSupplier.get(); // the result is "Hello" (String)

            BooleanSupplier booleanSupplier = () -> true;
            booleanSupplier.getAsBoolean(); // the result is true (boolean)

            IntSupplier intSupplier = () -> 33;
            intSupplier.getAsInt(); // the result is 33 (int)
        }

        //Consumers
        {
            //Каждый потребитель принимает значение в качестве параметра и не возвращает никаких выходных данных.
            Consumer<String> printer = System.out::println;
            printer.accept("!!!"); // It prints "!!!"
        }
    }
}
