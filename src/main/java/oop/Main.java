package oop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Person p = new Person("Иванов", "Иван", "Иванович", "1999-05-07", "МУЖСКОЙ");
        Person[] people = {
                new Person("Иванов", "Иван", "Иванович", LocalDate.parse("1999-05-07"), Gender.MALE),
                new Person("Иванова", "Иванесса", "Ивановна", LocalDate.parse("1999-05-07"), Gender.FEMALE),
                new Person("Петров", "Пётр", "Петрович", LocalDate.parse("2001-01-02"), Gender.MALE),
                new Person("Калачина", "Лариса", "Олеговна", LocalDate.parse("1989-11-07"), Gender.FEMALE),
                new Person("Иванов", "Иван", "Иванович", LocalDate.parse("2017-05-07"), Gender.MALE),
        };

        for (Person p : people) {
            if (p.getGender().equals(Gender.MALE) && LocalDate.now().getYear() - p.getBirthday().getYear() >= 18) {
                System.out.println(p);
            }
        }

        Calculator calculator = new Calculator();
        System.out.println(9 / 7);
    }
}
