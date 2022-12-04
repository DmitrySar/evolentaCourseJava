package ru.evolenta.course.collection;

public class Main {
    public static void main(String[] args) {
        ArrayDynamic arrayDynamic = new ArrayDynamic();
        arrayDynamic.add(2);
        arrayDynamic.add(3);
        arrayDynamic.add("any text");
        arrayDynamic.remove(0);
        System.out.println(arrayDynamic);
    }
}
