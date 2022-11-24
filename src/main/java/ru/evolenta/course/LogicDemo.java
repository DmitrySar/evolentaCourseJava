package ru.evolenta.course;

public class LogicDemo {
    public static void main(String[] args) {
        // & | ^ != ==
        System.out.println("true & false: " + (true & false));
        System.out.println("true != false: " + (true != false));
        System.out.println("true ^ false: " + (true ^ false));

        // && || - сокращённая
        String text = null;
        if (text != null && !text.isEmpty()) {
            System.out.println(text);
        }

        // >> << >>> - побитовые сдвиги
        System.out.println(Integer.toBinaryString(0b1110 >> 1));
        System.out.println(0b1110 + " " + (0b1110 >> 1));
        System.out.println(Integer.toBinaryString(0b0111 << 1));
        System.out.println(0b0111 + " " + (0b0111 << 1));

        System.out.println(1 >>> 1);
        System.out.println(-1 >>> 1);

        // & | ~ - побитовые операции
        System.out.println(Integer.toBinaryString(~0b010101));
        System.out.println(15 & 1);
        System.out.println(14 & 1);
    }
}
