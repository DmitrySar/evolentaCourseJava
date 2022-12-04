package ru.evolenta.course.oop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иванов", "Иван", "Иванович", LocalDate.of(1999, 6, 8), Gender.MALE);
        student.calculate(new Multiply(), 3, 4);
    }
}
