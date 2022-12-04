package ru.evolenta.course.collection;

public class Main {
    public static void main(String[] args) {
        ArrayDynamic<String> arrayDynamic = new ArrayDynamic<>();
//        arrayDynamic.add(2);
//        arrayDynamic.add(3);
        arrayDynamic.add("any text");
        arrayDynamic.add("demo text");
        System.out.println(arrayDynamic);
        System.out.println(arrayDynamic.get(1).length());
    }
}
