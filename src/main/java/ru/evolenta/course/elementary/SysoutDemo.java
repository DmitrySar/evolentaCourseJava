package ru.evolenta.course.elementary;

import java.io.IOException;
import java.util.stream.IntStream;

/*
    Windows>Preferences and Run/Debug > Console and select Interpret ASCII control characteres to enabled it
 */
public class SysoutDemo {
    public static void main(String[] args) {
        //вывод без переноса курсора на новую строку
        System.out.print("abc");
        System.out.print("def");

        //вывод с переносом курсора на новую строку
        System.out.println("abc");
        System.out.println("def");

        System.err.println("error message");

        /*
            форматированный вывод
            https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
         */
        System.out.printf("%s %d %.2f\n", "sss", 22, 3.14159265);

        //Выравнивание
        System.out.printf("|%-2s|%-10s|%-50s|\n", 1, "ФИО", "Иванов Иван Иванович");

        //лайфхак, вывод в цвете
        System.out.print((char)27 + "[31m" + (char)27 + "[44m" + " Вывод в цвете " + (char)27 + "[0m\n");

        //вывод юникод символов https://unicode-table.com/ru/
        System.out.println('\u26C4');

        System.out.println("\uD83C\uDF66");

        System.out.println("⛄");
    }
}
