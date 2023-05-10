package ru.evolenta.course.algorithm;

import java.util.Arrays;

//Быстрая сортировка
public class QuickSorter {
    public int[] sort(int[] numbers) {
        //Если длина меньше 2, возвращаем массив
        if (numbers.length < 2) {
            return numbers.clone();
        }
        int[] result = new int[numbers.length];
        //Если длина равна 2, сортируем и возвращаем массив
        if (numbers.length == 2) {
            result[0] = Math.min(numbers[0], numbers[1]);
            result[1] = Math.max(numbers[0], numbers[1]);
            return result;
        }
        //Если длина больше 2-х
        else {
            //делим пополам
            int avgIndex = numbers.length / 2;
            //берём элемент посредине
            int avg = numbers[avgIndex];
            int leftIndex = 0;
            int rightIndex = numbers.length - 1;
            //в левую часть переносим элементы меньше выбранного, остальные в правую
            for (int i = 0; i < numbers.length; i++) {
                if (i == avgIndex) continue;
                if (numbers[i] < avg) {
                    result[leftIndex++] = numbers[i];
                } else {
                    result[rightIndex--] = numbers[i];
                }
            }
            //кладём выбранный элемент в результирующий массив
            result[leftIndex] = avg;
            //рекурсивно сортируем левую и правую части
            int[] left = sort(Arrays.copyOfRange(result,0, leftIndex));
            int[] right = sort(Arrays.copyOfRange(result, rightIndex, result.length));
            int i;
            //собираем отсортированные части и выбранный элемент в массив
            for (i = 0; i < left.length; i++) {
                result[i] = left[i];
            }
            for (int j : right) {
                result[i++] = j;
            }
        }
        return result;
    }
}
