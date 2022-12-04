package ru.evolenta.course.elementary;

import java.util.Arrays;

public class ArraysDemo {
    int[] ints = new int[10];
    int[] initialized = new int[]{1, 2, 3, 4, 5};
    int[] simpler = {1, 2, 3, 4, 5};
    int[] empty = new int[0];
    int[][] table = new int[2][5];
    int[][] initializedTable = {{1,2,3},{4,5},{6}};

    public static void main(String[] args) {
        int[] ints = {1,2,3,2,1};
        System.out.println(ints.length);
        System.out.println(ints[0]);
        ints[1] += 1;
        ints[10] = 10; // ArrayIndexOutOfBoundsException
        int[] copy = ints.clone();
        System.out.println(ints == copy); // false
        System.out.println(ints.equals(copy)); // false
        System.out.println(Arrays.equals(ints, copy)); // true
        System.out.println(ints); // [I@3cb5cdba
        System.out.println(Arrays.toString(ints)); // [1, 3, 3, 2, 1]
        Arrays.sort(ints);
    }
}
