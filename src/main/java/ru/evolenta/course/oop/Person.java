package ru.evolenta.course.oop;

import java.time.LocalDate;

public class Person {
    private String lastname;
    private String name;
    private String surname;
    private LocalDate birthday;
    private Gender gender;

    public Person(String lastname, String name, String surname, LocalDate birthday, Gender gender) {
        this.lastname = lastname;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15s%-15s%-15s", lastname, name, surname, birthday, gender);
    }
}
