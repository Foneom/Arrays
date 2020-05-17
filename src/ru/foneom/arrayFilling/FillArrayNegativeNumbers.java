package ru.foneom.arrayFilling;

/**
 * Сlass fills the array with negative numbers
 */
public class FillArrayNegativeNumbers {

    public static int[] fillNegativeNumbersDivide3(int[] array) {
            int result = -1;
            for (int i = 0; i < array.length; i++,result--) {
                    array[i] = result * 3;
                }
            return array;
        }
    }
