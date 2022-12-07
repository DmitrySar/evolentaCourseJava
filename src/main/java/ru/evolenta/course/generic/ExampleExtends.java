package ru.evolenta.course.generic;

import ru.evolenta.course.oop.Gender;
import ru.evolenta.course.oop.Person;
import ru.evolenta.course.oop.Student;

import java.time.LocalDate;

public class ExampleExtends {
    public static void main(String[] args) {
        //type erase
        //rawType
        ArrayDynamic arrayDynamic = new ArrayDynamic();
        //generic
        ArrayDynamic<Person> persons = new ArrayDynamic<>();
        arrayDynamic = persons;
        arrayDynamic.add(22);
        //Person p = persons.get(0); //java.lang.ClassCastException
        //System.out.println(p);

        //don't extends
        ArrayDynamic<Object> objectArray = new ArrayDynamic<>();
        ArrayDynamic<String> stringArray = new ArrayDynamic<>();
        //objectArray = stringArray; //error

        //extends
        class Box <T extends Person> {
            void outName(T person) {
                System.out.println(person.getName());
            }

            <E> void outElement(E element) {
                System.out.println(element.getClass().getName());
            }
        }

        Student student = new Student("Ivanov", "Ivan", "Ivanovich", LocalDate.of(1999, 9, 1), Gender.MALE);
        Box<Student> studentBox = new Box<>();
        studentBox.outName(student);
        studentBox.outElement(student);

        //Student student = new Student("Ivanov", "Ivan", "Ivanovich", LocalDate.of(1999, 9, 1), Gender.MALE);
        persons.add(student);
        System.out.println(persons);

        add(persons, student);
        System.out.println(persons);

        ArrayDynamic<Person> to = new ArrayDynamic<>(); //Student - error
        ArrayDynamic<Student> from = new ArrayDynamic<>();
        from.add(student);
        copy(to, from);
    }

    //Wildcard
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

//    upper bound          ? extends SuperType
    public static Person getByIndex(ArrayDynamic<? extends Person> arrayDynamic, int index) {
        return arrayDynamic.get(index);
    }

//    lower bound          ? super   SubType
    public static void add(ArrayDynamic<? super Person> arrayDynamic, Person person) {
        arrayDynamic.add(person);
    }

    public static void copy(ArrayDynamic<? super Person> to, ArrayDynamic<? extends Person> from) {
        to.add(from.get(0));
        System.out.println(to);
    }

}
