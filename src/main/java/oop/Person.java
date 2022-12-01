package oop;

public class Person {
    private String lastname;
    private String name;
    private String surname;
    private String birthday;
    private String gender;

    public Person(String lastname, String name, String surname, String birthday, String gender) {
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

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15s%-15s%-15s", lastname, name, surname, birthday, gender);
    }
}
