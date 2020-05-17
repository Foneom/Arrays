package ru.foneom.arrayFilling;

/**
 * Сlass fills the array with negative numbers
 */
public class FillArrayNegativeNumbers {
    /**
     * This method fills the array with negative numbers divide by 3
     * @param array
     * @return
     */
    public static int[] fillNegativeNumbersDivide3(int[] array) {
            int result = -1;
            for (int i = 0; i < array.length; i++,result--) {
                    array[i] = result * 3;
                }
            return array;
        }
    /**
     * This method fills the array with negative numbers divide by 4
     * @param array
     * @return
     */
    public static int[] fillNegativeNumbersDivide4(int[] array) {
        int result = -1;
        for (int i = 0; i < array.length; i++,result--) {
            array[i] = result * 4;
        }
        return array;
    }
    }
