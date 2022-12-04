package ru.evolenta.course.elementary;

public class SwitchDemo {
    public static void main(String[] args) {
        int a = 5;
        //==============1================
        switch (a) {
            case 3,7:
                System.out.println("3,7");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("default");
        }
        //==============2================
        String res = switch (a) {
            case 3, 7: yield "qqq";
            default: yield "default";
        };
        System.out.println(res);
        //==============3================
        res = switch (3) {
            case 3, 7 -> "3,7";
            case 5 -> "5";
            default -> "default";
        };
        System.out.println(res);
        //==============4================
        System.out.println(switchShow(3));

    }

    private static String switchShow(int number) {
        switch (number) {
            case 3: return "3";
            case 7: return "7";
            case 5: return "5";
            default: return "default";
        }
    }
}
