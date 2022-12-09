## Форматированный вывод в консоль

[javarush](https://javarush.com/groups/posts/1412-formatiruem-vihvod-chisel-v-java)

## Цветной вывод в консоль
[stackoverflow](https://stackoverflow.com/questions/1448858/how-to-color-system-out-println-output)

```java
System.out.println((char)27 + "[33mYELLOW");
```
| fg  | bg  | color   |
|-----|-----|---------|
| 30  | 40  | black   |
| 31  | 41  | red     |
| 32  | 42  | green   |
| 33  | 43  | yellow  |
| 34  | 44  | blue    |
| 35  | 45  | magenta |
| 36  | 46  | cyan    |
| 37  | 47  | white   |
| 39  | 49  | default |

|  n  |  effect          |
|-----|------------------|
|  0  |  reset           |
|  1  |  bold            |
|  2  |  faint*          |
|  3  |  italic**        |
|  4  |  underline       |
|  5  |  slow blink      |
|  6  |  rapid blink*    |
|  7  |  inverse         |
|  8  |  conceal*        |
|  9  |  strikethrough*  |
