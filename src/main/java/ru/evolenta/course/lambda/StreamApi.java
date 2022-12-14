package ru.evolenta.course.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        //источник -> промежуточная операция -> ... промежуточная операция -> терминальная операция
        //пример использования
        {
            List<Integer> numbers = List.of(1, 4, 7, 6, 2, 9, 7, 8);
            //======================================================
            long count = 0;
            for (int number : numbers) {
                if (number > 5) {
                    count++;
                }
            }
            System.out.println(count); // 5
            //======================================================
            count = numbers.stream()
                    .filter(number -> number > 5)
                    .count(); // 5
            //======================================================
            count = numbers.stream()
                    .skip(4)  // skip 1, 4, 7, 6
                    .filter(number -> number > 5)
                    .count();  // 3
        }

        //Создание потока
        {
            //Вызвать метод stream из коллекции
            List<Integer> famousNumbers = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
            Stream<Integer> numbersStream = famousNumbers.stream();

            Set<String> usefulConcepts = Set.of("functions", "lazy", "immutability");
            Stream<String> conceptsStream = usefulConcepts.stream();

            //создание из массива
            Stream<Double> doubleStream = Arrays.stream(new Double[]{ 1.01, 1d, 0.99, 1.02, 1d, 0.99 });

            //Используя метод of
            Stream<String> persons = Stream.of("John", "Demetra", "Cleopatra");

            //слияние потоков
            Stream<String> stream1 = Stream.of(/* some values */);
            Stream<String> stream2 = Stream.of(/* some values */);
            Stream<String> resultStream = Stream.concat(stream1, stream2);

            //создание пустых потоков
            Stream<Integer> empty1 = Stream.of();
            Stream<Integer> empty2 = Stream.empty();

            //также можно создать из файла и других источников
        }

        /*
            Intermediate operations

            filter returns a new stream that includes the elements that match a predicate;
            limit returns a new stream that consists of the first n elements of this stream;
            skip returns a new stream without the first n elements of this stream;
            distinct returns a new stream consisting of only unique elements according to results of equals;
            sorted returns a new stream that includes elements sorted according to the natural order or a given comparator;
            peek returns the same stream of elements but allows observing the current elements of the stream for debugging;
            map returns a new stream that consists of the elements that were obtained by applying a function (i.e. transforming each element).

            Terminal operations

            count returns the number of elements in the stream as a long value;
            max / min returns Optional maximum / minimum element of the stream according to the given comparator;
            reduce combines values from the stream into a single value (an aggregate value);
            findFirst / findAny returns the first / any element of the stream as an Optional;
            anyMatch returns true if at least one element matches a predicate (see also: allMatch, noneMatch);
            forEach takes a consumer and applies it to each element of the stream (for example, printing it);
            collect returns a collection of the values in the stream;
            toArray returns an array of the values in a stream.
         */
    }
}
