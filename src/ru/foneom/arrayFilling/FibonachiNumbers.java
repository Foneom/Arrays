package ru.foneom.arrayFilling;

/**
 * Class fills the array with Fibonachi numbers
 * @author foneon
 * @since 17.05.2020
 * @version 1
 */
public class FibonachiNumbers {
    /**
     * This method fills the array with Fibonachi numbers
     * @param array
     * @param n
     * @return
     */
    public static int[] fillsFibonachiNumbers(int[] array, int n) {
     for (int i = 2; i < n; i++) {
         array[0] = 0;
         array[1] = 1;
        array[i]= array[i - 1] + array[i - 2];
    }
    return array;
}
}
