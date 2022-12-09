package ru.evolenta.course.collection;

import ru.evolenta.course.oop.Gender;
import ru.evolenta.course.oop.Person;
import ru.evolenta.course.oop.Student;

import java.time.LocalDate;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        //Iterable
        Iterable iterable = List.of(34, 56, 2, 78, -1);

        //Iterator
        Iterator<Integer> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Collection
        Collection collection = List.of(45, -89, 56, 34);
        //collection.add(33); //UnsupportedOperationException
        System.out.println(collection.contains(3));

        //List //ArrayList, LinkedList //set, get, indexOf
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(-1);
        list.add(89);
        list.add(55);
        System.out.println(list.remove(2)); //?
        System.out.println(list);

        ListIterator<Integer> listIterator = list.listIterator(0);
//        System.out.println(listIterator.previous()); //NoSuchElementException
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());

        //Set //TreeSet //HashSet //EnumSet
        Set set = Set.of("i", "a", "r", "w", "-1");
        System.out.println(set); //не гарантирует порядок элементов

        //TreeSet - отсортирован
        Set<Integer> numbersSet = new TreeSet<>();
        numbersSet.add(45);
        numbersSet.add(-23);
        numbersSet.add(99);
        numbersSet.add(99); //хранит только уникальные элементы
        System.out.println(numbersSet);

        EnumSet<WeekDays> workDays = EnumSet.of(WeekDays.MON, WeekDays.TUE, WeekDays.WED, WeekDays.THU, WeekDays.FRI);
        System.out.println(workDays.contains(WeekDays.SUN));

        //Map //HashMap //TreeMap //get, put //Set<K> keySet //Collection<V> values
        Map<String, ? super Person> personsMap = new HashMap<>();
        personsMap.put("one", new Student("Petrov", "Petr", "Petrovich", LocalDate.of(1998, 03, 07), Gender.MALE));
        personsMap.put("two", new Student("Sidorova", "Valeriya", "Olegovna", LocalDate.of(1978, 05, 01), Gender.FEMALE));
        personsMap.put("three", new Student("Abrikosov", "Michael", "Victorovich", LocalDate.of(2001, 01, 02), Gender.MALE));

        System.out.println(personsMap);

        for (Map.Entry studentEntry : personsMap.entrySet()) {
            System.out.printf("%-10s: ", studentEntry.getKey());
            System.out.println(studentEntry.getValue());
        }

        //null
        Map<Integer, String> map = new HashMap<>();
        map.put(null, "abc");

        System.out.println(map.get(null));
        map.put(null, "def");
        System.out.println(map.get(null));

        map.put(null, null);
        map.put(1, null);
        System.out.println(map);

        System.out.println(map.getOrDefault(null, "empty"));
        System.out.println(map.get(2));
        System.out.println(map.getOrDefault(2, "empty"));

        //Для решения проблем с null существуют Optional
        Optional<String> text = Optional.ofNullable(null);
        System.out.println(text.orElse("empty"));
    }

}

enum WeekDays {
    MON, TUE, WED, THU, FRI, SAT, SUN
}
