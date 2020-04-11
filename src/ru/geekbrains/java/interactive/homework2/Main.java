package ru.geekbrains.java.interactive.homework2;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
// 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("task_1: ");
        for (int i = 0; i < arr1.length; i++ ){
            arr1[i] = (arr1[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr1));

// 2. Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr2 = new int[8];
        System.out.print("task_2: ");
        for (int i = 0; i < arr2.length; i++ ){
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));

// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
//    пройти по нему циклом, и числа, меньшие 6, умножить на 2;
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("task_3: ");
        for(int i = 0; i < arr3.length; i++){
            if(arr3[i] < 6)
            arr3[i] *= 2;
        }
        System.out.println(Arrays.toString(arr3));

// 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int [][] arr4 = new int [5][5];
        System.out.println("task_4: ");
        for(int i = 0; i < arr4.length; i++){
            arr4[i][i] = 1;
            arr4[i][arr4.length - 1 - i] = 1;
            System.out.println(Arrays.toString(arr4[i]));
        }

// 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] arr5 = {10, 50, 35, 24, 15, 44, 75, 32, 14, 8};
        int resultMin = arr5[0];
        int resultMax = arr5[0];
        for (int i = 0; i < arr5.length; i++){
            if(arr5[i] < resultMin)
            resultMin = arr5[i];
        }

        System.out.print("task_5: " + resultMin + " - минимальное число; ");
        for (int i = 0; i < arr5.length; i++){
            if(arr5[i] > resultMax)
            resultMax = arr5[i];
        }
        System.out.print(resultMax + " - максимальное число.");

        int [] checkBalanceArr1 = {1, 1, 1, 2, 1};
        int [] checkBalanceArr2 = {2, 1, 1, 2, 1};
        int [] checkBalanceArr3 = {10, 10};
        System.out.println("\ntask_6: ");
        System.out.println("[1, 1, 1, 2, 1] - " + checkBalance(checkBalanceArr1));
        System.out.println("[1, 1, 1, 2, 1] - " + checkBalance(checkBalanceArr2));
        System.out.println("[10, 10] - " + checkBalance(checkBalanceArr3));
    }

/* 6. Написать метод, в который передается не пустой одномерный целочисленный массив,
 *    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
 *    Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true,
 *    граница показана символами ||, эти символы в массив не входят;
 */
    private static boolean checkBalance(int[] array) {
        int left = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int right = 0;
            left += array[i];
            for (int j = i + 1; j < array.length; j++)
                right += array[j];
            if (left == right) return true;
        }
        return false;
        
    }

}
