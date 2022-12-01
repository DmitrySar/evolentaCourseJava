package oop;

public class Main {
    public static void main(String[] args) {
        //Person p = new Person("Иванов", "Иван", "Иванович", "1999-05-07", "МУЖСКОЙ");
        Person[] people = {
                new Person("Иванов", "Иван", "Иванович", "1999-05-07", "МУЖСКОЙ"),
                new Person("Иванова", "Иванесса", "Ивановна", "1999-05-07", "ЖЕНСКИЙ"),
                new Person("Петров", "Пётр", "Петрович", "2001-01-02", "МУЖСКОЙ"),
                new Person("Калачина", "Лариса", "Олеговна", "1989-11-07", "ЖЕНСКИЙ"),
                new Person("Иванов", "Иван", "Иванович", "1999-05-07", "МУЖСКОЙ"),
        };

        for (Person p : people) {
            if (p.getGender().equals("МУЖСКОЙ")) {
                System.out.println(p);
            }
        }
    }
}
