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

            filter возвращает новый поток, включающий элементы, соответствующие предикату;
            limit возвращает новый поток, состоящий из первых n элементов этого потока;
            skip возвращает новый поток без первых n элементов этого потока;
            distinct возвращает новый поток, состоящий только из уникальных элементов, в соответствии с результатами equals;
            sorted sorted возвращает новый поток, включающий элементы, отсортированные в соответствии с естественным порядком или заданным компаратором;
            peek возвращает тот же поток элементов, но позволяет наблюдать за текущими элементами потока для отладки;
            map возвращает новый поток, состоящий из элементов, которые были получены путем применения функции (т.е. преобразования каждого элемента).

            Terminal operations

            count возвращает количество элементов в потоке в виде длинного значения;
            max / min возвращает необязательный максимальный /минимальный элемент потока в соответствии с данным компаратором;
            reduce объединяет значения из потока в одно значение (агрегированное значение);
            findFirst / findAny возвращает первый / любой элемент потока в качестве необязательного;
            anyMatch возвращает значение true, если хотя бы один элемент соответствует предикату (см. также: allMatch, noneMatch);
            forEach принимает потребителя и применяет его к каждому элементу потока (например, печатает его);
            collect возвращает коллекцию значений в потоке;
            toArray возвращает массив значений в потоке.
         */
    }
}
