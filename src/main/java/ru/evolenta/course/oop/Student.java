package ru.evolenta.course.oop;

import java.time.LocalDate;

public class Student extends Person {

    public Student(String lastname, String name, String surname, LocalDate birthday, Gender gender) {
        super(lastname, name, surname, birthday, gender);
    }

    public void calculate (Calculator calculator, double a, double b) {
        System.out.printf("%s результат: %s", this.getLastname(), calculator.getResult(a, b));
    }

}
