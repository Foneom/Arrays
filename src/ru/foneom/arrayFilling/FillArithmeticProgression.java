package ru.foneom.arrayFilling;

/**
 * Class fills the array with numbers of arithmetic progression
 * @author foneom
 * @since 17.05.2020
 * @version 1
 */

public class FillArithmeticProgression {
    /**
     * This method fills the array with numbers of arithmetic progression
     * @param array
     * @return
     */
    public static int[] fillArithmeticProgression(int[] array, int d) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + i * d;
        }
        return array;
    }
}
