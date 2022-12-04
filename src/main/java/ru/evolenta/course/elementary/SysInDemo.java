package ru.evolenta.course.elementary;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class SysInDemo {
    public static void main(String[] args) throws IOException {

//        System.out.println(System.in.read());
//        System.out.println((char) System.in.read());

        Scanner in = new Scanner(System.in);

        System.out.print("строка: ");
        System.out.println(in.nextLine());

        System.out.print("слово: ");
        System.out.println(in.next());

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a + b);

        in.useLocale(Locale.ENGLISH);
        double dbl = in.nextDouble();

        in.useRadix(16);
        int n = in.nextInt();
        System.out.println(n);
    }
}
