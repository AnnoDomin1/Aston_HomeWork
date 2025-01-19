

public class Lesson3_HomeWork1 {
    public static void main(String[] args) {
        //Задание 1
        printThreeWords();

        //Задание 2
        checkSumSing();

        // Задание 3
        printColor();

        //Задание 4
        compareNumbers();

        //Задание 5
        checkSumSection(12, 4);

        //Задание 6
        positiveOrNegative(0);

        //Задание 7
        positiveOrNegativeBoolean(-293);

        //Задание 8
        printString("Hello world", 5);

        //Задание 9
        leapYear();

        /*Задание 10
        Был массив 1,1,0,0,1,0,1,1,0,0
        после обработки цилком стал
        0,0,1,1,0,1,0,0,1,1
         */

        task10(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});


        //Задание 11
        int[] task11Array = task11();

        /*Задание 12
        Был массив 1,5,3,2,11,4,5,2,4,8,9,1
        после обработки циклом получился следующий массив:
        2,10,6,4,11,8,10,4,8,8,9,2
        */
        int[] task12Array = task12(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        for (int i = 0; i < task12Array.length; i++) {
            System.out.print(task12Array[i] + " ");
        }
        System.out.println();


        /*Задание 13
        В если вывести массив в консоль, у нас получится следующий результат:
        1 0 0 0 1
        0 1 0 1 0
        0 0 1 0 0
        0 1 0 1 0
        1 0 0 0 1
        */
        int[][] task13Array = new int[5][5];
        task13(task13Array);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(task13Array[i][j]);
            }
            System.out.println();
        }
//Задание 14
        arrayMethod(10, 77);
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSing() {
        int a = -10;
        int b = 2;
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 232;
        int b = 1;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    static boolean checkSumSection(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    static void positiveOrNegative(int a) {
        System.out.println(a >= 0 ? "Число положительное" : "Число отрицательное");
    }

    static boolean positiveOrNegativeBoolean(int a) {
        if (a >= 0) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }

    static void printString(String string, int numbers) {
        for (int i = 0; i < numbers; i++) {
            System.out.println(string);
        }
    }

    static boolean leapYear() {
        int year = 283;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    static int[] task10(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    static int[] task11() {
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            array[i - 1] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        return array;
    }

    static int[] task12(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println();
        return array;
    }

    static int[][] task13(int[][] array) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    static int[] arrayMethod(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }
}