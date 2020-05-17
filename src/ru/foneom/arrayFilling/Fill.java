package ru.foneom.arrayFilling;

/**
 * Class Fill fills array in different order"
 * @author foneom
 * @since 15.05.2020
 * @version 1
 *
 */
public class Fill {
    /**
     * This method fills array zero and one numbers.
     * 1 - first and last element of array
     * 0 - other elements of array
     *
     * @param array
     * @return
     */
    public static int[] oneFirstAndLastElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[0] = 1;
            array[array.length - 1] = 1;
        }
        return array;
    }
    /**
     * This method fills the array with zero and one numbers
     * 1 after 0
     *
     * @param array
     * @return
     */
    public static int[] oneAfterZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        return array;
    }
}
