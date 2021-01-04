package ru.geekbrains.Homework2M;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillArrayDiagonal();
        searchMinMax();
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr));
        int[] arrNew = {3, 2, 7, 1, 0, 4, 5, 3, 8};
        displaceArray(arrNew, 5);


    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("1. Массив до изменений:    " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
        System.out.println("   Массив после изменений: " + Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 0; i < arr.length - 1; i++)
            arr[i + 1] = arr[i] + 3;

        System.out.println("2. Результат:  " + Arrays.toString(arr));
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3. Массив до изменений:    " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
        }
        System.out.println("   Массив после изменений: " + Arrays.toString(arr));

    }

    public static void fillArrayDiagonal() {
        int[][] squareArr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == j) || (i + j) == squareArr.length - 1)
                    squareArr[i][j] = 1;
            }
        }
        System.out.println("4. Результат:");
        System.out.println(Arrays.toString(squareArr[0]));
        System.out.println(Arrays.toString(squareArr[1]));
        System.out.println(Arrays.toString(squareArr[2]));
        System.out.println(Arrays.toString(squareArr[3]));
        System.out.println(Arrays.toString(squareArr[4]));

    }

    public static void searchMinMax() {
        int[] arr = {2, -1, 5, 7, 12, -3, 3, 15, 16};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max)
                max = arr[i];
            else if (arr[i] < min)
                min = arr[i];

        }
        System.out.println("5. Для массива: " + Arrays.toString(arr));
        System.out.println("Минимальный элемент: " + min + ". Максимальный элемент: " + max + ".");

    }

    public static boolean checkBalance(int[] array) {
        boolean boo = false;
        System.out.print("6. Результат для массива: " + Arrays.toString(array) + "  ");
        for (int i = 0; i < (array.length - 1); i++) {
            int sumLeft = 0;
            for (int ii = 0; ii <= i; ii++) {
                sumLeft = sumLeft + array[ii];
            }
            int sumRight = 0;
            for (int j = i + 1; j < array.length; j++) {
                sumRight = sumRight + array[j];
            }
            if (sumLeft == sumRight) {
                boo = true;
                break;
            }

        }

        return boo;
    }

    public static void displaceArray(int[] array, int n) {
        int[] arrayChanged = new int[9];
        System.out.println("7. Массив до изменений:      " + Arrays.toString(array));
        for (int i = n; i < array.length; i++) {
            arrayChanged[i] = array[i - n];
        }
        for (int i = 0; i < n; i++) {
            arrayChanged[i] = array[(array.length - n + i)];
        }

        System.out.println("Результат смещения в массиве:" + Arrays.toString(arrayChanged));
    }

}
