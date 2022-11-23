package ru.evolenta.course;

import java.util.Random;

public class FlowControlDemo {
    public static void main(String[] args) throws InterruptedException {
        Random rnd = new Random();
        //условный оператор
        if (rnd.nextBoolean()) {
            System.out.println("✅");
        } else {
            System.out.println("❌");
        }

        //цикл while
        boolean key = true;
        while (key) {
            System.out.println(rnd.nextInt(7));
            key = rnd.nextBoolean();
        }

        //for break continue
        for (int a = 0, b = 10; a < b; a++, b--) {
            System.out.printf("a: %s\tb: %s\n", a, b);
        }

        String text = "1 2 4 9 9";
        LABEL:
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != '4') {
                continue;
            }
            System.out.println("calculate ...");
            if (text.charAt(i) == '4') {
                System.out.println("find four");
                break LABEL;
            }
        }


        //пример использования
        int n = 0;
        do {
            System.out.print("[");
            for (int i = 0; i < n; i++) {
                System.out.print("=");
            }
            for (int i = 0; i < 10 - n; i++) {
                System.out.print(" ");
            }
            System.out.print("]\r");
            n = n == 10 ? 0 : ++n;
            Thread.sleep(500);
        } while (true);
    }
}
