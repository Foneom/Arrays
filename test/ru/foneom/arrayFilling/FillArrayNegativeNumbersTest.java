package ru.foneom.arrayFilling;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FillArrayNegativeNumbersTest {

    @Test
    public void whenNegativeNumbersDivide3() {
        int[] input = new int[4];
        int[] result = FillArrayNegativeNumbers.fillNegativeNumbersDivide3(input);
        int[] expect = new int[]{-3, -6, -9, -12};
        assertThat(result, is(expect));
    }
    @Test
    public void whenNegativeNumbersDivide4() {
        int[] input = new int[4];
        int[] result = FillArrayNegativeNumbers.fillNegativeNumbersDivide4(input);
        int[] expect = new int[]{-4, -8, -12, -16};
        assertThat(result, is(expect));
    }
}