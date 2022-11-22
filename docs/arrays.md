# *Массивы*
 * ссылочный тип

| Заголовок     | Длина | 0   | 1   | 2   | 3   | 4    | 5     |
|---------------|-------|-----|-----|-----|-----|------|-------|
| int[] numbers | 6     | 22  | 33  | -1  | 31  | 28   | 33    |

## Создание массива

```java
int[] numbers = new int[10];

int[] arrayWithValue = {22, 33, -33};

int[] initArray = new int[]{66, 44, -1};

int[] emptyArray = new int[0];

int[][] tableArray = new int[3][5];

int[][] initTableArray = {{1}, {2, 2}, {3, 3, 3}};
```

## Вывод массива

```java
class Scratch {
    public static void main(String[] args) {
        int[] numbers = {22, 33, 11, -34};
        System.out.printf("|%5s|%5s|%-5s|%-5s|\n", numbers[0], numbers[1], numbers[2], numbers[3]);
        System.out.println("\n=========================");
        numbers[1] += 44;
        System.out.print((char)27 + "[33m" + (char)27 + "[44m" + numbers[1] + (char)27 + "[0m");
        System.out.println("\n=========================");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n=========================");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("\n=========================");
        System.out.print(Arrays.toString(numbers));
    }
}
```
