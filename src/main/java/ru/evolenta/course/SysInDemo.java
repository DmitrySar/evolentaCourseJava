package ru.evolenta.course;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SysInDemo {
    public static void main(String[] args) throws IOException {

        System.out.println(System.in.read());
        System.out.println((char) System.in.read());

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a + b);
    }
}
