package ru.foneom.arrayFilling;

/**
 * Class fills the array odd and even numbers
 * @author foneom
 * @since 17.05.2020
 * @version 1
 */
public class FillOddAndEven {
    /**
     * This method fills the array with odd numbers
     *
     * @param array
     * @return
     */
    public static int[] fillOddNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (2 * i) + 1;
        }
        return array;
    }
    /**
     * This method fills the array with even numbers
     *
     * @param array
     * @return
     */
    public static int[] fillEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i;
        }
        return array;
    }
}
