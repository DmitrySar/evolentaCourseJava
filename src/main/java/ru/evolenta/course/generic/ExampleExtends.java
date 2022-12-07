package ru.evolenta.course.generic;

import ru.evolenta.course.oop.Gender;
import ru.evolenta.course.oop.Person;
import ru.evolenta.course.oop.Student;

import java.time.LocalDate;

public class ExampleExtends {
    public static void main(String[] args) {
        ArrayDynamic<Person> persons = new ArrayDynamic<>();
        Student student = new Student("Ivanov", "Ivan", "Ivanovich", LocalDate.of(1999, 9, 1), Gender.MALE);
        persons.add(student);
        System.out.println(persons);

        add(persons, student);
        System.out.println(persons);
    }

    //PECS (producer - extends, consumer - super)
/*

    public static void out(ArrayDynamic<? extends Person> arrayDynamic) {
        arrayDynamic.add(arrayDynamic.get(0));
        System.out.println(arrayDynamic);
    }

*/
/*

    public static void out(ArrayDynamic<? super Person> arrayDynamic) {
        arrayDynamic.add(arrayDynamic.get(0));
        System.out.println(arrayDynamic);
    }

*/

    public static Person getByIndex(ArrayDynamic<? extends Person> arrayDynamic, int index) {
        return arrayDynamic.get(index);
    }

    public static void add(ArrayDynamic<? super Person> arrayDynamic, Person person) {
        arrayDynamic.add(person);
    }

}
